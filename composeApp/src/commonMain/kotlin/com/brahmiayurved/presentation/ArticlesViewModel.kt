package com.brahmiayurved.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brahmiayurved.data.repository.BaseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class ArticlesViewModel(
    private val repository: BaseRepository
) : ViewModel() {

    private val _articlesState = MutableStateFlow<ArticleState>(ArticleState.Loading)
    val articlesState: StateFlow<ArticleState> = _articlesState

    init {
        loadArticles()
    }

    fun loadArticles() {
        viewModelScope.launch {
            _articlesState.value = ArticleState.Loading
            repository.getArticles()
                .catch { exception ->
                    _articlesState.value = ArticleState.Error(
                        exception.message ?: "Unknown error occurred"
                    )
                }
                .collectLatest { articles ->
                    _articlesState.value = ArticleState.Success(articles)
                }
        }
    }
}

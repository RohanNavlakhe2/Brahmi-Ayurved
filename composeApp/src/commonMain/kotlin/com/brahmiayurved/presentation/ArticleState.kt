package com.brahmiayurved.presentation

import com.brahmiayurved.data.model.Article

sealed class ArticleState {
    object Loading : ArticleState()
    data class Success(val articles: List<Article>) : ArticleState()
    data class Error(val message: String) : ArticleState()
}

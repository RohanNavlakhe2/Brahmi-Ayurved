package com.brahmiayurved.data.repository

import com.brahmiayurved.data.model.Article
import kotlinx.coroutines.flow.Flow

interface BaseRepository {
    fun getArticles(): Flow<List<Article>>
}

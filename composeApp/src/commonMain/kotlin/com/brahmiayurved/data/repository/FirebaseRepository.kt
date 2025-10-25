package com.brahmiayurved.data.repository

import com.brahmiayurved.data.model.Article
import dev.gitlive.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class FirebaseRepository(
    private val firestore: FirebaseFirestore
) : BaseRepository {

    override fun getArticles(): Flow<List<Article>> = flow {
        try {
            //emit(emptyList()) // Emit empty list initially

            val articlesCollection = firestore.collection("Articles")
            val querySnapshot = articlesCollection.get()

            val articles = querySnapshot.documents.map { document ->
                Article(
                    title = document.get("title") as? String ?: "",
                    subTitle = document.get("subTitle") as? String ?: "",
                    articleLink = document.get("articleLink") as? String ?: ""
                )
            }

            emit(articles)
        } catch (e: Exception) {
            // Emit empty list on error to prevent crashes
            //emit(emptyList())
            throw e
        }
    }
}

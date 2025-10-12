package com.brahmiayurved

import android.content.Context
import android.content.Intent
import android.net.Uri

// Store context reference for potential future use
private var appContext: Context? = null

fun setAppContext(context: Context) {
    appContext = context
}

actual fun openUrl(url: String) {
    appContext?.let { context ->
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            // Handle error - could not open URL
            e.printStackTrace()
        }
    } ?: run {
        // Context not set, this shouldn't happen in normal flow
        println("Error: App context not set for URL opening")
    }
}

actual fun openDialer(phoneNumber: String) {
    appContext?.let { context ->
        try {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber")).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            // Handle error - could not open dialer
            e.printStackTrace()
        }
    } ?: run {
        // Context not set, this shouldn't happen in normal flow
        println("Error: App context not set for dialer opening")
    }
}

actual fun openEmail(emailAddress: String) {
    appContext?.let { context ->
        try {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$emailAddress")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            // Handle error - could not open email app
            e.printStackTrace()
        }
    } ?: run {
        // Context not set, this shouldn't happen in normal flow
        println("Error: App context not set for email opening")
    }
}

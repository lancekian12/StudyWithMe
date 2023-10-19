package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class FilipinoVideoTopic : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filipino_video_topic)
        val webView = findViewById<WebView>(R.id.wvVideo)
        webView.settings.javaScriptEnabled = true // Enable JavaScript for YouTube embeds
        webView.webViewClient = WebViewClient() // Open links within the WebView

        val youtubeEmbedUrl = "https://www.youtube.com/watch?v=XJ73KsDlMlU"
        webView.loadUrl(youtubeEmbedUrl)
    }
}
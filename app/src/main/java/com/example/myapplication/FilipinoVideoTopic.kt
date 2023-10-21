package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView

class FilipinoVideoTopic : AppCompatActivity() {
    private lateinit var getVideo : ArrayList<DataClassVideo>
    private lateinit var topic : TextView
    private lateinit var title : TextView
    private lateinit var youtubeEmbedUrl : String
    private lateinit var vidDescription : TextView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filipino_video_topic)
        getVideo = FilipinoVideoRepository.getVideo()
        topic = findViewById(R.id.tvTopic)
        title = findViewById(R.id.tvTitle)
        vidDescription = findViewById(R.id.tvDescriptionTwo)

        val webView = findViewById<WebView>(R.id.wvVideo)
        webView.settings.javaScriptEnabled = true // Enable JavaScript for YouTube embeds
        webView.webViewClient = WebViewClient() // Open links within the WebView

        val youtubeEmbedUrl = "https://www.youtube.com/watch?v=XJ73KsDlMlU"
        webView.loadUrl(youtubeEmbedUrl)
    }
    private fun displayTitleDescription(position: Int) {
        val currentTitleDescription = getVideo[position]
        topic.text = currentTitleDescription.topic
        title.text = currentTitleDescription.title
        youtubeEmbedUrl = currentTitleDescription.youtubeVideo
        vidDescription.text = currentTitleDescription.vidDescription
    }
}
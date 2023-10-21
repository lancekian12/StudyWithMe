package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.webkit.WebView
import android.view.ViewGroup
import android.widget.TextView


class HomeFragment : Fragment() {
    @SuppressLint("SetJavaScriptEnabled", "MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val webView = view.findViewById<WebView>(R.id.youtubeVideo)
        val webView2 = view.findViewById<WebView>(R.id.youtubeVideoTwo)
        val webView3 = view.findViewById<WebView>(R.id.youtubeVideoThree)
        val webView4 = view.findViewById<WebView>(R.id.youtubeVideoFour)
        val webView5 = view.findViewById<WebView>(R.id.youtubeVideoFive)
        val moreDetails = view.findViewById<TextView>(R.id.tvMoreSubjects)

        moreDetails.setOnClickListener {
            val intent = Intent(requireContext(), SubjectsFragment::class.java)
            startActivity(intent)
        }
        // VIDEO ONE

        val videoUrl = "https://www.youtube.com/watch?v=URUJD5NEXC8"
        val youtubeVideoId = extractVideoId(videoUrl)
        val embedUrl = "https://www.youtube.com/embed/$youtubeVideoId"
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(embedUrl)

        // VIDEO TWO

        val videoUrl2 = "https://www.youtube.com/watch?v=4682ZMbro8Y"
        val youtubeVideoId2 = extractVideoId(videoUrl2)
        val embedUrl2 = "https://www.youtube.com/embed/$youtubeVideoId2"
        webView2.settings.javaScriptEnabled = true
        webView2.loadUrl(embedUrl2)

        // VIDEO THREE

        val videoUrl3 = "https://www.youtube.com/watch?v=lGfsp2CWjok"
        val youtubeVideoId3 = extractVideoId(videoUrl3)
        val embedUrl3 = "https://www.youtube.com/embed/$youtubeVideoId3"
        webView3.settings.javaScriptEnabled = true
        webView3.loadUrl(embedUrl3)

        // VIDEO FOUR

        val videoUrl4 = "https://www.youtube.com/watch?v=sYDtQVGAj4s"
        val youtubeVideoId4 = extractVideoId(videoUrl4)
        val embedUrl4 = "https://www.youtube.com/embed/$youtubeVideoId4"
        webView4.settings.javaScriptEnabled = true
        webView4.loadUrl(embedUrl4)

        // VIDEO FIVE

        val videoUrl5 = "https://www.youtube.com/watch?v=936XF1EBjLA"
        val youtubeVideoId5 = extractVideoId(videoUrl5)
        val embedUrl5 = "https://www.youtube.com/embed/$youtubeVideoId5"
        webView5.settings.javaScriptEnabled = true
        webView5.loadUrl(embedUrl5)

        return view
    }

    private fun extractVideoId(videoUrl: String): String {
        // Extract the YouTube video ID from the URL
        val pattern = "v=([A-Za-z0-9_-]+)".toRegex()
        val matchResult = pattern.find(videoUrl)
        return matchResult?.groupValues?.get(1) ?: ""
    }
}
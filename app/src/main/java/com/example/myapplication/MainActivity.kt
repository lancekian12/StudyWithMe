package com.example.myapplication

import android.annotation.SuppressLint
import android.widget.Button
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var buttonAnimation: LottieAnimationView
    private lateinit var button_text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<RelativeLayout>(R.id.btnContinue)
        buttonAnimation = findViewById(R.id.button_animation)
        button_text = findViewById(R.id.button_text)

        next.setOnClickListener {
            buttonAnimation.visibility = View.VISIBLE
            buttonAnimation.playAnimation()
            button_text.visibility = View.INVISIBLE

            // Disable the button while the animation is playing
            next.isEnabled = false

            // Handler to re-enable the button after the animation is finished
            Handler(Looper.getMainLooper()).postDelayed({
                buttonAnimation.pauseAnimation()
                buttonAnimation.visibility = View.INVISIBLE
                next.isEnabled = true
                val intent = Intent(this,NoteList::class.java)
                startActivity(intent)
                button_text.visibility = View.VISIBLE
            }, 1000)
        }
    }
}


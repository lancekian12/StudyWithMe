package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TryAgain : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_try_again)
        val extra = intent.getIntExtra("Correct",0)
        val tryagain = findViewById<Button>(R.id.btnTryAgain)
        val score = findViewById<TextView>(R.id.tvScore)
        score.text = "Your Score is $extra out of 5"
        tryagain.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
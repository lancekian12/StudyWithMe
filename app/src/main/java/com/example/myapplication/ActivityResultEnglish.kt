package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class ActivityResultEnglish : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_english)
        val extra = intent.getIntExtra("Correct",0)
        val totalQuiz = intent.getIntExtra("totalQuiz",0)
        val next = findViewById<Button>(R.id.btnTryAgain)
        val score = findViewById<TextView>(R.id.tvScore)
        Log.i("Total", "$extra")
        score.text = "Your Score is $extra out of 5"
        val total = totalQuiz + extra
        Log.i("Total", "$total")
        next.setOnClickListener{
            if (total >=18){
                val intent = Intent(this,EnglishTopicQuiz::class.java)
                startActivity(intent)
            }else{
                val intent = Intent(this,EnglishTopic::class.java)
                intent.putExtra("Score", total)
                startActivity(intent)
            }
        }
    }
}
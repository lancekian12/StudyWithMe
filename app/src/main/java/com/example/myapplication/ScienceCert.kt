package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.R
import org.w3c.dom.Text

class ScienceCert : AppCompatActivity() {
    private lateinit var tvFeedback: TextView
    private lateinit var rbStars: RatingBar
    private lateinit var editText: EditText

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_science_cert)

        val getFullName = intent.getStringExtra("FullName")
        val btnSend = findViewById<Button>(R.id.btnSend)
        val fullNameOne = findViewById<TextView>(R.id.tvFullName)
        val fullNameTwo = findViewById<TextView>(R.id.tvFullName2)
        fullNameOne.text = getFullName.toString()
        fullNameTwo.text = getFullName.toString()

        tvFeedback = findViewById(R.id.tvFeedback)
        rbStars = findViewById(R.id.rbStars)
        editText = findViewById(R.id.editText)

        rbStars.setOnRatingBarChangeListener { _, rating, _ ->
            when (rating.toInt()) {
                0 -> tvFeedback.text = "Very Dissatisfied"
                1 -> tvFeedback.text = "Dissatisfied"
                2 -> tvFeedback.text = "OKAY"
                3 -> tvFeedback.text = "GOOD"
                4 -> tvFeedback.text = "VERY GOOD"
                5 -> tvFeedback.text = "Very Satisfied"

                else -> {
                }
            }
        }

        btnSend.setOnClickListener {
            // Show a toast when the button is clicked
            Toast.makeText(this, "Thank you for your Feedback!", Toast.LENGTH_SHORT).show()

            // Clear the EditText
            editText.text.clear()

            // Reset the star rating to 0 (or any other initial value)
            rbStars.rating = 0.0f
        }
    }
}
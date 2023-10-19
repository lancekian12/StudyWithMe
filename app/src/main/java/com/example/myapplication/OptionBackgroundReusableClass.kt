package com.example.myapplication

import android.content.Context
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

open class OptionBackgroundReusableClass(private val context: Context) {
    fun resetOptionView(option1: CardView, option2: CardView, option3: CardView, option4: CardView) {
        option1.background = ContextCompat.getDrawable(context, R.drawable.choices_background)
        option2.background = ContextCompat.getDrawable(context, R.drawable.choices_background)
        option3.background = ContextCompat.getDrawable(context, R.drawable.choices_background)
        option4.background = ContextCompat.getDrawable(context, R.drawable.choices_background)
    }
}
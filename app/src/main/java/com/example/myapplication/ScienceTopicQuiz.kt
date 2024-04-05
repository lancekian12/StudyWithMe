package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.airbnb.lottie.LottieAnimationView

class ScienceTopicQuiz : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private lateinit var tvQuestion: TextView
    private lateinit var optionOne: TextView
    private lateinit var optionTwo: TextView
    private lateinit var optionThree: TextView
    private lateinit var optionFour: TextView
    private lateinit var checkButton: RelativeLayout
    private lateinit var cvFirstChoice: CardView
    private lateinit var cvSecondChoice: CardView
    private lateinit var cvThirdChoice: CardView
    private lateinit var cvFourthChoice: CardView
    private lateinit var resetBackground: OptionBackgroundReusableClass
    private lateinit var ivA: ImageView
    private lateinit var ivB: ImageView
    private lateinit var ivC: ImageView
    private lateinit var ivD: ImageView
    private var selectedOption: Int = 0
    private var numberOfCorrects: Int = 0
    private var isAnswerRevealed: Boolean = false
    private lateinit var timer: TextView
    private lateinit var numberOfQuestion: TextView
    private lateinit var buttonAnimation: LottieAnimationView
    private lateinit var button_text: TextView
    private lateinit var originalButtonText: CharSequence // Store original button text here
    private lateinit var backButton : ImageView
    private var total = 0
    private var  startingPosition1 = 5
    private var  startingPosition2 = 10
    private var  startingPosition3 = 15
    private var  startingPosition4 = 20
    private var countdownTimer: CountDownTimer? = null
    private lateinit var originalDrawableA: Drawable
    private lateinit var originalDrawableB: Drawable
    private lateinit var originalDrawableC: Drawable
    private lateinit var originalDrawableD: Drawable
    private lateinit var topic : TextView
    private val questionList: ArrayList<DataClassQuestionAnswer> = ScienceQuestionRepository.getQuestion()
    private var currentQuestionIndex: Int = 0

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_science_topic_quiz)
        // Initialize UI elements after setContentView
        progressBar = findViewById(R.id.pbProgress)
        tvQuestion = findViewById(R.id.tvQuestion)
        optionOne = findViewById(R.id.tvOptionOne)
        optionTwo = findViewById(R.id.tvOptionTwo)
        optionThree = findViewById(R.id.tvOptionThree)
        optionFour = findViewById(R.id.tvOptionFour)
        checkButton = findViewById(R.id.btnCheckTwo)
        buttonAnimation = findViewById(R.id.button_animation)
        button_text = findViewById(R.id.button_text)
        cvFirstChoice = findViewById(R.id.cvFirstChoice)
        cvSecondChoice = findViewById(R.id.cvSecondChoice)
        cvThirdChoice = findViewById(R.id.cvThirdChoice)
        cvFourthChoice = findViewById(R.id.cvFourthChoice)
        ivA = findViewById(R.id.ivA)
        ivB = findViewById(R.id.ivB)
        ivC = findViewById(R.id.ivC)
        ivD = findViewById(R.id.ivD)
        timer = findViewById(R.id.tvTimer)
        numberOfQuestion = findViewById(R.id.tvNumberOfQuestions)
        resetBackground = OptionBackgroundReusableClass(this)
        // Store the original drawable resources for ivA, ivB, ivC, and ivD
        originalDrawableA = ivA.drawable
        originalDrawableB = ivB.drawable
        originalDrawableC = ivC.drawable
        originalDrawableD = ivD.drawable
        topic = findViewById(R.id.tvTopic)
        backButton = findViewById(R.id.ivClear)

        val getTotal = intent.getIntExtra("Total", 0)
        val endingPosition1 = 9
        val endingPosition2 = 14
        val endingPosition3 = 19
        val endingPosition4 = 24
        total += getTotal
        Log.i("Total","$total")

        //start countdown
        val initialTimeMillis = 5 * 60 * 1000
        countdownTimer = object : CountDownTimer(initialTimeMillis.toLong(), 1000) {
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                // Update the timer TextView with the remaining time
                val secondsRemaining = millisUntilFinished / 1000
                val minutes = secondsRemaining / 60
                val seconds = secondsRemaining % 60
                timer.text = String.format("%02d:%02d min", minutes, seconds)
            }

            @SuppressLint("SetTextI18n")
            override fun onFinish() {
                // Handle timer expiration (e.g., show a message or take some action)
                val intent = Intent(this@ScienceTopicQuiz, TryAgain::class.java)
                startActivity(intent)

            }
        }.start()

        backButton.setOnClickListener {
            val intent = Intent(this, ScienceContent::class.java)
            startActivity(intent)
        }

        originalButtonText = button_text.text
        if(total ==0 ) {
            loadQuestion(currentQuestionIndex) // Load the first question
        }else if(total >= 17){
            topic.text = "Science: States of Matter"
            loadQuestion(startingPosition4)
        }
        else if(total >= 11){
            topic.text = "Science: Famous Scientist"
            loadQuestion(startingPosition3)
        }
        else if(total >= 7){
            topic.text = "Science: Animals"
            loadQuestion(startingPosition2)
        }
        else if(total >= 3){
            topic.text = "Science: Solar System"
            loadQuestion(startingPosition1)
        }

        cvFirstChoice.setOnClickListener {
            if (!isAnswerRevealed) {
                resetBackground.resetOptionView(
                    cvFirstChoice,
                    cvSecondChoice,
                    cvThirdChoice,
                    cvFourthChoice
                )
                cvFirstChoice.background =
                    ContextCompat.getDrawable(this, R.drawable.choices_selected_background)
                selectedOption = 1
            }
        }
        cvSecondChoice.setOnClickListener {
            if (!isAnswerRevealed) {
                resetBackground.resetOptionView(
                    cvFirstChoice,
                    cvSecondChoice,
                    cvThirdChoice,
                    cvFourthChoice
                )
                cvSecondChoice.background =
                    ContextCompat.getDrawable(this, R.drawable.choices_selected_background)
                selectedOption = 2
            }
        }
        cvThirdChoice.setOnClickListener {
            if (!isAnswerRevealed) {
                resetBackground.resetOptionView(
                    cvFirstChoice,
                    cvSecondChoice,
                    cvThirdChoice,
                    cvFourthChoice
                )
                cvThirdChoice.background =
                    ContextCompat.getDrawable(this, R.drawable.choices_selected_background)
                selectedOption = 3
            }
        }
        cvFourthChoice.setOnClickListener {
            if (!isAnswerRevealed) {
                resetBackground.resetOptionView(
                    cvFirstChoice,
                    cvSecondChoice,
                    cvThirdChoice,
                    cvFourthChoice
                )
                cvFourthChoice.background =
                    ContextCompat.getDrawable(this, R.drawable.choices_selected_background)
                selectedOption = 4
            }
        }

        checkButton.setOnClickListener {
            buttonAnimation.visibility = View.VISIBLE
            buttonAnimation.playAnimation()
            button_text.visibility = View.INVISIBLE

            // Disable the button while the animation is playing
            checkButton.isEnabled = false

            Handler(Looper.getMainLooper()).postDelayed({
                buttonAnimation.pauseAnimation()
                buttonAnimation.visibility = View.INVISIBLE
                checkButton.isEnabled = true

                if (button_text.text == "CONTINUE") {
                    progressBar.progress++
                    if(total == 0 ) {
                        if (currentQuestionIndex < 4) {
                            currentQuestionIndex++
                            loadQuestion(currentQuestionIndex)
                        } else {
                            // No more questions, check the score and decide which activity to launch
                            if (numberOfCorrects >= 4) {
                                val intent = Intent(this, ActivityResultScience::class.java)
                                intent.putExtra("Correct", numberOfCorrects)
                                Log.i("Total", "$numberOfCorrects")
                                startActivity(intent)

                            } else {
                                val intent = Intent(this, TryAgain::class.java)
                                intent.putExtra("Correct", numberOfCorrects)
                                startActivity(intent)
                            }
                        }
                        val remainingQuestions = numberOfQuestion.text.toString().toInt()
                        if (remainingQuestions > 0) {
                            numberOfQuestion.text = (remainingQuestions - 1).toString()
                        }
                        // Reset ivA, ivB, ivC, and ivD to their original drawables
                        ivA.setImageDrawable(originalDrawableA)
                        ivB.setImageDrawable(originalDrawableB)
                        ivC.setImageDrawable(originalDrawableC)
                        ivD.setImageDrawable(originalDrawableD)
                        // Set the "CONTINUE" text and make it visible
                        button_text.text = "CHECK"
                        button_text.visibility = View.VISIBLE
                    } else if(total >= 17){
                        if (startingPosition4 < endingPosition4) {
                            topic.text = "Science: States of Matter"
                            startingPosition4++
                            loadQuestion(startingPosition4)
                        } else {
                            // No more questions, check the score and decide which activity to launch
                            if (numberOfCorrects >= 3) {
                                val intent = Intent(this, ActivityResultScience::class.java)
                                intent.putExtra("totalQuiz", total)
                                intent.putExtra("Correct", numberOfCorrects)
                                Log.i("Total", "$total")
                                startActivity(intent)
                            } else {
                                val intent = Intent(this, TryAgain::class.java)
                                intent.putExtra("Correct", numberOfCorrects)
                                startActivity(intent)
                            }
                        }
                        val remainingQuestions = numberOfQuestion.text.toString().toInt()
                        if (remainingQuestions > 0) {
                            numberOfQuestion.text = (remainingQuestions - 1).toString()
                        }
                        // Reset ivA, ivB, ivC, and ivD to their original drawables
                        ivA.setImageDrawable(originalDrawableA)
                        ivB.setImageDrawable(originalDrawableB)
                        ivC.setImageDrawable(originalDrawableC)
                        ivD.setImageDrawable(originalDrawableD)
                        // Set the "CONTINUE" text and make it visible
                        button_text.text = "CHECK"
                        button_text.visibility = View.VISIBLE
                    } else if(total >= 11){
                        if (startingPosition3 < endingPosition3) {
                            topic.text = "Science: Famous Scientist"
                            startingPosition3++
                            loadQuestion(startingPosition3)
                        } else {
                            // No more questions, check the score and decide which activity to launch
                            if (numberOfCorrects >= 3) {
                                val intent = Intent(this, ActivityResultScience::class.java)
                                intent.putExtra("totalQuiz", total)
                                intent.putExtra("Correct", numberOfCorrects)
                                Log.i("Total", "$total")
                                startActivity(intent)
                            } else {
                                val intent = Intent(this, TryAgain::class.java)
                                intent.putExtra("Correct", numberOfCorrects)
                                startActivity(intent)
                            }
                        }
                        val remainingQuestions = numberOfQuestion.text.toString().toInt()
                        if (remainingQuestions > 0) {
                            numberOfQuestion.text = (remainingQuestions - 1).toString()
                        }
                        // Reset ivA, ivB, ivC, and ivD to their original drawables
                        ivA.setImageDrawable(originalDrawableA)
                        ivB.setImageDrawable(originalDrawableB)
                        ivC.setImageDrawable(originalDrawableC)
                        ivD.setImageDrawable(originalDrawableD)
                        // Set the "CONTINUE" text and make it visible
                        button_text.text = "CHECK"
                        button_text.visibility = View.VISIBLE
                    }  else if(total >= 7){
                        if (startingPosition2 < endingPosition2) {
                            topic.text = "Science: Animals"
                            startingPosition2++
                            loadQuestion(startingPosition2)
                        } else {
                            // No more questions, check the score and decide which activity to launch
                            if (numberOfCorrects >= 3) {
                                val intent = Intent(this, ActivityResultScience::class.java)
                                intent.putExtra("totalQuiz", total)
                                intent.putExtra("Correct", numberOfCorrects)
                                Log.i("Total", "$total")
                                startActivity(intent)
                            } else {
                                val intent = Intent(this, TryAgain::class.java)
                                intent.putExtra("Correct", numberOfCorrects)
                                startActivity(intent)
                            }
                        }
                        val remainingQuestions = numberOfQuestion.text.toString().toInt()
                        if (remainingQuestions > 0) {
                            numberOfQuestion.text = (remainingQuestions - 1).toString()
                        }
                        // Reset ivA, ivB, ivC, and ivD to their original drawables
                        ivA.setImageDrawable(originalDrawableA)
                        ivB.setImageDrawable(originalDrawableB)
                        ivC.setImageDrawable(originalDrawableC)
                        ivD.setImageDrawable(originalDrawableD)
                        // Set the "CONTINUE" text and make it visible
                        button_text.text = "CHECK"
                        button_text.visibility = View.VISIBLE
                    } else if(total >=3){
                        if (startingPosition1 < endingPosition1) {
                            topic.text = "Science: Solar System"
                            startingPosition1++
                            loadQuestion(startingPosition1)
                        } else {
                            // No more questions, check the score and decide which activity to launch
                            if (numberOfCorrects >= 3) {
                                val intent = Intent(this, ActivityResultScience::class.java)
                                intent.putExtra("totalQuiz", total)
                                intent.putExtra("Correct", numberOfCorrects)
                                Log.i("Total", "$total")
                                startActivity(intent)
                            } else {
                                val intent = Intent(this, TryAgain::class.java)
                                intent.putExtra("Correct", numberOfCorrects)
                                startActivity(intent)
                            }
                        }
                        val remainingQuestions = numberOfQuestion.text.toString().toInt()
                        if (remainingQuestions > 0) {
                            numberOfQuestion.text = (remainingQuestions - 1).toString()
                        }
                        // Reset ivA, ivB, ivC, and ivD to their original drawables
                        ivA.setImageDrawable(originalDrawableA)
                        ivB.setImageDrawable(originalDrawableB)
                        ivC.setImageDrawable(originalDrawableC)
                        ivD.setImageDrawable(originalDrawableD)
                        // Set the "CONTINUE" text and make it visible
                        button_text.text = "CHECK"
                        button_text.visibility = View.VISIBLE
                    }
                } else if (selectedOption == 0) {
                    // If the user did not select anything, it will not check the answer
                } else {
                    var currentQuestion = questionList[currentQuestionIndex]
                    if(total == 0){
                        currentQuestion = questionList[currentQuestionIndex]
                    }else if(total >= 15){
                        currentQuestion = questionList[startingPosition4]
                    }else if(total >= 11){
                        currentQuestion = questionList[startingPosition3]
                    }else if(total >= 7){
                        currentQuestion = questionList[startingPosition2]
                    }else if(total >= 3){
                        currentQuestion = questionList[startingPosition1]
                    }
                    if (selectedOption == currentQuestion.correctAnswer) {
                        // Increment numberOfCorrects if the selectedOption is correct
                        numberOfCorrects++
                        Log.d("Score", "+1")
                        // Highlight the correct answer with a green background
                        when (selectedOption) {
                            1 -> {
                                cvFirstChoice.background = ContextCompat.getDrawable(
                                    this,
                                    R.drawable.choices_correct_background
                                )
                                ivA.setImageResource(R.drawable.check)
                            }

                            2 -> {
                                cvSecondChoice.background = ContextCompat.getDrawable(
                                    this,
                                    R.drawable.choices_correct_background
                                )
                                ivB.setImageResource(R.drawable.check)
                            }

                            3 -> {
                                cvThirdChoice.background = ContextCompat.getDrawable(
                                    this,
                                    R.drawable.choices_correct_background
                                )
                                ivC.setImageResource(R.drawable.check)
                            }

                            4 -> {
                                cvFourthChoice.background = ContextCompat.getDrawable(
                                    this,
                                    R.drawable.choices_correct_background
                                )
                                ivD.setImageResource(R.drawable.check)
                            }
                        }
                    } else {
                        // Display the correct answer if the user's answer is wrong
                        displayCorrectAnswer(currentQuestion.correctAnswer)
                        when (selectedOption) {
                            1 -> {
                                cvFirstChoice.background =
                                    ContextCompat.getDrawable(
                                        this,
                                        R.drawable.choices_wrong_background
                                    )
                                displayWrongAnswer(ivA)
                            }

                            2 -> {
                                cvSecondChoice.background =
                                    ContextCompat.getDrawable(
                                        this,
                                        R.drawable.choices_wrong_background
                                    )
                                displayWrongAnswer(ivB)
                            }

                            3 -> {
                                cvThirdChoice.background =
                                    ContextCompat.getDrawable(
                                        this,
                                        R.drawable.choices_wrong_background
                                    )
                                displayWrongAnswer(ivC)
                            }

                            4 -> {
                                cvFourthChoice.background =
                                    ContextCompat.getDrawable(
                                        this,
                                        R.drawable.choices_wrong_background
                                    )
                                displayWrongAnswer(ivD)
                            }

                            else -> cvFirstChoice // Default to the first choice if selectedOption is not 1, 2, 3, or 4
                        }
                    }
                    // Set the "CONTINUE" text and make it visible
                    button_text.text = "CONTINUE"
                    button_text.visibility = View.VISIBLE
                    isAnswerRevealed = true // Set to true when the correct answer is revealed
                }
            }, 1000)
        }
    }
    override fun onPause() {
        super.onPause()
        countdownTimer?.cancel()
        countdownTimer = null
        Log.i("TAG", "Pause")
    }

    @SuppressLint("SetTextI18n")
    private fun loadQuestion(index: Int) {
        val currentQuestion = questionList[index]
        tvQuestion.text = currentQuestion.question
        optionOne.text = currentQuestion.optionOne
        optionTwo.text = currentQuestion.optionTwo
        optionThree.text = currentQuestion.optionThree
        optionFour.text = currentQuestion.optionFour
        resetBackground.resetOptionView(
            cvFirstChoice,
            cvSecondChoice,
            cvThirdChoice,
            cvFourthChoice
        )
        selectedOption = 0
        button_text.text = "CHECK"
        isAnswerRevealed = false
    }

    private fun displayCorrectAnswer(correctAnswer: Int) {
        // Update ImageView object to display the "wrong" image
        // Display the correct answer by changing its background color
        when (correctAnswer) {
            1 -> {
                cvFirstChoice.background =
                    ContextCompat.getDrawable(this, R.drawable.choices_correct_background)
                ivA.setImageResource(R.drawable.check)
            }

            2 -> {
                cvSecondChoice.background =
                    ContextCompat.getDrawable(this, R.drawable.choices_correct_background)
                ivB.setImageResource(R.drawable.check)
            }

            3 -> {
                cvThirdChoice.background =
                    ContextCompat.getDrawable(this, R.drawable.choices_correct_background)
                ivC.setImageResource(R.drawable.check)
            }

            4 -> {
                cvFourthChoice.background =
                    ContextCompat.getDrawable(this, R.drawable.choices_correct_background)
                ivD.setImageResource(R.drawable.check)
            }
        }
    }

    private fun displayWrongAnswer(imageView: ImageView) {
        // Update ImageView object to display the "wrong" image
        imageView.setImageResource(R.drawable.wrong)

        // Set the background to the shape with the wrong color for the selected option
        when (selectedOption) {
            1 -> cvFirstChoice.background =
                ContextCompat.getDrawable(this, R.drawable.choices_wrong_background)

            2 -> cvSecondChoice.background =
                ContextCompat.getDrawable(this, R.drawable.choices_wrong_background)

            3 -> cvThirdChoice.background =
                ContextCompat.getDrawable(this, R.drawable.choices_wrong_background)

            4 -> cvFourthChoice.background =
                ContextCompat.getDrawable(this, R.drawable.choices_wrong_background)
        }
    }
}
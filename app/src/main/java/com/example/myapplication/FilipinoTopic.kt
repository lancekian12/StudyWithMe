package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class FilipinoTopic : AppCompatActivity() {
    private lateinit var dataClassTitleDescriptions: ArrayList<DataClassTitleDescription>
    private var currentPosition: Int = 0
    private lateinit var title: TextView
    private lateinit var description: TextView
    private lateinit var exampleOne: TextView
    private lateinit var exampleTwo: TextView
    private lateinit var imageViewOne: ImageView
    private lateinit var imageViewTwo: ImageView
    private lateinit var progressbar: ProgressBar
    private lateinit var button: RelativeLayout
    private lateinit var buttonAnimation: LottieAnimationView
    private lateinit var button_text: TextView
    private lateinit var originalButtonText: CharSequence // Store original button text here
    private lateinit var topic: TextView
    private lateinit var theTitle : TextView
    private lateinit var backButton : ImageView
    private var startingPosition1 = 5
    private var startingPosition2 = 10
    private var startingPosition3 = 15
    private var startingPosition4 = 20
    private var total = 0

    @SuppressLint("MissingInflatedId", "WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filipino_topics)

        // Get the list of TitleDescription objects from the repository
        dataClassTitleDescriptions = FilipinoTitleDescriptionRepository.getTitleDescriptions()

        val getTotal = intent.getIntExtra("Score", 0)
        total += getTotal
        Log.i("Total", "$getTotal")

        // Initialize UI elements
        title = findViewById(R.id.tvTheTitle)
        description = findViewById(R.id.tvDescriptionOne)
        exampleOne = findViewById(R.id.tvExampleOne)
        exampleTwo = findViewById(R.id.tvExampleTwo)
        imageViewOne = findViewById(R.id.ivPictureOne)
        imageViewTwo = findViewById(R.id.ivPictureTwo)
        progressbar = findViewById(R.id.pbProgress)
        button = findViewById(R.id.btnContinue)
        buttonAnimation = findViewById(R.id.button_animation)
        button_text = findViewById(R.id.button_text)
        backButton = findViewById(R.id.ivClear)

        val endingPosition1 = 9
        val endingPosition2 = 14
        val endingPosition3 = 19
        val endingPosition4 = 24

        topic = findViewById(R.id.tvTopic)
        theTitle = findViewById(R.id.tvTitle)

        backButton.setOnClickListener {
            val intent = Intent(this,FilipinoContent::class.java)
            startActivity(intent)
        }

        // Store the original text of the button
        originalButtonText = button_text.text
        if (total == 0) {
            displayTitleDescription(currentPosition)
        } else if (getTotal >= 15) {
            topic.text = "Filipino: Uri ng Aspetong Pandiwa"
            theTitle.text = "URI NG ASPETONG PANDIWA"
            displayTitleDescription(startingPosition4)
        } else if (getTotal >= 11) {
            topic.text = "Filipino: URI NG KARUNUNGANG BAYAN"
            theTitle.text = "URI NG KARUNUNGANG BAYAN"
            displayTitleDescription(startingPosition3)
        } else if (getTotal >= 7) {
            topic.text = "Filipino: Mga Uri ng Panitikan"
            theTitle.text = "MGA URI NG PANITIKAN"
            displayTitleDescription(startingPosition2)
        } else if (getTotal >= 3) {
            topic.text = "Filipino: Mga Uri ng Tayutay"
            theTitle.text = "MGA URI NG TAYUTAY"
            displayTitleDescription(startingPosition1)
        }


        button.setOnClickListener {
            buttonAnimation.visibility = View.VISIBLE
            buttonAnimation.playAnimation()
            button_text.visibility = View.INVISIBLE

            // Disable the button while the animation is playing
            button.isEnabled = false

            // Delay to wait for the animation to finish (adjust the duration accordingly)
            Handler(Looper.getMainLooper()).postDelayed({
                // Re-enable the button
                buttonAnimation.pauseAnimation()
                buttonAnimation.visibility = View.INVISIBLE
                button.isEnabled = true
                // Increase the position to move to the next TitleDescription
                currentPosition++
                progressbar.progress++

                if (total == 0) {
                    if (currentPosition <= 4) {
                        displayTitleDescription(currentPosition)
                    } else {
                        val intent = Intent(this, FilipinoTopicQuiz::class.java)
                        startActivity(intent)
                    }
                } else if(getTotal >= 15){
                    if (startingPosition4 < endingPosition4) {
                        topic.text = "Filipino: Uri ng Aspetong Pandiwa"
                        theTitle.text = "URI NG ASPETONG PANDIWA"
                        startingPosition4++
                        displayTitleDescription(startingPosition4)
                    } else {
                        val intent = Intent(this, FilipinoTopicQuiz::class.java)
                        intent.putExtra("Total", total)
                        startActivity(intent)
                    }
                } else if(getTotal >= 11){
                    if (startingPosition3 < endingPosition3) {
                        topic.text = "Filipino: URI NG KARUNUNGANG BAYAN"
                        theTitle.text = "URI NG KARUNUNGANG BAYAN"
                        startingPosition3++
                        displayTitleDescription(startingPosition3)
                    } else {
                        val intent = Intent(this, FilipinoTopicQuiz::class.java)
                        intent.putExtra("Total", total)
                        startActivity(intent)
                    }
                } else if (getTotal >= 7) {
                    if (startingPosition2 < endingPosition2) {
                        topic.text = "Filipino: Mga Uri ng Panitikan"
                        theTitle.text = "MGA URI NG PANITIKAN"
                        startingPosition2++
                        displayTitleDescription(startingPosition2)
                    } else {
                        val intent = Intent(this, FilipinoTopicQuiz::class.java)
                        intent.putExtra("Total", total)
                        startActivity(intent)
                    }
                } else if (getTotal >= 3) {
                    if (startingPosition1 < endingPosition1) {
                        topic.text = "Filipino: Mga Uri ng Tayutay"
                        theTitle.text = "MGA URI NG TAYUTAY"
                        startingPosition1++
                        displayTitleDescription(startingPosition1)
                    } else {
                        val intent = Intent(this, FilipinoTopicQuiz::class.java)
                        intent.putExtra("Total", total)
                        startActivity(intent)
                    }
                } else {
                    val intent = Intent(this, FilipinoTopicQuiz::class.java)
                    startActivity(intent)
                }

                // Show the button text again
                button_text.visibility = View.VISIBLE
            }, 1000)
        }
    }

    private fun displayTitleDescription(position: Int) {
        val currentTitleDescription = dataClassTitleDescriptions[position]
        title.text = currentTitleDescription.title
        description.text = currentTitleDescription.description
        exampleOne.text = currentTitleDescription.exampleOne
        exampleTwo.text = currentTitleDescription.exampleTwo
        imageViewOne.setImageResource(currentTitleDescription.pictureOne)
        imageViewTwo.setImageResource(currentTitleDescription.pictureTwo)
    }
}

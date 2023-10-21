package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import android.util.Patterns
import com.example.myapplication.databinding.ActivityEditProfileBinding

class EditProfile : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbutton2.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale_up)
            binding.backbutton2.startAnimation(animation)
            finish()
        }


        binding.savebtn.setOnClickListener {

            val name = binding.profilenameedit.text.toString()
            val username = binding.profileusernamedit.text.toString()
            val email = binding.profileemailedit.text.toString()

            val isNameEmpty = name.isEmpty()
            val isUsernameValid = isUsernameValid(username)
            val isEmailValid = isEmailValid(email)

            showNameEmptyAlert(isNameEmpty)
            showUsernameLengthAlert(isUsernameValid)
            showEmailFormatAlert(isEmailValid)

            if (!isNameEmpty && isUsernameValid && isEmailValid) {
                val intent = Intent()
                intent.putExtra("name", name)
                intent.putExtra("username", username)
                intent.putExtra("email", email)
                setResult(RESULT_OK, intent)
                finish()
            }
        }

    }
    private fun showNameEmptyAlert(isEmpty: Boolean) {
        if (isEmpty) {
            binding.profilenameedit.error = "Name cannot be empty!"
        } else {
            binding.profilenameedit.error = null
        }
    }

    private fun showUsernameLengthAlert(isValid: Boolean) {
        if (!isValid) {
            binding.profileusernamedit.error = "Username must be at least 8 characters long."
        } else {
            binding.profileusernamedit.error = null
        }
    }

    private fun showEmailFormatAlert(isValid: Boolean) {
        if (!isValid) {
            binding.profileemailedit.error = "Invalid email format."
        } else {
            binding.profileemailedit.error = null
        }
    }


    private fun isUsernameValid(username: String): Boolean {
        return username.length >= 8
    }

    private fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
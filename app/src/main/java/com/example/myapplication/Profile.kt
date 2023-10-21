package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private lateinit var imageView: ImageView
    private lateinit var btPickImage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageView = findViewById(R.id.image_view)
        btPickImage = findViewById(R.id.pick_image)

        btPickImage.setOnClickListener {
            pickImage()
        }

        binding.editprofilebtn.setOnClickListener {
            startActivityForResult(Intent(this, EditProfile::class.java), 123)
        }

        binding.logoutbtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun pickImage() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, 101)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 101 && resultCode == RESULT_OK && data != null) {
            val uri = data.data
            if (uri != null) {
                imageView.setImageURI(uri)
            }
        } else if (requestCode == 123 && resultCode == RESULT_OK && data != null) {
            val name = data.getStringExtra("name")
            val username = data.getStringExtra("username")
            val email = data.getStringExtra("email")


            binding.tvName.text = name
            binding.tvUsername.text = username
            binding.tvEmaill.text = email
        }
    }
}
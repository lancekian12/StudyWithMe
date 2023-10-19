package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TableLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class EnglishContent : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_content)

        val fragmentToShow = intent.getStringExtra("FRAGMENT_TYPE")
        Log.i("Test", "$fragmentToShow")



        bottomNavigationView = findViewById(R.id.bottom_navigation_view)

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.overview -> {
                    // Replace the fragment container with the OverviewFragment
                    replaceFragment(EnglishOverviewFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.lessons -> {
                    replaceFragment(EnglishChapterFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.similarsubjects -> {
                    replaceFragment(OtherSubjectFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {
                    // Handle unhandled items, e.g., show a message or do nothing
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }
        replaceFragment(EnglishOverviewFragment())
        val back = findViewById<ImageView>(R.id.ivBack)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}

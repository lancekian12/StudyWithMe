package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ScienceContent : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_science_content)
        bottomNavigationView = findViewById(R.id.bottom_navigation_view)

        // Set a listener for BottomNavigationView item clicks
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.overview -> {
                    // Replace the fragment container with the OverviewFragment
                    replaceFragment(ScienceOverviewFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.lessons->{
                    replaceFragment(ScienceChapterFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.similarsubjects ->{
                    replaceFragment(OtherSubjectFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                // Add other menu items here and handle them similarly
                else -> {
                    // Handle unhandled items, e.g., show a message or do nothing
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }

        // Load the initial fragment (OverviewFragment)
        replaceFragment(ScienceOverviewFragment())

        val back = findViewById<ImageView>(R.id.ivBack)
        back.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
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

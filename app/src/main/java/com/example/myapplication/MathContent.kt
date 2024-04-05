package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MathContent : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_content)
        bottomNavigationView = findViewById(R.id.bottom_navigation_view)

        // Set a listener for BottomNavigationView item clicks
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.overview -> {
                    // Replace the fragment container with the OverviewFragment
                    replaceFragment(MathOverviewFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.lessons->{
                    replaceFragment(MathChapterFragment())
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

        // Load the initial fragment (OverviewFragment)
        replaceFragment(MathOverviewFragment())

        val back = findViewById<ImageView>(R.id.ivBack)
        back.setOnClickListener {
            val intent = Intent(this@MathContent, Navigation::class.java)
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

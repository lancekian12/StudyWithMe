package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.databinding.ActivityNavigationBinding
import com.google.android.material.navigation.NavigationView

class Navigation : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityNavigationBinding

    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getString = intent.getStringExtra("username")
        val getString2 = intent.getStringExtra("editedname")
        Log.i("Name","$getString2")


        val profile = findViewById<ImageView>(R.id.ivProfile)
        profile.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            intent.putExtra("username",getString)
            startActivity(intent)
        }

        setSupportActionBar(binding.toolbar)
        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.nav_open, R.string.nav_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationDrawer.setNavigationItemSelectedListener(this)
        binding.bottomNavigation.setBackgroundColor(ContextCompat.getColor(this, R.color.primarycolor))
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.bottom_home -> {
                    openFragment(HomeFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_subjects -> {
                    openFragment(SubjectsFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_notes -> {
                    openFragment(NoteBottom())
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_todo -> {
                    openFragment(ToDoFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.bottom_chatting ->{
                    return@setOnItemSelectedListener true
                }
                else -> {
                    true
                }
            }
        }
        fragmentManager = supportFragmentManager
        val fragmentToShow = intent.getStringExtra("Message")
        if(fragmentToShow == "SUBJECTS"){
            val menuItem = binding.bottomNavigation.menu.findItem(R.id.bottom_subjects)
            openFragment(SubjectsFragment())
            menuItem.isChecked = true
        }else{
            openFragment(HomeFragment())
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_subjects -> {
                openFragment(SubjectsFragment())
                binding.bottomNavigation.menu.findItem(R.id.bottom_subjects).isChecked = true
            }
            R.id.nav_notes -> {
                openFragment(NoteBottom())
                // Set the other items to not checked
                binding.bottomNavigation.menu.findItem(R.id.bottom_notes).isChecked = true
            }
            R.id.nav_todo -> {
                openFragment(ToDoFragment())
                // Set the other items to not checked
                binding.bottomNavigation.menu.findItem(R.id.bottom_todo).isChecked = true
            }
            R.id.nav_home ->{
                openFragment(HomeFragment())
                binding.bottomNavigation.menu.findItem(R.id.bottom_home).isChecked = true
            }
            R.id.nav_chat ->{
                binding.bottomNavigation.menu.findItem(R.id.bottom_chatting).isChecked = true
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun openFragment(fragment: Fragment){

        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()

    }

}
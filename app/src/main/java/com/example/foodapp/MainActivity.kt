package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.foodapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.jetbrains.annotations.NonNls

class MainActivity : AppCompatActivity() {

    //private lateinit var _binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //_binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }


    val bottomNavigation = findViewById<BottomNavigationView>(R.id.btnNav)
    val navController = Navigation.findNavController(this, R.id.mainFragment)


}
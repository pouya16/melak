package com.example.melak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import meow.bottomnavigation.MeowBottomNavigation

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val bottomNavigation = findViewById<MeowBottomNavigation>(R.id.bottom_nav)
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.bottom_navigation_user))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.bottom_navigation_chart))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.bottom_navigation_search))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.bottom_navigation_bookmark))
        bottomNavigation.add(MeowBottomNavigation.Model(5, R.drawable.bottom_navigation_home))

    }
}

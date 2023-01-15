package com.example.security

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)


        val bottombar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottombar.setOnItemSelectedListener {MenuItem ->

            if(MenuItem.itemId == R.id.nav_guard){
                inflateFragment(GuardFragment.newInstance())
            }
            else if(MenuItem.itemId == R.id.nav_home){
                inflateFragment(HomeFragment.newInstance())
            }
            else if(MenuItem.itemId == R.id.nav_profile) {
                inflateFragment(ProfileFragment.newInstance())
            }
            else if(MenuItem.itemId == R.id.nav_dashboard) {
                inflateFragment(DashBoardFragment.newInstance())
            }





            true
        }
        bottombar.selectedItemId = R.id.nav_home

    }



    private fun inflateFragment(newInstance: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newInstance)
        transaction.commit()
    }
}
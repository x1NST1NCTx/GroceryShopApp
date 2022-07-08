package com.example.groceryshopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)

        val addFragment = AddFragment()
        val viewFragment = ViewFragment()
        val balanceFragment = BalanceFragment()

        bottomNavigationView.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.nav_view->setCurrentFragment(viewFragment)
                R.id.nav_add->setCurrentFragment(addFragment)
                R.id.nav_balance->setCurrentFragment(balanceFragment)
            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.f1Fragment,fragment)
            commit()
        }
}
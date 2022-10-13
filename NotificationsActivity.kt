package com.example.neptuneclientapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NotificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        var actionBar = getSupportActionBar()

        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
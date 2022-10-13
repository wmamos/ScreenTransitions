package com.example.neptuneclientapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton

class DeviceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device)
        var actionBar = getSupportActionBar()

        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        val notifs = findViewById<ImageView>(R.id.notifSets)
        notifs.setOnClickListener{
            val notifsIntent = Intent(this, NotificationsActivity::class.java)
            startActivity(notifsIntent)
        }

        val files = findViewById<ImageView>(R.id.fileSets)
        files.setOnClickListener {
            val filesIntent = Intent(this, FileActivity::class.java)
            startActivity(filesIntent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_auto ->
                    if (checked) {
                        // Pirates are the best
                    }
                R.id.radio_key ->
                    if (checked) {
                        // Ninjas rule
                    }
            }
        }
    }
}
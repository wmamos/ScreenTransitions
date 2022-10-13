package com.example.neptuneclientapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.content.Intent
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test1 = findViewById<TextView>(R.id.test1)
        test1.setOnClickListener {
            val Intent = Intent(this, DeviceActivity::class.java)
            startActivity(Intent)
        }
    }
}
package com.example.edtech

import android.content.Intent
import android.content.Intent.ACTION_DIAL
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val contact = findViewById<Button>(R.id.contact)
        contact.setOnClickListener {
            intent= Intent(ACTION_DIAL)
            intent.setData(Uri.parse("tel:123456789"))
            startActivity(intent)
        }
    }
}
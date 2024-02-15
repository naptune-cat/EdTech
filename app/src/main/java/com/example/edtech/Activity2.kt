package com.example.edtech

import android.content.Intent
import android.content.Intent.ACTION_DIAL
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

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
        val kotlinImg = findViewById<ImageView>(R.id.kotlin)
        kotlinImg.setOnClickListener{
            intent = Intent(applicationContext,kotlinActivity::class.java)
            startActivity(intent)
        }
        val cppImg = findViewById<ImageView>(R.id.cpp)
        cppImg.setOnClickListener{
            intent = Intent(applicationContext,cppActivity::class.java)
            startActivity(intent)
        }
        val cssImg = findViewById<ImageView>(R.id.css)
        cssImg.setOnClickListener{
            intent = Intent(applicationContext,cssActivity::class.java)
            startActivity(intent)
        }
        val htmlImg = findViewById<ImageView>(R.id.html)
        htmlImg.setOnClickListener{
            intent = Intent(applicationContext,htmlActivity::class.java)
            startActivity(intent)
        }
        val tableauImg = findViewById<ImageView>(R.id.tableau)
        tableauImg.setOnClickListener{
            intent = Intent(applicationContext,tableauActivity::class.java)
            startActivity(intent)
        }
        val sqlImg = findViewById<ImageView>(R.id.sql)
        sqlImg.setOnClickListener{ 
            intent = Intent(applicationContext,sqlActivity::class.java)
            startActivity(intent)
        }

    }
}
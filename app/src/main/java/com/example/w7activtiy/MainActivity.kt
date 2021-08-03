package com.example.w7activtiy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btnNext)

        btn.setOnClickListener(){
            var intent : Intent = Intent(this, SecondActivity::class.java )

            startActivity(intent)
        }
    }
}
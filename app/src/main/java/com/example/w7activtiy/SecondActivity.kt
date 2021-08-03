package com.example.w7activtiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("LifeCycle", "onCreate")

        val btn :Button = findViewById(R.id.btnAdd)
        val tv : TextView = findViewById(R.id.tvQuestion)

        if (savedInstanceState != null){
            tv.text = savedInstanceState?.getString("question")
        }

        btn.setOnClickListener(){
            tv.text = generateQuestion()
        }
    }

    fun generateQuestion():String{
        var no1 = (Math.random()*100).toInt()
        var no2 = (Math.random()*100).toInt()

        return "${no1} + ${no2} = ?"
    }

    override fun onStart() {
        super.onStart()

        Log.i("LifeCycle", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("LifeCycle", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i("LifeCycle", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.i("LifeCycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("LifeCycle", "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val tvQ : TextView = findViewById(R.id.tvQuestion)

        outState.putString("question", tvQ.toString())
    }
}
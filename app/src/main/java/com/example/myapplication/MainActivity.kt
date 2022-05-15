package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var eror1: TextView
    private lateinit var bbb: Button

    var frgh = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eror1 = findViewById(R.id.textView);
        bbb = findViewById(R.id.button);


        bbb.setOnClickListener {
            frgh += 1
            eror1.text = frgh.toString()
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val userName = frgh
        outState.putInt("saveCounter", frgh)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val counter = savedInstanceState.getInt("saveCounter", 0)
        frgh = counter;
        eror1.text = frgh.toString();
    }
}
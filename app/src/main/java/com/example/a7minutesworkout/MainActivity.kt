package com.example.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flStart: FrameLayout = findViewById(R.id.flStart)
        flStart.setOnClickListener {
            Toast.makeText(this@MainActivity,
                "Button Clicked Successfully", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
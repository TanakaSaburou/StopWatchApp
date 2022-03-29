package com.example.stopwatchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Chronometer
import java.time.temporal.ChronoField

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)viewの取得
        val cm:Chronometer=findViewById(R.id.cm)
        val btnStart:Button = findViewById(R.id.btnStart)

    }
}
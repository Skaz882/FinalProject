package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val line1 = findViewById<TextView>(R.id.idLine1)
        val line2 = findViewById<TextView>(R.id.idLine2)
        val line3 = findViewById<TextView>(R.id.idLine3)
        val line4 = findViewById<TextView>(R.id.idLine4)
        val line5 = findViewById<TextView>(R.id.idLine5)


       line1.setTextColor(resources.getColor(R.color.blue))
        line2.setTextColor(resources.getColor(R.color.green))
        line3.setTextColor(resources.getColor(R.color.purple))
        line4.setTextColor(resources.getColor(R.color.red))
        line5.setTextColor(resources.getColor(R.color.gray))





    }
}


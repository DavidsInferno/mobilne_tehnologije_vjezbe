package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textView = findViewById<TextView>(R.id.textView)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val intent = intent
        val message = intent.getStringExtra("message")
        textView.text = message

        when(message){
            "GLA SUV" -> imageView.setImageResource(R.drawable.gclasssuv)
            "G-class SUV" -> imageView.setImageResource(R.drawable.gclasssuv)
            "A-Class Sedan" -> imageView.setImageResource(R.drawable.aclass)
            "X5" -> imageView.setImageResource(R.drawable.x5)
            "i3" -> imageView.setImageResource(R.drawable.i3)
            "X7" -> imageView.setImageResource(R.drawable.x7)
            "A6" -> imageView.setImageResource(R.drawable.a6)
            "Q3" -> imageView.setImageResource(R.drawable.q3)
            "R8" -> imageView.setImageResource(R.drawable.r8)



        }
    }
}
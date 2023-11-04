package com.example.mykotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    fun main(args: Array<String>, textview: TextView){
        textview.text = "Hello ${args.joinToString (" ")}"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.textview)
        val arg= arrayOf("Android","Ramyasri")
        main(arg, textview)
    }
}
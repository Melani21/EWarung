package com.example.ewarung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun setPembayaran(view: View) {
         val intent=Intent(this,MainActivity2 ::class.java)
         startActivity(intent)
         finish()
     }

    fun setPlus2(view: View) {}
    fun setMin2(view: View) {}
    fun setMin1(view: View) {}
    fun setplus1(view: View) {}
    fun setBack(view: View) {}
}
package com.example.ewarung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var kurang1: ImageButton
    private lateinit var kurang2: ImageButton
    private lateinit var plus1: ImageButton
    private lateinit var plus2: ImageButton
    private lateinit var jum1: TextView
    private lateinit var jum2: TextView
    private lateinit var totalBayar: TextView
    private lateinit var jumlahtotal: TextView
    private var jumlah1: Int = 0
    private var jumlah2: Int = 0
    private var jumTotal: Int = 0
    private var totalBayar1: Int = 0
    private var totalBayar2: Int = 0
    private var totBay: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        kurang1 = findViewById(R.id.btnMinus1)
        kurang2 = findViewById(R.id.btnMinusP2)
        plus1 = findViewById(R.id.btnPlus1)
        plus2 = findViewById(R.id.btnPlusP2)
        jum1 = findViewById(R.id.txtJumP1)
        jum2 = findViewById(R.id.txtJumP2)
        jumlahtotal = findViewById(R.id.txtJumTotal)
        totalBayar = findViewById(R.id.txtJumBayar)
    }
    fun setBack(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun setMin1(view: View){
        jumlah1 = jum1.text.toString().toInt()
        if(jumlah1==0){
            Toast.makeText(this, "minimum pesanan 1", Toast.LENGTH_LONG).show()
        } else {
            jumlah1 = jumlah1-1
            jum1.setText(jumlah1.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    fun setplus1(view: View){
        jumlah1 = jum1.text.toString().toInt()
        if(jumlah1==5){
            Toast.makeText(this, "minimum pesanan 5", Toast.LENGTH_LONG).show()
        }
        else{
            jumlah1 = jumlah1+1
            jum1.setText(jumlah1.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    fun setMin2(view: View){
        jumlah2 = jum2.text.toString().toInt()
        if(jumlah2==0){
            Toast.makeText(this, "minimum pesanan 1", Toast.LENGTH_LONG).show()
        } else {
            jumlah2 = jumlah2-1
            jum2.setText(jumlah2.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    fun setPlus2(view: View){
        jumlah2 = jum2.text.toString().toInt()
        if(jumlah2==5){
            Toast.makeText(this, "minimum pesanan 5", Toast.LENGTH_LONG).show()
        }
        else{
            jumlah2 = jumlah2+1
            jum2.setText(jumlah2.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    private fun setJumTotalBeli(){
        jumlah2 = jum2.text.toString().toInt()
        jumlah1 = jum1.text.toString().toInt()
        jumTotal = jumlah1+jumlah2
        jumlahtotal.setText(jumTotal.toString())
    }
    private fun setJumTotalBayar(){
        jumlah2 = jum2.text.toString().toInt()
        jumlah1 = jum1.text.toString().toInt()
        totalBayar2 = jumlah2*22000
        totalBayar1 = jumlah1*20000
        totBay = totalBayar1+totalBayar2
        totalBayar.setText(totBay.toString())

    }
}




package com.example.mtgdatahelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardNameInput = findViewById<EditText>(R.id.enterCard)
        val gameInHand = findViewById<TextView>(R.id.gih_val)
        val gamePlayedWinRate = findViewById<TextView>(R.id.gp_wr_val)
        val openingHandWinRate = findViewById<TextView>(R.id.oh_wr_val)
        val gameInHandWinRate = findViewById<TextView>(R.id.gih_wr_val)
        val getDataButton = findViewById<Button>(R.id.getData)
        val cardName = findViewById<TextView>(R.id.card_name)
        getDataButton.setOnClickListener {
            cardName.text = cardNameInput.text.toString()
        }
    }
}
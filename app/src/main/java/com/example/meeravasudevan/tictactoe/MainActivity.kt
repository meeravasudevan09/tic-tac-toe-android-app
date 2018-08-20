package com.example.meeravasudevan.tictactoe

import android.graphics.Color.CYAN
import android.graphics.Color.GREEN
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getCellId(view: View) {
        val selectedButton = view as Button

        val cellId = when (selectedButton.id) {
            R.id.Button_00 -> 1
            R.id.Button_01 -> 2
            R.id.Button_02 -> 3
            R.id.Button_10 -> 4
            R.id.Button_11 -> 5
            R.id.Button_12 -> 6
            R.id.Button_20 -> 7
            R.id.Button_21 -> 8
            R.id.Button_22 -> 9
            else -> 0
        }

        Toast.makeText(this, "Cell ID: $cellId", Toast.LENGTH_SHORT).show()
        initiateMove(selectedButton)
    }

    private var usersTurn = true

    fun initiateMove(selectedButton: Button) {

        if (usersTurn) {
            selectedButton.text = "X"
            selectedButton.setBackgroundColor(CYAN)
            usersTurn = !usersTurn
            selectedButton.isClickable = false
        } else {
            selectedButton.text = "O"
            selectedButton.setBackgroundColor(GREEN)
            usersTurn = !usersTurn
            selectedButton.isClickable = false
        }
    }

}

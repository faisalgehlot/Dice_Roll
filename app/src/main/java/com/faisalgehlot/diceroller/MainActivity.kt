package com.faisalgehlot.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faisalgehlot.diceroller.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.button.text = "Let's Roll"

        binding.button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.diceImage.setImageResource(drawableResource)
    }

//    fun makeToast() {
//        val text = "Hello This is toast!"
//        val duration = Toast.LENGTH_SHORT
//
//        val toast = Toast.makeText(applicationContext, text, duration)
//        toast.show()
//    }
}
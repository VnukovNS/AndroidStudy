package com.example.magic8ball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.magic8ball.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener{shakeBall()}

    }

    private fun shakeBall(){

        val imageResource = when (Random().nextInt(20) +1) {
            1 -> R.drawable.magic_8_ball_1
            2 -> R.drawable.magic_8_ball_2
            3 -> R.drawable.magic_8_ball_3
            4 -> R.drawable.magic_8_ball_4
            5 -> R.drawable.magic_8_ball_5
            6 -> R.drawable.magic_8_ball_6
            7 -> R.drawable.magic_8_ball_7
            8 -> R.drawable.magic_8_ball_8
            9 -> R.drawable.magic_8_ball_9
            10 -> R.drawable.magic_8_ball_10
            11 -> R.drawable.magic_8_ball_11
            12 -> R.drawable.magic_8_ball_12
            13 -> R.drawable.magic_8_ball_13
            14 -> R.drawable.magic_8_ball_14
            15 -> R.drawable.magic_8_ball_15
            16 -> R.drawable.magic_8_ball_16
            17 -> R.drawable.magic_8_ball_17
            18 -> R.drawable.magic_8_ball_18
            19 -> R.drawable.magic_8_ball_19
            else -> R.drawable.magic_8_ball_20
        }

        binding.ballImage.setImageResource(imageResource)

    }
}
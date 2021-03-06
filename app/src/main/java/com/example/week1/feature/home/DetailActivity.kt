package com.example.week1.feature.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.week1.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getName()
    }

    private fun getName() {
        if (intent.hasExtra("name")) {
            val name = intent.getStringExtra("name")
            binding.tvDetailName.text = name.toString()
            when (name.toString()) {
                "권용민" -> binding.tvDetailDetail.text = "안녕안녕"
                "김세훈" -> binding.tvDetailDetail.text = "안녕안녕2"
                "이종찬" -> binding.tvDetailDetail.text = "안녕안녕3"
                "이혜빈" -> binding.tvDetailDetail.text = "안녕안녕4"
                "최정원" -> binding.tvDetailDetail.text = "안녕안녕5"
            }
        }
    }


}
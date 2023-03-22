package com.example.lesson1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.lesson1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listImage = listOf(R.drawable.big, R.drawable.small, R.drawable.big, R.drawable.small, R.drawable.big, R.drawable.small, R.drawable.big, R.drawable.small)

        binding.recycler.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        val adapter = RecyclerAdapter()
        adapter.list = listImage
        binding.recycler.adapter = adapter
    }
}
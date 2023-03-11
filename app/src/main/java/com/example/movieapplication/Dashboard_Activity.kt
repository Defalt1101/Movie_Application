package com.example.movieapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.movieapplication.databinding.ActivityDashboardBinding
import com.example.movieapplication.databinding.ActivityLoginPageBinding

class Dashboard_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            with(rated){
                adapter  = CategoryAdapter(listOf("Action", "Horror", "Comedy" ))
                layoutManager = LinearLayoutManager(this@Dashboard_Activity,LinearLayoutManager.HORIZONTAL, false)
            }
            with(tvFilm) {
                adapter = FilmAdapter(listOf(Film("Spiderman No Way Home", "2021-12-17", "9.5", R.drawable.item_film_spiderman), Film("Avangers End Game", "2019-08-03", "9.2", R.drawable.item_film_spiderman)))
                layoutManager = LinearLayoutManager(this@Dashboard_Activity)
            }
        }
        }
    }


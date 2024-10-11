package com.example.app4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val movieList = ArrayList<MovieModel>()
        movieList.add(MovieModel(R.drawable.et, "ET"))
        movieList.add(MovieModel(R.drawable.action, "Action"))
        movieList.add(MovieModel(R.drawable.fantasy, "Fantasy"))
        movieList.add(MovieModel(R.drawable.foxtrap, "Foxtrap"))
        movieList.add(MovieModel(R.drawable.starwars, "Star Wars"))
        movieList.add(MovieModel(R.drawable.back_from, "Back From The Future"))
        movieList.add(MovieModel(R.drawable.godfather, "The Godfather"))

        val adapter = MovieAdapter(movieList)
        binding.apply {
            carouselRecycler.adapter = adapter
            carouselRecycler.set3DItem(true)
            carouselRecycler.setAlpha(true)
            carouselRecycler.setInfinite(true)
        }



    }
}
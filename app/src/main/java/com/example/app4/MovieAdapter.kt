package com.example.app4

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.example.app4.databinding.CarouselItemBinding
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter(private var movieList: List<MovieModel>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    class MovieViewHolder(val binding: CarouselItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = CarouselItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun getItemCount(): Int = movieList.size


    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.binding.apply {
            Glide.with(movieImage).load(movie.image).into(movieImage)
            movieName.text = movie.name

            movieImage.setOnClickListener {
                Toast.makeText(holder.binding.root.context, movie.name, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
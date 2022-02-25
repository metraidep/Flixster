package com.tran.flixster

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val context: Context, private val movies: List<Movies>)
    : RecyclerView.Adapter<MovieAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_movie,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount() = movies.size

    inner class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(itemView){
        private val tvPoster = itemView.findViewById<TextView>(R.id.ivPoster)
        private val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        private val tvTitle = itemView.findViewById<TextView>(R.id.tvOverview)
        fun bind(movie: Movie){
            tvTitle.text = movie.title
            tvOverview.text = movie.overview

        }
    }

}

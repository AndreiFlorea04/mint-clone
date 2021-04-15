package com.nero.mint.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nero.mint.newsPojo.ArticlesItem
import com.nero.mint.R

class NewsAdapter(
    val articlesList: MutableList<ArticlesItem>

) : RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_news_item_layout, parent, false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articlesList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        Glide.with(holder.Image).load(articlesList[position].urlToImage).into(holder.Image)
        holder.apply {

            Title.text = articlesList[position].title
            Description.text = articlesList[position].description
            Date.text = articlesList[position].publishedAt


        }
    }
}

class NewsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {


    val Image = view.findViewById<ImageView>(R.id.homeNewsDisplayIv)
    val Title = view.findViewById<TextView>(R.id.homeNewsTitleTv)
    val Description = view.findViewById<TextView>(R.id.homeNewsDescTv)
    val Date = view.findViewById<TextView>(R.id.homeNewsDateTv)

}
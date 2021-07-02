package com.example.matisse.adapter

import android.net.Uri
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.matisse.databinding.ItemDesignBinding

class ImageViewHolder(private val binding: ItemDesignBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(image: Uri) {
        Glide.with(binding.image).load(image).into(binding.image)
    }
}

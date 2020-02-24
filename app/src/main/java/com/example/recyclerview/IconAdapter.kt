package com.example.recyclerview

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class IconAdapter(val list: ArrayList<IconDataClass>):RecyclerView.Adapter<IconViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return IconViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        val currentIcon = list[position]

        holder.image.setImageResource(currentIcon.image)
        holder.text.text = currentIcon.text
    }

}

class IconViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val image:ImageView = itemView.iv_icon
    val text: TextView = itemView.tv_icon

}
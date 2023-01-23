package com.example.homework20

import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class SiteViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    fun onBind(itemSite: Site) {
        val name = itemView.findViewById<TextView>(R.id.tvName)
        val picture = itemView.findViewById<ImageView>(R.id.ivPicture)
        val link = itemView.findViewById<TextView>(R.id.link)

        name.text = itemSite.name
        Glide
            .with(itemView)
            .load(itemSite.picture)
            .into(picture)

        link.text = itemSite.link
        link.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(itemSite.link)
            link.context.startActivity(intent)
        }
    }
}
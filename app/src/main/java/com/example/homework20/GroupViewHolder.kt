package com.example.homework20

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroupViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    fun onBind(item: GroupItem) {
        itemView.findViewById<TextView>(R.id.text).text = item.value
    }
}
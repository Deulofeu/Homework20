package com.example.homework20

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SiteAdapter :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val list: MutableList<Any> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            TITLE_TYPE -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.text_item, parent, false)
                GroupViewHolder(view)
            }
            CONTENT_TYPE -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_sites, parent, false)
                SiteViewHolder(view)
            }
            else -> throw Exception()
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SiteViewHolder -> holder.onBind(list[position] as Site)
            is GroupViewHolder -> holder.onBind(list[position] as GroupItem)
        }
    }

    fun setItems(list: List<Any>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size

    companion object {
        private const val TITLE_TYPE = 1
        private const val CONTENT_TYPE = 2
    }

    override fun getItemViewType(position: Int): Int = when (list[position]) {
        is GroupItem -> TITLE_TYPE
        is Site -> CONTENT_TYPE
        else -> throw Exception()
    }
}
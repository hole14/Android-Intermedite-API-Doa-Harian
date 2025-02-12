package com.example.apidoa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DoaAdapter(private val listDoa: ArrayList<String>): RecyclerView.Adapter<DoaAdapter.listViewHolder>() {
    class listViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvDoa: TextView = view.findViewById(R.id.tv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_doa, parent, false)
        return listViewHolder(view)
    }

    override fun onBindViewHolder(holder: listViewHolder, position: Int) {
        holder.tvDoa.text = listDoa[position]
    }

    override fun getItemCount(): Int =listDoa.size

}
package com.example.apidoa

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DoaAdapter(private val listDoa: ArrayList<KumpulanDoa>): RecyclerView.Adapter<DoaAdapter.listViewHolder>() {
    companion object{
        const val EXTRA_DOA = "extra_doa"
        const val EXTRA_AYAT = "extra_ayat"
        const val EXTRA_LATIN = "extra_latin"
        const val EXTRA_ARTI = "extra_arti"
    }
    class listViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvDoa: TextView = view.findViewById(R.id.tv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_doa, parent, false)
        return listViewHolder(view)
    }

    override fun onBindViewHolder(holder: listViewHolder, position: Int) {
        val (doa, ayat, latin, arti) = listDoa[position]
        holder.tvDoa.text = doa
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailDoaActivity::class.java)
            intent.putExtra(EXTRA_DOA, doa)
            intent.putExtra(EXTRA_AYAT, ayat)
            intent.putExtra(EXTRA_LATIN, latin)
            intent.putExtra(EXTRA_ARTI, arti)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int =listDoa.size

}
data class KumpulanDoa(
    val doa: String,
    val ayat: String,
    val latin: String,
    val arti: String
)
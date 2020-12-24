package com.diva.sbuxlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_sbux.view.*

class ListSbuxAdapter(private val listSbux: ArrayList<Sbux>) : RecyclerView.Adapter<ListSbuxAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sbux: Sbux) {
            with(itemView) {
                Glide.with(itemView.context).load(sbux.photo)
                    .apply(RequestOptions().override(100, 100)).into(iv_list_sbux)
                tv_name.text = sbux.name
                tv_desc.text = sbux.desc

            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSbuxAdapter.ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_sbux, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listSbux[position])
    }

    override fun getItemCount(): Int = listSbux.size

}
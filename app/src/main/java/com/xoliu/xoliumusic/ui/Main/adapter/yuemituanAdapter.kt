package com.xoliu.xoliumusic.ui.Main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xoliu.xoliumusic.DataBean.yuemituan
import com.xoliu.xoliumusic.R

class yuemituanAdapter(val list: List<yuemituan>):RecyclerView.Adapter<yuemituanAdapter.ViewHolder>() {
    inner class ViewHolder(v: View):RecyclerView.ViewHolder(v){
        var imageView = v.findViewById<ImageView>(R.id.yuemituanIMG)
        var textView = v.findViewById<TextView>(R.id.yuemituanNAME)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.yuemituan_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var y = list.get(position)
        holder.imageView.setImageResource(y.imgId)
        holder.textView.setText(y.name)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
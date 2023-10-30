package com.xoliu.xoliumusic.ui.Main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xoliu.xoliumusic.DataBean.dongtai
import com.xoliu.xoliumusic.DataBean.gedan
import com.xoliu.xoliumusic.R

class dongtaiAdapter(val list: List<dongtai>):RecyclerView.Adapter<dongtaiAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val gedanTuPian: ImageView = itemView.findViewById(R.id.gedanTuPian)
        val gedanName: TextView = itemView.findViewById(R.id.gedanName)
        val gedanJianJie: TextView = itemView.findViewById(R.id.gedanJianJie)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var dongtai = list.get(position)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.dongtai_item, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
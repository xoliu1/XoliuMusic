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
        var userIcon: ImageView = itemView.findViewById(R.id.touXiang)
        var userName: TextView = itemView.findViewById(R.id.UserName)
        var userAction: TextView = itemView.findViewById(R.id.userAction)
        var contentText: TextView = itemView.findViewById(R.id.contentString)
        var songPic: ImageView = itemView.findViewById(R.id.songPic)
        var songName: TextView = itemView.findViewById(R.id.songName)
        var songSinger: TextView = itemView.findViewById(R.id.songSinger)
        var pinglun: TextView = itemView.findViewById(R.id.pinglunNum)
        var dianzan: TextView = itemView.findViewById(R.id.dianzanNum)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var dongtai = list.get(position)
        holder.userIcon.setImageResource(dongtai.userImg)
        holder.userName.setText(dongtai.userName)
        holder.userAction.setText(dongtai.userAction)
        holder.contentText.setText(dongtai.content)
        holder.songPic.setImageResource(dongtai.songPic)
        holder.songName.setText(dongtai.songName)
        holder.songSinger.setText(dongtai.songSinger)
        holder.dianzan.setText(dongtai.dianzanNum)
        holder.pinglun.setText(dongtai.pinglunNum)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.dongtai_item, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
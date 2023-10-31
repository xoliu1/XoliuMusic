package com.xoliu.xoliumusic.ui.Main.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xoliu.xoliumusic.DataBean.yuemituan
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.ui.Main.adapter.gedanAdapter
import com.xoliu.xoliumusic.ui.Main.adapter.yuemituanAdapter


class guanzhuFragment : Fragment() {
    var yueMiTuanList = ArrayList<yuemituan>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guanzhu, container, false)
    }

    override fun onStart() {
        super.onStart()


    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            guanzhuFragment().apply {
                this
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData(view)
        initView(view)
    }

    fun initData(view: View){
        repeat(10){
            yueMiTuanList.add(yuemituan(R.drawable.dj, "乐迷团"))
        }
    }
    fun initView(view: View){
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        var recyclerViewYueMiTuan = view.findViewById<RecyclerView>(R.id.recyclerViewYueMiTuan )
        recyclerViewYueMiTuan.layoutManager = layoutManager
        recyclerViewYueMiTuan.adapter = yuemituanAdapter(yueMiTuanList)

    }


}
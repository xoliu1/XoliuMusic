package com.xoliu.xoliumusic.ui.Main.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xoliu.xoliumusic.DataBean.dongtai
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.ui.Main.adapter.dongtaiAdapter
import com.xoliu.xoliumusic.ui.Main.adapter.gedanAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [sheqvFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class sheqvFragment : Fragment() {
    var dongTaiList = ArrayList<dongtai>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sheqv, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        val layoutManager = LinearLayoutManager(context)
        //创建歌单
        var DongTairecyclerView = view.findViewById<RecyclerView>(R.id.dongtaisView)
        DongTairecyclerView.layoutManager = layoutManager
        DongTairecyclerView.adapter = dongtaiAdapter(dongTaiList)
    }

    fun initData(){
        dongTaiList.add(dongtai(R.drawable.dj,"网易云音乐","发布单曲","上的 我打打我我的我的无动为大我打我打我单位驱动器我的驱动器的武器去外地去外地气得我去外地去外地去外地",R.drawable.woxihuan1,"懂得爱的人","潘玮柏"))
        dongTaiList.add(dongtai(R.drawable.dj,"网易云音乐","发布单曲","上的 我打打我我的我的无动为大我打我打我单位驱动器我的驱动器的武器去外地去外地气得我去外地去外地去外地",R.drawable.woxihuan1,"懂得爱的人","潘玮柏"))

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment sheqvFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            sheqvFragment().apply {
                this
            }
    }
}
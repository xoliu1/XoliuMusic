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
        repeat(4){
            initData()
        }
        val layoutManager = LinearLayoutManager(context)
        //创建歌单
        var DongTairecyclerView = view.findViewById<RecyclerView>(R.id.dongtaisView)
        DongTairecyclerView.layoutManager = layoutManager
        DongTairecyclerView.adapter = dongtaiAdapter(dongTaiList)
    }

    fun initData(){
        dongTaiList.add(dongtai(
            R.drawable.user_ic1,
            "网易CEO丁磊",
            "分享单曲",
            "#最后的水族馆# 古典气质的弦乐编曲，深刻、很会讲故事的歌词。非常欣赏裘德的音乐态度，也希望大家看在好作品的面子上，新年别再“鲨”他了"
                ,R.drawable.zhuanji_ic1,
            "浓缩蓝鲸",
            "裘德"))
        dongTaiList.add(dongtai(
            R.drawable.user_ic2,
            "原创君",
            "分享单曲",
            "音乐人@热水澡-@Tphunkpkpkpk 原创单曲《天气预报说的那场雨》现已上线!\n  当窗外下着那场天气预报说的那场雨，以潮湿的泥土气息和失落的情感为背景，勾勒出失去她后的难过和内心矛盾。歌词中的\"又是骗自己\"彷佛一面镜子，让人反思自我欺骗的现实。但正如这首歌的旋律，雨水滋润着青草地，我们或许可以像雨后的大地一样，自我疗愈，重新获得希望\n #新歌首发#"
            ,R.drawable.zhuanji_ic2,
            "天气预报说的那场雨",
            "热水澡/Tphunk"))
        dongTaiList.add(dongtai(
            R.drawable.user_ic3,
            "welphenDEM",
            "分享声音",
            "#RL Grime - Halloween XIl"
            ,R.drawable.zhuanji_ic3,
            "RL Grime - Halloween XIl",
            "电音|welphenDEM"))
        dongTaiList.add(dongtai(
            R.drawable.user_ic4,
            "Alan Walker",
            "分享单曲",
            "欢迎来到白色系WalkerWorld!因为你们，今天再一次全场售罄!!\n" +
                    "#Alan Walker#"
            ,R.drawable.zhuanji_ic4,
            "Better Off (Alone, Pt. III)",
            "Alan Walker "))
        dongTaiList.add(dongtai(
            R.drawable.user_ic5,
            "EdSheeran",
            "发布动态",
            "2024 Mathematics tour dates on sale from today, see ya on the road xx"
            ,R.drawable.zhuanji_ic5,
            "Galway Girl ",
            "EdSheeran"))
        dongTaiList.add(dongtai(
            R.drawable.user_ic2,
            "原创君",
            "分享专辑",
            "音乐人@气态生命全新专辑《把我的骨灰撒向大海》上线!\n面朝大海，春暖花开。树一年比一年绿，年一年比一年稀。抓不住的流逝，留不住的遗失一身边的场景换了又换。如果说在浮躁的时代想留下一点痕迹，那就请把我的骨灰撒向大海吧。\n" +
                    "#新专首发#"
            ,R.drawable.zhuanji_ic6,
            "把我的骨灰撒向大海",
            "气态生命"))




       // dongTaiList.add(dongtai(R.drawable.dj,"网易云音乐","发布单曲","上的 我打打我我的我的无动为大我打我打我单位驱动器我的驱动器的武器去外地去外地气得我去外地去外地去外地",R.drawable.woxihuan1,"懂得爱的人","潘玮柏"))

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
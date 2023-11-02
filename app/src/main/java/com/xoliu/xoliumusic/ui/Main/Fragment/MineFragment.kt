package com.xoliu.xoliumusic.ui.Main.Fragment






import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver.OnScrollChangedListener
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.core.view.GravityCompat
import androidx.core.widget.NestedScrollView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.Tab
import com.xoliu.xoliumusic.Base.BaseFragment
import com.xoliu.xoliumusic.DataBean.gedan
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.databinding.FragmentMineBinding
import com.xoliu.xoliumusic.ui.Main.adapter.gedanAdapter


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MineFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MineFragment : BaseFragment<FragmentMineBinding>() {

    var geDanList1 = ArrayList<gedan>()
    var geDanList2 = ArrayList<gedan>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar(view)
        initTabLayout(view)
        initData()
        initRecyclerView(view)
        initClick(view)
        val tv: TextView = view.findViewById(R.id.textView2)
        tv.requestFocus()


    }

    private fun initToolbar(v: View) {
        //未完成
        val nestedScrollView = v.findViewById<NestedScrollView>(R.id.scrollView)
        val toolbar = v.findViewById<Toolbar>(R.id.toolbar)

    }
    lateinit var scrollListener:OnScrollChangedListener

    fun initTabLayout(v:View){

            val floatingView = v.findViewById<LinearLayout>(R.id.appBar)
            //var tabLayout = v.findViewById<TabLayout>(R.id.tablayout1)
            val nestedScrollView = v.findViewById<NestedScrollView>(R.id.scrollView)
            scrollListener = OnScrollChangedListener {
                val scrollY = nestedScrollView.scrollY
                val top: Int = floatingView.getTop()
                if (scrollY > top) {
                    // 当滚动距离超过部件的顶部位置时，将部件固定在顶部
                    floatingView.setY(scrollY.toFloat())
                    floatingView.setBackgroundColor(Color.WHITE)
                } else {
                    // 否则，恢复部件的原始位置
                    floatingView.setY(top.toFloat())
                    floatingView.setBackgroundColor(Color.parseColor("#00ffffff"))
                }
            }
            nestedScrollView.viewTreeObserver.addOnScrollChangedListener(scrollListener)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_mine, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MineFragment().apply {
                this
            }
    }



    fun initData(){
        //初始化创建歌单的数据
        geDanList1.add(gedan(R.drawable.gedan1,"@xoliu1的十年精选辑","20首，已下载7首"))
        geDanList1.add(gedan(R.drawable.gedan2,"2022年度歌单","10首"))
        geDanList1.add(gedan(R.drawable.gedan3,"2021年度歌单","10首"))
        geDanList1.add(gedan(R.drawable.gedan4,"os.","58首"))
        geDanList1.add(gedan(R.drawable.daoru,"一键导入外部音乐","一键同步你的喜好"))
        //================
        geDanList2.add(gedan(R.drawable.gedan5,"【空灵轻电】星空下的无限遐想","世界上没有幸福，但有自由和宁静。"))
        geDanList2.add(gedan(R.drawable.gedan6,"今天《末》爱不释耳|私人雷达","你爱的歌，值得反复聆听..."))
        geDanList2.add(gedan(R.drawable.gedan7,"心比過去更加遙遠","我曾经七次鄙视自己的灵魂,它本可以进取却故作谦卑;"))
        geDanList2.add(gedan(R.drawable.gedan8,"「纯音」请为迷失的自己照亮希望的方向","#纯音乐  长大的途中，会遇到各种困难..."))
        geDanList2.add(gedan(R.drawable.gedan9,"平静而绝望的活着°","在芸芸众生中，你敢否与世隔绝 独善其身 "))
        geDanList2.add(gedan(R.drawable.gedan10,"『空灵 缥缈』星空下的孤独守望者","孤独是灵魂的放射，理性的落寞，也是思想的高度，人生的境界。"))
        geDanList2.add(gedan(R.drawable.gedan11,"读书，然后忘记背景音乐（4-23）","烟波不动影沉沉，碧色全无翠色深。"))

    }
    fun initRecyclerView(view: View){
        val layoutManager = LinearLayoutManager(context)
        //创建歌单
        var recyclerViewGeDan1 = view.findViewById<RecyclerView>(R.id.recyclerViewGeDan1 )
        recyclerViewGeDan1.layoutManager = layoutManager
        recyclerViewGeDan1.adapter = gedanAdapter(geDanList1)
        //收藏歌单
        var recyclerViewGeDan2 = view.findViewById<RecyclerView>(R.id.recyclerViewGeDan2 )
        recyclerViewGeDan2.layoutManager = LinearLayoutManager(context)
        recyclerViewGeDan2.adapter = gedanAdapter(geDanList2)
    }
    fun  initClick(view: View){
        //tablayout
        var nestedScrollView = view.findViewById<NestedScrollView>(R.id.scrollView)
        var tablayout1 = view.findViewById<TabLayout>(R.id.tablayout1)
        var cardView3 = view.findViewById<CardView>(R.id.cardView3)
        var cardView2 = view.findViewById<CardView>(R.id.cardView2)
        tablayout1.setOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: Tab) {

                //  tab.getPosition()  返回数字，从0开始
                // tab.getText()  返回字符串类型，从0开始
                if (tab.position == 0) {
                        nestedScrollView.smoothScrollTo(0, cardView2.top);
                }else if (tab.position == 1){
                    nestedScrollView.smoothScrollTo(0, cardView3.top);
                }else{
                    nestedScrollView.fullScroll(ScrollView.FOCUS_DOWN);
                }
            }

            override fun onTabUnselected(tab: Tab) {}
            override fun onTabReselected(tab: Tab) {}
        })
        //抽屉
        var btn_openDrawer:ImageButton = view.findViewById(R.id.openDrawer)
        val drawerLayout: DrawerLayout = view.findViewById(R.id.drawerLayout)
        btn_openDrawer.setOnClickListener { drawerLayout.openDrawer(GravityCompat.START) }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        val nestedScrollView = requireView().findViewById<NestedScrollView>(R.id.scrollView)
        nestedScrollView.getViewTreeObserver().removeOnScrollChangedListener(scrollListener);
    }

//            binding.scrollView.post(Runnable {
//                //滚动到指定位置（滚动要跳过的控件的高度的距离）
//                //binding.scrollView.scrollTo(0, binding.cardView3.getMeasuredHeight())
//                //如果要平滑滚动，可以这样写
//                binding.scrollView.smoothScrollTo(0, binding.cardView3.getMeasuredHeight());
//            });
//            binding.scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    
}
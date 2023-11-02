package com.xoliu.xoliumusic.ui.Main.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.xoliu.xoliumusic.Base.BaseFragment
import com.xoliu.xoliumusic.DataBean.DataBean
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.databinding.ActivityMainBinding
import com.xoliu.xoliumusic.databinding.FragmentExploreBinding
import com.xoliu.xoliumusic.ui.Unfinished.shiqv
import com.youth.banner.Banner
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ExploreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ExploreFragment : BaseFragment<FragmentExploreBinding>() {
    private val TAG = "xoliu1"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onStart() {
        super.onStart()
        initBanner()
    }
    companion object {
        @JvmStatic
        fun newInstance() =
            ExploreFragment().apply {
                this
            }
    }

//    fun initToolbar(toolbar: Toolbar){
//        toolbar.setNavigationOnClickListener {
//            binding.drawerLayout.open()
//        }
//
//        toolbar.setOnMenuItemClickListener { menuItem ->
//
//            when (menuItem.itemId) {
//                com.xoliu.xoliumusic.R.id.shiqv -> jumpActivity(shiqv::class.java)
//            }
//
//            true
//        }
//    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }





fun initBanner(){
    var banner: Banner<DataBean, BannerImageAdapter<DataBean>> = requireView().findViewById(R.id.banner)

    banner.setAdapter(object : BannerImageAdapter<DataBean>(DataBean.testData3) {
        override fun onBindView(holder: BannerImageHolder, data: DataBean, position: Int, size: Int) {
            //图片加载自己实现
            Glide.with(holder.itemView)
                .load(data.imageUrl)
                .apply(RequestOptions.bitmapTransform(RoundedCorners(30)))
                .into(holder.imageView) }
    }).addBannerLifecycleObserver(this).setIndicator(CircleIndicator(context))
}


}

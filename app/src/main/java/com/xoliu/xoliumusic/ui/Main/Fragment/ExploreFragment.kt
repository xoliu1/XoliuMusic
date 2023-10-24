package com.xoliu.xoliumusic.ui.Main.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.xoliu.xoliumusic.Base.BaseFragment
import com.xoliu.xoliumusic.DataBean.db_banner
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.databinding.FragmentExploreBinding
import com.youth.banner.Banner
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.config.BannerConfig
import com.youth.banner.holder.BannerImageHolder
import javax.xml.transform.Transformer


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
   lateinit var banner_data: BannerImageAdapter<Int>
    private val TAG = "xoliu1"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initBanner();

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }
    companion object {
        @JvmStatic
        fun newInstance() =
            ExploreFragment().apply {
                this
            }
    }

    fun initBanner(){
        Log.e(TAG, "initBanner: 1")

        Log.e(TAG, "initBanner: 2")
        binding.banner.setAdapter(object : BannerImageAdapter<db_banner>(db_banner.testData3) {
            override fun onBindView(holder: BannerImageHolder, data: db_banner, position: Int, size: Int) {
                Log.e(TAG, "onBindView: 3")
                //图片加载自己实现
                Glide.with(holder.itemView)
                    .load(data.imageUrl)
                    .apply(RequestOptions.bitmapTransform(RoundedCorners(30)))
                    .into(holder.imageView) }
        })



    }


}
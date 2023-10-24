package com.xoliu.xoliumusic.ui.Main.Fragment

import com.xoliu.xoliumusic.R
import android.R.attr.x
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.xoliu.xoliumusic.Base.BaseFragment
import com.xoliu.xoliumusic.DataBean.db_banner
import com.xoliu.xoliumusic.databinding.FragmentExploreBinding
import com.youth.banner.Banner
import com.youth.banner.BuildConfig
import com.youth.banner.adapter.BannerImageAdapter
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
        initBanner();


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





    }


}

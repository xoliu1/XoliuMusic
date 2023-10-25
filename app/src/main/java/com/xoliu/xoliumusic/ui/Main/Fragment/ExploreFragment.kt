package com.xoliu.xoliumusic.ui.Main.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.xoliu.xoliumusic.Base.BaseFragment
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.databinding.FragmentExploreBinding


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
    companion object {
        @JvmStatic
        fun newInstance() =
            ExploreFragment().apply {
                this
            }
    }

    var num1 = 0;
    var num2 = 0;
    var num3 = 0;
    var num4 = 0;
//    fun initdianji(){
//
//        binding.btnDianzan1.setOnClickListener {
//            if (num1 % 2 == 0) {
//
//            }else{
//                it.setBackgroundResource(R.drawable.dianzan)
//            }
//            ++num1;
//            true
//        }
//        binding.btnDianzan2.setOnClickListener {
//            if (num2 % 2 == 0) {
//                it.setBackgroundResource(R.drawable.dianzan1)
//            }else{
//                it.setBackgroundResource(R.drawable.dianzan)
//            }
//            ++num2;
//            true
//        }
//        binding.btnDianzan1.setOnClickListener {
//            if (num3 % 2 == 0) {
//                it.setBackgroundResource(R.drawable.dianzan1)
//            }else{
//                it.setBackgroundResource(R.drawable.dianzan)
//            }
//            ++num3;
//            true
//        }
//        binding.btnDianzan1.setOnClickListener {
//            if (num4 % 2 == 0) {
//                it.setBackgroundResource(R.drawable.dianzan1)
//            }else{
//                it.setBackgroundResource(R.drawable.dianzan)
//            }
//            ++num4;
//            true
//        }
//    }








}

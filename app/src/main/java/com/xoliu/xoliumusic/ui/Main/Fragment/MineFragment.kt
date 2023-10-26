package com.xoliu.xoliumusic.ui.Main.Fragment

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.xoliu.xoliumusic.Base.BaseFragment
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.databinding.FragmentMineBinding

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




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
}
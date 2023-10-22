package com.xoliu.xoliumusic.ui.Splash.adapter;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.xoliu.xoliumusic.ui.Splash.fragment.FragmentOnePage;
import com.xoliu.xoliumusic.ui.Splash.fragment.FragmentThreePage;
import com.xoliu.xoliumusic.ui.Splash.fragment.FragmentTwoPage;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private final static int PAGE_COUNT = 3;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment itemFragment = null;
        switch (i){
            case 0:
                itemFragment = FragmentOnePage.newInstance();
                break;
            case 1:
                itemFragment = FragmentTwoPage.newInstance();
                break;
            case 2:
                itemFragment = FragmentThreePage.newInstance();
                break;
             default:
                break;
        }

        return itemFragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}

package com.example.android.tarantoguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Adapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Food", "Museums",
            "POI", "Beaches"};

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new MesuemFragment();
        } else if (position == 2) {
            return new TurismFragment();
        } else {
            return new BeachesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return tabTitles[0];
        } else if (position == 1) {
            return tabTitles[1];
        } else if (position == 2) {
            return tabTitles[2];
        } else {
            return tabTitles[3];
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

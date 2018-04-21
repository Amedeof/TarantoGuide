package com.example.android.tarantoguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Adapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_poi);
        } else if (position == 2) {
            return mContext.getString(R.string.category_meseums);
        } else {
            return mContext.getString(R.string.category_beaches);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

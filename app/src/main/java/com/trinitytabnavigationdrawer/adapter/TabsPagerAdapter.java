package com.trinitytabnavigationdrawer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.trinitytabnavigationdrawer.Menus;
import com.trinitytabnavigationdrawer.androids;
import com.trinitytabnavigationdrawer.home;
import com.trinitytabnavigationdrawer.php;

/**
 * Created by Aneh on 1/19/2015.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new Menus();
            case 1:
                return new home();
            case 2:
                return new php();
            case 3:
                return  new androids();


        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 4;
    }
}


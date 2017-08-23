package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Guilherme on 22/08/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new NumbersFragment();
            case 1: return new FamilyFragment();
            case 2: return new ColorsFragment();
            default: return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0: return "Numbers";
            case 1: return "Family";
            case 2: return "Colors";
            default: return "Phrases";
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

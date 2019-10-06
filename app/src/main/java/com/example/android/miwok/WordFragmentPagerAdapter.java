package com.example.android.miwok;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WordFragmentPagerAdapter extends FragmentPagerAdapter {
    Context context;

    public WordFragmentPagerAdapter(FragmentManager fm, Context nContext) {
        super(fm);
        context = nContext;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new NumbersFragment();
            case 1: return new FamilyFragment();
            case 2: return new ColorsFragment();
            default: return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);
        switch(position){
            case 0: return context.getString(R.string.category_numbers);
            case 1: return context.getString(R.string.category_family);
            case 2: return context.getString(R.string.category_colors);
            default: return context.getString(R.string.category_phrases);
        }
    }
}

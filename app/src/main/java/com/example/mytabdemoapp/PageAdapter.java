package com.example.mytabdemoapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter
{
   int tabcount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
       switch (position)
       {
           case 0 : return new ftab1();
           case 1 : return new ftab2();
           case 2 : return new ftab3();
           case 3 : return new ftab4();
           case 4 : return new ftab5();
           case 5 : return new ftab6();
           default: return null;
       }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}

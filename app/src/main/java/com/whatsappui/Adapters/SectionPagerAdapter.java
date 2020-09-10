package com.whatsappui.Adapters;

import android.content.Context;
import android.telecom.Call;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.whatsappui.Fragments.CallsFragment;
import com.whatsappui.Fragments.CameraFragment;
import com.whatsappui.Fragments.ChatsFragment;
import com.whatsappui.Fragments.StatusFragment;

import java.util.ArrayList;
import java.util.List;


public class SectionPagerAdapter extends FragmentPagerAdapter {
    private final String TAG = "PAGER ADAPTER";

    private final List<Fragment> mFragmentList = new ArrayList<>();

    public SectionPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
//    private Context mContext;
//    private int totalTabs;
//
//    public SectionPagerAdapter(Context context, @NonNull FragmentManager fm, int totalTabs) {
//        super(fm, totalTabs);
//
//        mContext = context;
//        this.totalTabs = totalTabs;
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        switch (position){
//            case 0:
//                return new CameraFragment();
//            case 1:
//                return new ChatsFragment();
//            case 2:
//                return new StatusFragment();
//            case 3:
//                return new CallsFragment();
//
//            default:
//                return null;
//        }
//
//    }
//
//    @Override
//    public int getCount() {
//        return totalTabs;
//    }
}


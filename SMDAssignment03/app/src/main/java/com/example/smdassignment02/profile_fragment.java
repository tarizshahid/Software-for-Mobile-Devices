package com.example.smdassignment02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class profile_fragment extends Fragment{

@Nullable
     TabLayout tabLayout;
    ViewPager viewPager;







    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_profile,container,false);
        tabLayout=view.findViewById(R.id.tablayout);
        viewPager=view.findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        VPadapter vPadapter = new VPadapter(getFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vPadapter.addfragment(new fragment1(),"Section 1");
        vPadapter.addfragment(new fragment2(),"Section 2");
        vPadapter.addfragment(new fragment3(),"Section 3");
        viewPager.setAdapter(vPadapter);

        return view;



    }
}

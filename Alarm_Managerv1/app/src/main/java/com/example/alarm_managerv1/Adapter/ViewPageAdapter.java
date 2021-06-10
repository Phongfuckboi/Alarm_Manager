package com.example.alarm_managerv1.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.alarm_managerv1.Fragment.AlarmFragment;
import com.example.alarm_managerv1.Fragment.StopWatchFragment;
import com.example.alarm_managerv1.Fragment.TimerFragment;
import com.example.alarm_managerv1.Fragment.WorkClockfragment;

public class ViewPageAdapter  extends FragmentStatePagerAdapter {
    public ViewPageAdapter(@NonNull @org.jetbrains.annotations.NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {
       switch (position){

           case 0:
               return new AlarmFragment();

           case 1:
               return new WorkClockfragment();

           case 2:
               return new StopWatchFragment();

           case 3:
                return new TimerFragment();

           default:
               return new  AlarmFragment();
       }
    }

    @Override
    public int getCount() {
        return 4;
    }


}

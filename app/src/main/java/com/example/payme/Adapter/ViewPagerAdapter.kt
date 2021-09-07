package com.example.payme.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.payme.Fragment.MyViewPagerFragment
import com.example.payme.Model.MyModel

class ViewPagerAdapter(val list: ArrayList<MyModel>, fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return MyViewPagerFragment.newInstance(list[position])
    }
}
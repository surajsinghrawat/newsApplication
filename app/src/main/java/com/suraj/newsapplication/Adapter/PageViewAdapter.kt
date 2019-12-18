package com.suraj.newsapplication.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.suraj.newsapplication.Fragment.BussinesFragment
import com.suraj.newsapplication.Fragment.EntertenmentFragment
import com.suraj.newsapplication.Fragment.PoliticsFragment
import com.suraj.newsapplication.Fragment.SportFragment


class PageViewAdapter internal constructor(supportFragmentManager: FragmentManager) : FragmentStatePagerAdapter(supportFragmentManager,BEHAVIOR_SET_USER_VISIBLE_HINT) {


   private val count:Int=4

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? =null
        when(position){
            0 -> fragment = BussinesFragment()
            1 -> fragment=PoliticsFragment()
            2 -> fragment=SportFragment()
            3 -> fragment=EntertenmentFragment()


        }
        return fragment!!
    }

    override fun getCount(): Int {
        return count
    }

}
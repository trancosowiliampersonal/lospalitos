package br.com.faesa.app.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.faesa.app.BaseFragment


/**
 * Created by wiliam on 5/5/18.
 */
class MainViewPageAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    private val listFragments:MutableList<BaseFragment>? = mutableListOf()

    fun add(frag: BaseFragment) {
        this.listFragments?.add(frag)
    }

    override fun getItem(position: Int): Fragment {
        return listFragments?.get(position)!!
    }

    override fun getCount(): Int {
        return listFragments?.size ?: 0
    }

    override fun getPageTitle(position: Int): CharSequence {
        return listFragments?.get(position)?.title ?: ""
    }
}
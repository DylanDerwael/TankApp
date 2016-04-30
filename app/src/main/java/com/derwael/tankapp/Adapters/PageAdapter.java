package com.derwael.tankapp.Adapters;


import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.derwael.tankapp.ChecklistFragment;
import com.derwael.tankapp.CustomerFragment;
import com.derwael.tankapp.R;


/**
 * Created by dylan on 12.12.14.
 */
public class PageAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 10;
    }

    /**
     * @return true if the value returned from {@link #instantiateItem(android.view.ViewGroup, int)} is the
     * same object as the {@link View} added to the {@link android.support.v4.view.ViewPager}.
     */
    @Override
    public boolean isViewFromObject(View view, Object o) {
        return o == view;
    }

    // BEGIN_INCLUDE (pageradapter_getpagetitle)
    /**
     * Return the title of the item at {@code position}. This is important as what this method
     * returns is what is displayed in the {@link SlidingTabLayout}.
     * <p>
     * Here we construct one using the position value, but for real application the title should
     * refer to the item's contents.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return "Item " + (position + 1);
    }
    // END_INCLUDE (pageradapter_getpagetitle)

    /**
     * Instantiate the {@link View} which should be displayed at {@code position}. Here we
     * inflate a layout from the apps resources and then change the text view to signify the position.
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // Inflate a new layout from our resources
        switch (position) {
            case 0:
                // Top Rated fragment activity
                return new CustomerFragment();
            case 1:
                // Games fragment activity
                return new ChecklistFragment();
            default:
                return view;
        }
    }

    /**
     * Destroy the item from the {@link android.support.v4.view.ViewPager}. In our case this is simply removing the
     * {@link View}.
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        Log.i(LOG_TAG, "destroyItem() [position: " + position + "]");
    }


}

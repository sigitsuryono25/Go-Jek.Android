package com.viewpagerindicator;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

public abstract interface PageIndicator
  extends ViewPager.OnPageChangeListener
{
  public static final int EDIT_MODE_COUNT = 5;
  public static final int EDIT_MODE_PAGE = 2;
  public static final String EDIT_MODE_TITLE = "Page %d";
  public static final CharSequence EMPTY_TITLE = "";
  public static final int INVALID_POINTER = -1;
  
  public abstract void notifyDataSetChanged();
  
  public abstract void setCurrentItem(int paramInt);
  
  public abstract void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener);
  
  public abstract void setViewPager(ViewPager paramViewPager);
  
  public abstract void setViewPager(ViewPager paramViewPager, int paramInt);
}


/* Location:              /Users/michael/Downloads/dex2jar-2.0/GO_JEK.jar!/com/viewpagerindicator/PageIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
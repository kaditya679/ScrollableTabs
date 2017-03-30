package adrock.me.scrollabletabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));


    }
}



class MyAdapter extends FragmentStatePagerAdapter
{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        if(position==0)
        {
            fragment=new FragmentA();
        }

        if(position==1)
        {
            fragment=new FragmentB();
        }


        if(position==2)
        {
            fragment=new FragmentC();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String str="";
        if(position==0)
        {
            str="Tab1";
        }

        if(position==1)
        {
            str="Tab2";
        }

        if(position==2)
        {
            str="Tab3";
        }
        return str;
    }

}
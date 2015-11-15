package com.trinitytabnavigationdrawer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;

/**
 * Created by Aneh on 3/22/2015.
 */
public class Menus extends Fragment {

   final String[] name_item = {"Alternative Coffee",
    "Espresso Coffe",
    "Tradition Coffe",
    "Chocolate Coffe",
    "Ice Blended",
    "Cookie Cream",
    "Italian Sorbet",
    "Smoothies",
    "Soda"};

    final String[] coast_item = {"12.0 USD",
    "15.9 USD",
    "13.9 USD",
    "9.6 USD",
    "18.3 USD",
    "20 USD",
    "9 USD",
    "6 USD",
    "12.3 USD"};



    TextView name_ite, coast_ite;
    ImageView img_item;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View menus = inflater.inflate(R.layout.menu_activity, container, false);



        SwipeMenuListView lv_item = (SwipeMenuListView)menus.findViewById(R.id.lv_menu);


        lv_item.setAdapter(new MyArrayAdapter(getActivity(), R.layout.menu_items, name_item));


        return menus;
    }


    class MyArrayAdapter extends ArrayAdapter {

        public MyArrayAdapter(Context context, int resource, String[] objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.menu_items, null);

            name_ite = (TextView)v.findViewById(R.id.item_name);
            coast_ite = (TextView)v.findViewById(R.id.item_coast);

            name_ite.setText(name_item[position]);
            coast_ite.setText(coast_item[position]);

            img_item = (ImageView)v.findViewById(R.id.img_items);

            if (name_item[position]=="Alternative Coffee"){
                img_item.setImageResource(R.drawable.alternative_coffee);
            }else if (name_item[position]=="Espresso Coffe")
            {
                img_item.setImageResource(R.drawable.espresso2);
            }else if (name_item[position]=="Tradition Coffe")
            {
                img_item.setImageResource(R.drawable.tradition_coffee3);
            }else if (name_item[position]=="Chocolate Coffe")
            {
                img_item.setImageResource(R.drawable.chocolate4);
            }else if (name_item[position]=="Ice Blended")
            {
                img_item.setImageResource(R.drawable.ice_blended5);
            }else if (name_item[position]=="Cookie Cream")
            {
                img_item.setImageResource(R.drawable.cookie6);
            }else if (name_item[position]=="Italian Sorbet")
            {
                img_item.setImageResource(R.drawable.italian7);
            }else if (name_item[position]=="Smoothies")
            {
                img_item.setImageResource(R.drawable.smoothies8);
            }else if (name_item[position]=="Soda")
            {
                img_item.setImageResource(R.drawable.soda9);
            }
            return v;
        }
    }

    private int dp2px(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                getResources().getDisplayMetrics());
    }

}

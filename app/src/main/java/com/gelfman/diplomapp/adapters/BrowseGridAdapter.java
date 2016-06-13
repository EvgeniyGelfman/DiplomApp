package com.gelfman.diplomapp.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.gelfman.diplomapp.R;

/**
 * Created by Admin on 22.05.2016.
 */
public class BrowseGridAdapter extends BaseAdapter {

    private Context mContext;
    private final LayoutInflater mInflater;

    public String[] filesnames = {
            "Input",
            "Expences",
            "Calendar",
            "Analytics"
    };

    public BrowseGridAdapter(Context c){
        mContext = c;
        mInflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return filesnames.length;
    }

    @Override
    public Object getItem(int position) {
        return filesnames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Button btn;
        ImageView fcvPicture;
        TextView  tvCellTitle;

        if (convertView == null){
            convertView = mInflater.inflate(R.layout.fragment_browse_item, parent, false);
            convertView.setTag(R.id.fcvPicture, convertView.findViewById(R.id.fcvPicture));
            convertView.setTag(R.id.tvCellTitle, convertView.findViewById(R.id.tvCellTitle));
          /*  btn = new Button(mContext);
            btn.setLayoutParams(new GridView.LayoutParams(200,400));
            btn.setPadding(8,8,8,8);*/

        } /*else {
            btn = (Button) convertView;
        }
        btn.setBackgroundColor(Color.parseColor("#949597"));
        btn.setId(position);
        btn.setText(filesnames[position]);
        btn.setFocusable(false);
        btn.setClickable(false);
        */

        fcvPicture = (ImageView) convertView.getTag(R.id.fcvPicture);
        tvCellTitle = (TextView) convertView.getTag(R.id.tvCellTitle);

        fcvPicture.setImageResource(R.drawable.gradient);
        tvCellTitle.setText(filesnames[position]);

        return convertView;
    }
}
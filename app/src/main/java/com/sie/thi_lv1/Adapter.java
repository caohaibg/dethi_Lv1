package com.sie.thi_lv1;

/**
 * Created by Sie on 5/8/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter extends BaseAdapter {

    private Context  context;
    private ArrayList<baihatmodel> list;
    public Adapter(Context context, ArrayList list){
        this.context = context;
        this.list = list;

    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.iteam_layout, null);
        TextView txtten = view.findViewById(R.id.txtten);
        TextView txttacia = view.findViewById(R.id.txttacgia);
        ImageView img= view.findViewById(R.id.img);

        img.setImageResource(R.drawable.ic_code_black_24dp);
        txtten.setText(list.get(i).getTenbaihat());
        txttacia.setText(list.get(i).getTacGia());

        return view;
    }
}
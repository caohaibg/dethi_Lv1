package com.sie.thi_lv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private Button butthem, butxoa;
    private ListView list;
    private EditText edtten, edttacgia;
    private ArrayList<baihatmodel> baihat = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtten = (EditText) findViewById(R.id.edtten);
        edttacgia = (EditText) findViewById(R.id.edttacgia);
        butthem =(Button) findViewById(R.id.butthem);
        butxoa = (Button) findViewById(R.id.butxoa);
        list = findViewById(R.id.dsbaihat);
        baihat.add(new baihatmodel("abc", "cccc"));
        baihat.add(new baihatmodel("abc", "dddd"));
        baihat.add(new baihatmodel("abc", "eeee"));

        butthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        butxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete();
            }
        });

    }
    public void add(){
        adapter.notifyDataSetChanged();
        baihat.add(new baihatmodel(edtten.getText()+"", edttacgia.getText()+""));
        edtten.setText("");
        edttacgia.setText("");
        edtten.requestFocus();

    }
    public void delete(){

        for (int i =list.getChildCount()-1;i>=0;i--){
            View view = list.getChildAt(i);
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkbox);
            if(checkBox.isChecked()){
                baihat.remove(i);
            }
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkbox);
        if(checkBox.isChecked()){
            Intent intent= new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("TEN", baihat.get(position).getTenbaihat());
            intent.putExtra("TACGIA", baihat.get(position).getTacGia());

            startActivity(intent);
        }
    }

}

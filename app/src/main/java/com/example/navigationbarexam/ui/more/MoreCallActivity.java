package com.example.navigationbarexam.ui.more;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.navigationbarexam.R;

import java.util.ArrayList;
import java.util.List;

public class MoreCallActivity extends AppCompatActivity {
    private ListView list_more_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_call);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        list_more_all = findViewById(R.id.list_more_call);
        list_more_all.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        ArrayList<MoreCall> data = new ArrayList<>();
        data.add(new MoreCall("서울특별시","02-0000-0000"));
        data.add(new MoreCall("경기도", "02-0000-0000"));
        data.add(new MoreCall("인천광역시", "02-0000-0000"));
        data.add(new MoreCall("강원도", "02-0000-0000"));
        data.add(new MoreCall("대전광역시", "02-0000-0000"));
        data.add(new MoreCall("세종특별자치시", "02-0000-0000"));
        data.add(new MoreCall("충청남도", "02-0000-0000"));
        data.add(new MoreCall("충청북도", "02-0000-0000"));
        data.add(new MoreCall("부산광역시", "02-0000-0000"));
        data.add(new MoreCall("울산광역시", "02-0000-0000"));
        data.add(new MoreCall("경상남도", "02-0000-0000"));
        data.add(new MoreCall("경상북도", "02-0000-0000"));
        data.add(new MoreCall("대구광역시", "02-0000-0000"));
        data.add(new MoreCall("광주광역시", "02-0000-0000"));
        data.add(new MoreCall("전라남도", "02-0000-0000"));
        data.add(new MoreCall("전라북도", "02-0000-0000"));
        data.add(new MoreCall("제주특별자치도", "02-0000-0000"));


        MoreCallAdapter adapter = new MoreCallAdapter(data);

        ListView listView = findViewById(R.id.list_more_call);
        listView.setAdapter(adapter);
    }
}
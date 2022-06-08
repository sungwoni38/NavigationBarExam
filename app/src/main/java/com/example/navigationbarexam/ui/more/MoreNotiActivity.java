package com.example.navigationbarexam.ui.more;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.navigationbarexam.R;

import java.util.ArrayList;

public class MoreNotiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_noti);

        ArrayList<Notification> data = new ArrayList<>();
        data.add(new Notification("동의서 개정","개인정보처리 방침 개정으로 인해 내용이 수정되었음을 알립니다.", "2022-06-02"));
        data.add(new Notification("인천 지원금 인상","00월 00일로부터 인천 하루 6천원이었던 지원금이 7천원으로 이상됩니다. 맛있는 식사하시길 바랍니다. 감사합니다.", "2022-06-02"));

        MoreNotiAdapter adapter = new MoreNotiAdapter(data);
        ListView listView = findViewById(R.id.more_noti_listview);
        listView.setAdapter(adapter);
    }
}
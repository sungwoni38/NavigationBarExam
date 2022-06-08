package com.example.navigationbarexam.ui.card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.navigationbarexam.R;
import com.example.navigationbarexam.ui.card.CardFragment;

public class CardAddActivity extends AppCompatActivity {

    Button btn_check;
    EditText editMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_add);

        editMessage = findViewById(R.id.editMessage);
        btn_check = findViewById(R.id.btn_check);
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FragmentManager manager = getSupportFragmentManager();
//                FragmentTransaction transaction = manager.beginTransaction();
//
//                Bundle bundle = new Bundle();
//
//                //1. 입력 메시지
//                String message = editMessage.getText().toString();
//                //2. 데이터 담기
//                bundle.putString("message", message);
//                //3. 프래그먼트 선언
//                CardFragment cardFragment = new CardFragment();
//                //4. 프래그먼트에 데이터 남기기
//                cardFragment.setArguments(bundle);
//                //5. 프래그먼트 화면 보여주기
//                transaction.replace(R.id.textMessage, cardFragment).commit();
            }
        });
    }
}
package com.example.navigationbarexam;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomDialog extends Dialog {
    private TextView txt_con, txt_tit;
    private Button shutdownClick;

    public CustomDialog(@NonNull Context context, String title, String contents) {
        super(context);
        setContentView(R.layout.activity_custom_dialog);

        txt_tit = findViewById(R.id.txt_tit);
        txt_tit.setText(title);
        txt_con = findViewById(R.id.txt_con);
        txt_con.setText(contents);

        shutdownClick = findViewById(R.id.btn_shutdown);
        shutdownClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                //버튼 누르면 창을 닫아주는 함수
            }
        });
    }
}

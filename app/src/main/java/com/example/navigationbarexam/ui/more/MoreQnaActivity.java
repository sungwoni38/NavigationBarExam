package com.example.navigationbarexam.ui.more;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.navigationbarexam.CustomDialog;
import com.example.navigationbarexam.R;

import java.util.ArrayList;

public class MoreQnaActivity extends AppCompatActivity {
    private CustomDialog customDialog;
    private ListView list_card, list_shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_qna);

        //다이얼로그 밖의 화면 흐리게 만들어줌
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        layoutParams.dimAmount = 0.8f;
        getWindow().setAttributes(layoutParams);

        list_card = findViewById(R.id.list_card);
        list_card.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0) {
                    //커스텀다이어로그 열기
                    customDialog = new CustomDialog(MoreQnaActivity.this, "카드는 하루에 한번만 사용이 가능한가요?",
                            "하루 한번 사용 가능합니다.\n 결식 아동의 학교 밖에서의 올바른 식사를 위한 지원이기 때문에 석식으로 한번 사용이 가능합니다. " +
                                    "\n방학기간에는 하루에 중식, 석식으로 두번 사용 가능합니다.");
                    customDialog.show();
                } else if (i == 1) {
                    //커스텀다이어로그 열기
                    customDialog = new CustomDialog(MoreQnaActivity.this,"한번에 사용가능한 금액범위는 얼마인가요?",
                            "한끼 지원 금액은 지역마다 다릅니다. \n서울시 0,000원, 경기도 0,000원,~~~~~, 제주도 0,000원으로 하루 한끼 지원됩니다.");
                    customDialog.show();
                } else if(i == 2) {
                    //커스텀다이어로그 열기
                    customDialog = new CustomDialog(MoreQnaActivity.this,"금액 충전은 언제 되나요?",
                            "월별, 일주일 기간별로 충전일이 다릅니다. \n거주지에 해당하는 읍면동 사무소에 문의 부탁드립니다.");
                    customDialog.show();
                }else {
                    customDialog = new CustomDialog(MoreQnaActivity.this, "자녀 두명의 카드를 같이 사용할 수 있나요?",
                            "같이 사용 가능합니다. \n 금액범위 내에서 사용하시기 바랍니다.");
                    customDialog.show();
                }
            }
        });

        list_shop = findViewById(R.id.list_shop);
        list_shop.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0) {
                    //커스텀다이어로그 열기
                    customDialog = new CustomDialog(MoreQnaActivity.this, "카드는 하루에 한번만 사용이 가능한가요?",
                            "하루 한번 사용 가능합니다.\n 결식 아동의 학교 밖에서의 올바른 식사를 위한 지원이기 때문에 석식으로 한번 사용이 가능합니다. " +
                                    "\n방학기간에는 하루에 중식, 석식으로 두번 사용 가능합니다.");
                    customDialog.show();
                } else if(i==1) {
                    //커스텀다이어로그 열기
                    customDialog = new CustomDialog(MoreQnaActivity.this, "지도에 나온 가맹점이 가맹점이 아니래요.",
                            "하루 한번 사용 가능합니다.\n 결식 아동의 학교 밖에서의 올바른 식사를 위한 지원이기 때문에 석식으로 한번 사용이 가능합니다. " +
                                    "\n방학기간에는 하루에 중식, 석식으로 두번 사용 가능합니다.");
                    customDialog.show();
                } else if(i==2) {
                    //커스텀다이어로그 열기
                    customDialog = new CustomDialog(MoreQnaActivity.this, "가맹점 관련 질문1",
                            "하루 한번 사용 가능합니다.\n 결식 아동의 학교 밖에서의 올바른 식사를 위한 지원이기 때문에 석식으로 한번 사용이 가능합니다. " +
                                    "\n방학기간에는 하루에 중식, 석식으로 두번 사용 가능합니다.");
                    customDialog.show();
                } else {
                    //커스텀다이어로그 열기
                    customDialog = new CustomDialog(MoreQnaActivity.this, "카드는 하루에 한번만 사용이 가능한가요?",
                            "하루 한번 사용 가능합니다.\n 결식 아동의 학교 밖에서의 올바른 식사를 위한 지원이기 때문에 석식으로 한번 사용이 가능합니다. " +
                                    "\n방학기간에는 하루에 중식, 석식으로 두번 사용 가능합니다.");
                    customDialog.show();
                }
            }
        });

        ArrayList<MoreCard> data = new ArrayList<>();
        data.add(new MoreCard("카드는 하루에 한번만 사용이 가능한가요?"));
        data.add(new MoreCard("한번에 사용가능한 금액범위는 얼마인가요?"));
        data.add(new MoreCard("금액 충전은 언제 되나요?"));
        data.add(new MoreCard("자녀 두명의 카드를 같이 사용할 수 있나요?"));

        MoreCardAdapter adapter = new MoreCardAdapter(data);

        ListView listView = findViewById(R.id.list_card);
        listView.setAdapter(adapter);

        ArrayList<MoreShop> data_shop = new ArrayList<>();
        data_shop.add(new MoreShop("가맹점인데 아동급식카드로 결제가 안된대요."));
        data_shop.add(new MoreShop("지도에 나온 가맹점이 가맹점이 아니래요."));
        data_shop.add(new MoreShop("가맹점 관련 질문1"));

        MoreShopAdapter adapter1 = new MoreShopAdapter(data_shop);
        ListView listView1 = findViewById(R.id.list_shop);
        listView1.setAdapter(adapter1);
    }
}
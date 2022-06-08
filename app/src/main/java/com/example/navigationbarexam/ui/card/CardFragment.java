package com.example.navigationbarexam.ui.card;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navigationbarexam.R;
import com.example.navigationbarexam.databinding.FragmentCardBinding;

public class CardFragment extends Fragment {

    private FragmentCardBinding binding;
    private View view;
    private ImageButton img_btn_addCard;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_card, container, false);
        img_btn_addCard = (ImageButton) view.findViewById(R.id.img_btn_addCard);
        img_btn_addCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CardAddActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

//        TextView textMessage = view.findViewById(R.id.textMessage);
//
//        //넘어온 메시지 변수에 담기
//        String message = this.getArguments().getString("message");
//        //메시지 텍스트뷰에 담기
//        textMessage.setText(message);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

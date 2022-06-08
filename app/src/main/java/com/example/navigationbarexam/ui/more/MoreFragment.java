package com.example.navigationbarexam.ui.more;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navigationbarexam.R;
import com.example.navigationbarexam.databinding.FragmentMoreBinding;

public class MoreFragment extends Fragment {

    private FragmentMoreBinding binding;
    private View view;
    private Button btn_noti, btn_qna, btn_setting, btn_call;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_more, container, false);
        btn_noti = view.findViewById(R.id.btn_noti);
        btn_noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(getActivity(), MoreNotiActivity.class);
                intent01.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent01);
            }
        });
        btn_qna = view.findViewById(R.id.btn_qna);
        btn_qna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent02 = new Intent(getActivity(), MoreQnaActivity.class);
                intent02.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent02);
            }
        });
        btn_setting = view.findViewById(R.id.btn_setting);
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent03 = new Intent(getActivity(), MoreSettingAcitivity.class);
                intent03.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent03);
            }
        });

        btn_call = view.findViewById(R.id.btn_call);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent04 = new Intent(getActivity(), MoreCallActivity.class);
                intent04.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent04);
            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

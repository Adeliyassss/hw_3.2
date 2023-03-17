package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {


    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
        initClick();


    }

    private void initClick() {
        SecondFragment secondFragment = new SecondFragment();
        ThirdFragment thirdFragment = new ThirdFragment();
        ForthFragment forthFragment = new ForthFragment();
        FifthFragment fifthFragment = new FifthFragment();

        button2.setOnClickListener(new View.OnClickListener() {
            Bundle bundle2 = new Bundle();

            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {

                } else {
                    bundle2.putString("key", editText.getText().toString());
                    secondFragment.setArguments(bundle2);
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).addToBackStack("").commit();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            Bundle bundle3 = new Bundle();

            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {

                } else {
                    bundle3.putString("key", editText.getText().toString());
                    thirdFragment.setArguments(bundle3);
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, thirdFragment).addToBackStack("").commit();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            Bundle bundle4 = new Bundle();

            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {

                } else {
                    bundle4.putString("key", editText.getText().toString());
                    forthFragment.setArguments(bundle4);
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, forthFragment).addToBackStack("").commit();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            Bundle bundle5 = new Bundle();

            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {

                } else {
                    bundle5.putString("key", editText.getText().toString());
                    fifthFragment.setArguments(bundle5);
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fifthFragment).addToBackStack("").commit();
                }
            }
        });

    }


    private void initViews() {
        button2 = requireActivity().findViewById(R.id.btn_f_2);
        button3 = requireActivity().findViewById(R.id.btn_f_3);
        button4 = requireActivity().findViewById(R.id.btn_f_4);
        button5 = requireActivity().findViewById(R.id.btn_f_5);
        editText = requireActivity().findViewById(R.id.et_text);
    }
}
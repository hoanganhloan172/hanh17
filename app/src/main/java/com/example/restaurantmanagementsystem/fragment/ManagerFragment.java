package com.example.restaurantmanagementsystem.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.restaurantmanagementsystem.CategoryListActivity;
import com.example.restaurantmanagementsystem.MenuListActivity;
import com.example.restaurantmanagementsystem.R;

public class ManagerFragment extends Fragment {

    private TextView tvAdditionalMenulogo,tvCategorymanage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.manager_fragment, container, false);



        tvAdditionalMenulogo = (TextView) view.findViewById(R.id.tv_additional_menu);

        tvCategorymanage = (TextView) view.findViewById(R.id.tv_category_manage);


        tvAdditionalMenulogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MenuListActivity.class);
                startActivity(intent);
            }
        });

        tvCategorymanage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryListActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}

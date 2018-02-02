package com.example.tablayout.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tablayout.R;

/**
 * 项目名称：TabLayout
 * 包名：com.example.tablayout.fragment
 * 文件名：GirlFragment
 * 创建者：LBW
 * 创建时间：2017/12/1811:322017
 * 描述：TODO
 */

public class GirlFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
      view=inflater.inflate(R.layout.gril_fragment,null);
        return view;
    }
}

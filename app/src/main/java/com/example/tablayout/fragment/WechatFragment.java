package com.example.tablayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tablayout.R;

/**
 * 项目名称：TabLayout
 * 包名：com.example.tablayout.fragment
 * 文件名：WechatFragment
 * 创建者：LBW
 * 创建时间：2017/12/1811:322017
 * 描述：机器人聊天界面
 */

public class WechatFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
      view=inflater.inflate(R.layout.wechat_fragment,null);
        return view;
    }
}

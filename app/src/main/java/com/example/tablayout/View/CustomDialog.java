package com.example.tablayout.View;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import com.example.tablayout.R;

/**
 * 项目名称：TabLayout
 * 包名：com.example.tablayout.View
 * 文件名：CustomDialog
 * 创建者：LBW
 * 创建时间：2017/12/3110:422017
 * 描述：自定义Dialog
 */

public class CustomDialog extends Dialog{
        //定义模板
    public CustomDialog(Context context,int layout,int style) {
        this(context, WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,layout,style,
                Gravity.CENTER);
    }
    //定义属性
    public CustomDialog(Context context,int width,int height,int layout,
                        int style,int gravity,int anim){
            super(context, style);
        //设置属性
        setContentView(layout);
        Window window=getWindow();
        WindowManager.LayoutParams layoutParams=window.getAttributes();
        layoutParams.width= WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.height=WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.gravity=gravity;
        window.setAttributes(layoutParams);
        window.setWindowAnimations(anim);
    }
    //实例
    public CustomDialog(Context context,int width,int height,int layout,int style,int gravity){
            this(context,width,height,layout,style,gravity,R.style.pop_anim_style );

    }


}

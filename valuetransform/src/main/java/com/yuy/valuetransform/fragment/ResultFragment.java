package com.yuy.valuetransform.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yuy.valuetransform.R;

/**
 * Author: yuyang
 * Date:2019/10/28 16:07
 * Description: 展示结果的fragment
 * Version:
 */
public class ResultFragment extends Fragment {

    private TextView tv_show;
    
    private final static String TAG = ResultFragment.class.getSimpleName();

    /**
     * 第一次加载视图
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_result, null);

        Log.e(TAG, "---ResultFragment onCreateView ---");
        
        tv_show = view.findViewById(R.id.id_tv_fc);

        //先去调用 getArgus 方法获取bundle
        Bundle bundle = getArguments();

        if (bundle != null) {
            String info = bundle.getString("info");
            tv_show.setText(info);
        }

        return view;
    }

    /**
     * 表示Activity 与 Fragment关联时回调的方法
     * @param activity
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.e(TAG, "---ResultFragment onAttach ---");
    }


    /**
     * 表示当fragment 第一次被创建时回调的方法
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "---ResultFragment onCreate ---");
    }

//    /**
//     * 表示当fragment 第一次绘制用户界面时回调的方法
//     * @param inflater
//     * @param container
//     * @param savedInstanceState
//     * @return
//     */
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        Log.e(TAG, "---ResultFragment onCreateView ---");
//
//        return inflater.inflate(R.layout.fragment_hot, null);
//
//    }


    /**
     *表示当fragment 所属的activity 创建成功时回调的方法
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "---ResultFragment onActivityCreated ---");
    }

    /**
     * 表示fragment 能够被用户看到时回调的方法
     */
    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "---ResultFragment onStart ---");
    }


    /**
     * 表示fragment 能够获取用户焦点回调的方法
     */
    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "---ResultFragment onResume ---");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "---ResultFragment onPause ---");
    }


    /**
     * fragment 完全被用户遮挡时回调的方法
     */
    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "---ResultFragment onStop ---");
    }


    /**
     * 表示activity 中的fragment 的试图被移除时回调的方法
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "---ResultFragment onDestroyView ---");
    }

    /**
     * 表示fragment 被销毁时回调的方法
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "---ResultFragment onDestroy ---");
    }

    /**
     * 表示 fragment 与activity 失去关联时回调的方法
     */
    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "---ResultFragment onDetach ---");
    }

}

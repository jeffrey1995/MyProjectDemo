package com.mrtian.project.ui.fragment;

import android.view.View;

import com.mrtian.project.MyApplication;
import com.mrtian.project.R;
import com.mrtian.project.utils.AppUtils;
import com.mrtian.project.utils.LogUtil;
import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;
import com.tsy.sdk.myokhttp.response.IResponseHandler;
import com.tsy.sdk.myokhttp.response.RawResponseHandler;

/**
 * Created by tianxiying on 16/7/18.
 */
public class MineFragment extends BasePageFragment {

    @Override
    protected void initView(View view) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    public void fetchData() {

        MyOkHttp.get().get(this.getActivity(), "http://www.baidu.com", null, new RawResponseHandler() {
            @Override
            public void onSuccess(int i, String s) {
                LogUtil.d("txy", s);
                AppUtils.showToast(MyApplication.getContext(), s);
            }

            @Override
            public void onFailure(int i, String s) {
                LogUtil.d("txy", s);
                AppUtils.showToast(MyApplication.getContext(), s);
            }
        });
    }
}

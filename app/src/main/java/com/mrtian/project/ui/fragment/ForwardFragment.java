package com.mrtian.project.ui.fragment;

import android.os.Handler;
import android.view.View;

import com.jingchen.pulltorefresh.PullToRefreshLayout;
import com.jingchen.pulltorefresh.PullableListView;
import com.mrtian.project.R;
import com.mrtian.project.utils.LogUtil;

/**
 * Created by tianxiying on 16/7/18.
 */
public class ForwardFragment extends BasePageFragment {

    private PullToRefreshLayout refresh_rl;
    private PullableListView listview;

    @Override
    protected void initView(View view) {
        listview = (PullableListView) view.findViewById(R.id.news_list);
        refresh_rl = (PullToRefreshLayout) view.findViewById(R.id.refresh_rl);
        refresh_rl.setOnPullListener(new PullToRefreshLayout.OnPullListener() {
            @Override
            public void onRefresh(PullToRefreshLayout pullToRefreshLayout) {
                LogUtil.d("txy","触发下拉刷新了!");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh_rl.refreshFinish(PullToRefreshLayout.SUCCEED);
                    }
                },3000);
            }

            @Override
            public void onLoadMore(PullToRefreshLayout pullToRefreshLayout) {
                LogUtil.d("txy","触发下拉加载了!");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh_rl.refreshFinish(PullToRefreshLayout.SUCCEED);
                    }
                },3000);
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_forward;
    }

    @Override
    public void fetchData() {

    }
}

package com.ryx.butterknife;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author twh
 */
public class MainActivity extends BaseActivity{

    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.tv2)
    TextView tv2;
    @BindView(R.id.bt1)
    Button bt1;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    /**
     * 绑定res里资源对象
     */
    @SuppressLint("ResourceAsColor")
    @OnClick({R.id.tv2, R.id.bt1,R.id.tv1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                tv1.setTextColor(R.color.colorPrimaryDark);
            case R.id.tv2:
                tv2.setTextColor(R.color.colorAccent);
                break;
            case R.id.bt1:
                bt1.setText(R.string.app_name);
                break;
            default:
        }
    }

}

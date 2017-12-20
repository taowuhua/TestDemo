package com.ryx.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @author twh
 */
public abstract class BaseActivity extends AppCompatActivity {
    /**
     *让布局可以出现在最上边，方便查看代码
     * @return Layout
     */
    public abstract int getLayoutId();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }
}

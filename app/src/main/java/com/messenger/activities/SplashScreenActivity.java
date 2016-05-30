package com.messenger.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.messenger.R;
import com.messenger.views.ISplashScreenActivityView;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class SplashScreenActivity extends AppBaseActivity implements ISplashScreenActivityView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);
    }
}

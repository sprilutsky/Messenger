package com.messenger.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.messenger.R;
import com.messenger.views.IAuthScreenActivityView;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class AuthScreenActivity extends AppBaseActivity implements IAuthScreenActivityView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_screen_activity);
    }
}

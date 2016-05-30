package com.messenger.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.messenger.R;
import com.messenger.views.IRegestrationScreenActivityView;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class RegistrationScreenActivity extends AppBaseActivity implements IRegestrationScreenActivityView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_screen_activity);
    }
}

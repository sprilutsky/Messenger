package com.messenger.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.messenger.R;
import com.messenger.views.IUserProfileScreenActivityView;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class UserProfileScreenActivity extends AppBaseActivity implements IUserProfileScreenActivityView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile_screen_activity);
    }
}

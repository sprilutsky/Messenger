package com.messenger.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.messenger.R;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class AboutScreenActivity extends AppBaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_screen_activity);
    }
}

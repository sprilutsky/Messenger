package com.messenger.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.messenger.R;
import com.messenger.views.IChatScreenActivityView;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class ChatScreenActivity extends AppBaseActivity implements IChatScreenActivityView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_screen_activity);
    }
}

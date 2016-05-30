package com.messenger.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.messenger.R;
import com.messenger.views.IRecentMessagesScreenActivityView;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class RecentMessagesScreenActivity extends AppBaseActivity implements IRecentMessagesScreenActivityView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recent_messages_screen_activity);
    }
}

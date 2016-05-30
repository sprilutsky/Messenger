package com.messenger.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.messenger.R;
import com.messenger.presenters.impl.MainScreenPresenter;
import com.messenger.presenters.interfaces.IMainScreenPresenter;
import com.messenger.views.IMainScreenView;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class MainScreenActivity extends AppBaseActivity implements IMainScreenView{

    private IMainScreenPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.presenter = new MainScreenPresenter(this);
        setContentView(R.layout.main_screen_activity);
    }
}

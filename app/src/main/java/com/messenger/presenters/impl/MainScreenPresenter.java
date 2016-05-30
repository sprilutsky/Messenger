package com.messenger.presenters.impl;

import com.messenger.presenters.interfaces.IMainScreenPresenter;
import com.messenger.views.IMainScreenView;

/**
 * Created by Sergey Prilutsky on 30.05.16.
 */
public class MainScreenPresenter implements IMainScreenPresenter {

    private IMainScreenView view;

    public MainScreenPresenter(IMainScreenView view) {
        this.view = view;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }
}

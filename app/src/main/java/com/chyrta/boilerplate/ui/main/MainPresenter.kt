package com.chyrta.boilerplate.ui.main

import com.chyrta.boilerplate.data.DataManager
import com.chyrta.boilerplate.injection.ConfigPersistent
import com.chyrta.boilerplate.ui.base.BasePresenter
import javax.inject.Inject

@ConfigPersistent
class MainPresenter
@Inject constructor(private val mDataManager: DataManager) : BasePresenter<MainView>() {

    private var mMainView: MainView? = null

    override fun attachView(mvpView: MainView) {
        mMainView = mvpView
    }

}

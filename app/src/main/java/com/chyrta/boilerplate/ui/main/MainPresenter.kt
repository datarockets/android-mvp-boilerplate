package com.chyrta.boilerplate.ui.main

import com.chyrta.boilerplate.data.DataManager
import com.chyrta.boilerplate.injection.ConfigPersistent
import com.chyrta.boilerplate.ui.base.Presenter
import io.reactivex.disposables.Disposable
import javax.inject.Inject

@ConfigPersistent
class MainPresenter
@Inject constructor(private val mDataManager: DataManager): Presenter<MainView> {

    private var mMainView: MainView? = null
    private var mDisposable: Disposable? = null

    override fun attachView(mvpView: MainView) {
        mMainView = mvpView
    }

    override fun detachView() {
        mMainView = null
        mDisposable?.dispose()
    }

}

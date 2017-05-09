package com.chyrta.boilerplate.ui.base


interface Presenter<in V: MvpView> {
    fun attachView(mvpView: V)
    fun detachView()
}

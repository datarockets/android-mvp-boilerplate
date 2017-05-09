package com.chyrta.boilerplate

import android.app.Application
import com.chyrta.boilerplate.injection.component.ApplicationComponent
import com.chyrta.boilerplate.injection.module.ApplicationModule

class BoilerplateApplication : Application() {

    private var mApplicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {

        }

    }

    fun getComponent(): ApplicationComponent {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(ApplicationModule(this))
                    .build()
        }
        return mApplicationComponent!!
    }

    fun setComponent(applicationComponent: ApplicationComponent) {
        mApplicationComponent = applicationComponent
    }

}

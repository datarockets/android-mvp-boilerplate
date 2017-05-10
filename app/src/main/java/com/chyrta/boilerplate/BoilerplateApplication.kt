package com.chyrta.boilerplate

import android.app.Application
import android.content.Context
import com.chyrta.boilerplate.injection.component.ApplicationComponent
import com.chyrta.boilerplate.injection.component.DaggerApplicationComponent
import com.chyrta.boilerplate.injection.module.ApplicationModule
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

class BoilerplateApplication : Application() {

    internal var mApplicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            LeakCanary.install(this)
        }

    }

    var component: ApplicationComponent
        get() {
            if (mApplicationComponent == null) {
                mApplicationComponent = DaggerApplicationComponent.builder()
                        .applicationModule(ApplicationModule(this))
                        .build()
            }
            return mApplicationComponent!!
        }
        set(applicationComponent) {
            mApplicationComponent = applicationComponent
        }

    companion object {
        operator fun get(context: Context): BoilerplateApplication {
            return context.applicationContext as BoilerplateApplication
        }
    }

}

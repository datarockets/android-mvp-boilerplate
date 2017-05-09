package com.chyrta.boilerplate.injection.module

import android.app.Application
import android.content.Context
import com.chyrta.boilerplate.injection.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    fun providesApplication(): Application {
        return mApplication
    }

    @Provides
    @ApplicationContext
    fun providesContext(): Context {
        return mApplication
    }

}

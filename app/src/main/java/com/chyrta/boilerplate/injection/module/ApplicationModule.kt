package com.chyrta.boilerplate.injection.module

import android.app.Application
import android.content.Context
import com.chyrta.boilerplate.data.remote.BoilerplateService
import com.chyrta.boilerplate.data.remote.BoilerplateServiceFactory
import com.chyrta.boilerplate.injection.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    internal fun providesApplication(): Application {
        return mApplication
    }

    @Provides
    @ApplicationContext
    internal fun providesContext(): Context {
        return mApplication
    }

    @Provides
    @Singleton
    internal fun providesBoilerplateService(): BoilerplateService {
        return BoilerplateServiceFactory.makeBoilerplateService()
    }

}

package com.chyrta.boilerplate.injection.component

import android.app.Application
import android.content.Context
import com.chyrta.boilerplate.injection.ApplicationContext
import com.chyrta.boilerplate.injection.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    @ApplicationContext fun context(): Context
    fun application(): Application
}

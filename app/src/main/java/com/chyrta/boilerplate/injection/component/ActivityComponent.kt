package com.chyrta.boilerplate.injection.component

import com.chyrta.boilerplate.injection.PerActivity
import com.chyrta.boilerplate.injection.module.ActivityModule
import com.chyrta.boilerplate.ui.base.BaseActivity
import com.chyrta.boilerplate.ui.main.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)
    fun inject(mainActivity: MainActivity)
}

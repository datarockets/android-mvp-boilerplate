package com.chyrta.boilerplate.injection.component

import com.chyrta.boilerplate.injection.ConfigPersistent
import com.chyrta.boilerplate.injection.module.ActivityModule
import dagger.Component

@ConfigPersistent
@Component(dependencies = arrayOf(ApplicationComponent::class))
interface ConfigPersistentComponent {
    fun activityComponent(activityModule: ActivityModule): ActivityComponent
}
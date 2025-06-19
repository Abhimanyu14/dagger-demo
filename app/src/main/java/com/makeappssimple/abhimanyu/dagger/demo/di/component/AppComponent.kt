package com.makeappssimple.abhimanyu.dagger.demo.di.component

import com.makeappssimple.abhimanyu.dagger.demo.activity.MainActivity
import com.makeappssimple.abhimanyu.dagger.demo.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
    ]
)
interface AppComponent {
    fun inject(
        activity: MainActivity,
    )
}

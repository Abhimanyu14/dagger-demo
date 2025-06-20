package com.makeappssimple.abhimanyu.dagger.demo.di.component

import android.app.Application
import com.makeappssimple.abhimanyu.dagger.demo.activity.MainActivity
import com.makeappssimple.abhimanyu.dagger.demo.di.module.AppModule
import dagger.Component
import dagger.BindsInstance
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
    ],
)
interface AppComponent {
    // Use @Component.Builder only for legacy projects when required.
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
        ): AppComponent
    }

    fun inject(
        activity: MainActivity,
    )
}

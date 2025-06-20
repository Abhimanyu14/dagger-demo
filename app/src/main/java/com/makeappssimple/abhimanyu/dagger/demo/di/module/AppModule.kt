package com.makeappssimple.abhimanyu.dagger.demo.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {
    @Singleton
    @Provides
    fun provideSomeString(
        application: Application,
    ): String {
        return "Dagger ${application.packageName}!"
    }
}

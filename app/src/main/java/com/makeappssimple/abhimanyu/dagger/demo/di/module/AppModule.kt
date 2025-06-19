package com.makeappssimple.abhimanyu.dagger.demo.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {
    @Singleton
    @Provides
    fun provideSomeString(): String = "Dagger!"
}

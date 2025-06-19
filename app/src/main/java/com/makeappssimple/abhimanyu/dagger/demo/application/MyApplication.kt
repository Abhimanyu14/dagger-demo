package com.makeappssimple.abhimanyu.dagger.demo.application

import android.app.Application
import com.makeappssimple.abhimanyu.dagger.demo.di.component.AppComponent
import com.makeappssimple.abhimanyu.dagger.demo.di.component.DaggerAppComponent

class MyApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        setUpDi()
    }

    private fun setUpDi() {
        appComponent = DaggerAppComponent.create()
    }
}

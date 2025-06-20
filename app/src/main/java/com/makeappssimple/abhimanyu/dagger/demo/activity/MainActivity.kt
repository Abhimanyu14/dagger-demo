package com.makeappssimple.abhimanyu.dagger.demo.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.makeappssimple.abhimanyu.dagger.demo.application.MyApplication
import com.makeappssimple.abhimanyu.dagger.demo.ui.MyApp
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    @Inject
    lateinit var someString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setUpDi()

        setContent {
            MyApp(
                someString = someString,
            )
        }
    }

    private fun setUpDi() {
        (application as? MyApplication)?.appComponent?.inject(
            activity = this,
        )
    }
}

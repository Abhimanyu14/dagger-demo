package com.makeappssimple.abhimanyu.dagger.demo.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.makeappssimple.abhimanyu.dagger.demo.ui.theme.DaggerDemoTheme

@Composable
internal fun MyApp(
    someString: String,
) {
    DaggerDemoTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
        ) { innerPadding ->
            Text(
                text = "Hello $someString!",
                modifier = Modifier.padding(
                    paddingValues = innerPadding,
                ),
            )
        }
    }
}

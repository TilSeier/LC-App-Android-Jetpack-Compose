package com.example.lc_app_android_jatpack_compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import com.example.lc_app_android_jatpack_compose.composables.SignedOutIntro
import com.example.lc_app_android_jatpack_compose.ui.LCAppAndroidJatpackComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LCAppAndroidJatpackComposeTheme {
                SignedOutIntro()
            }
        }
    }
}

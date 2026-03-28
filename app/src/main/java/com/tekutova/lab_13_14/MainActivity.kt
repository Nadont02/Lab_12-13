package com.tekutova.lab_13_14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.tekutova.lab_13_14.ui.theme.Lab_1314Theme
import com.tekutova.lab_13_14.ui_model.GameScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab_1314Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPaddding ->
                    GameScreen(
                        modifier = Modifier.padding(innerPaddding)
                    )
                }
            }
        }
    }
}
//Page 35
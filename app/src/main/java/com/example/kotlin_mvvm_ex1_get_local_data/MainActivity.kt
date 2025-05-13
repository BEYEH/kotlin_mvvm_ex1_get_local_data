package com.example.kotlin_mvvm_ex1_get_local_data

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_mvvm_ex1_get_local_data.ui.theme.Kotlin_mvvm_ex1_get_local_dataTheme
import com.example.kotlin_mvvm_ex1_get_local_data.view.HomePage
import com.example.kotlin_mvvm_ex1_get_local_data.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class]

        setContent {
            Kotlin_mvvm_ex1_get_local_dataTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomePage(modifier = Modifier.padding(innerPadding), homeViewModel)
                }
            }
        }
    }
}

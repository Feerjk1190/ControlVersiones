package com.example.navegacionbaja

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.navegacionbaja.navigation.AppNavigation
import com.example.navegacionbaja.ui.home.HomeScreen
import com.example.navegacionbaja.ui.home.HomeUiState
import com.example.navegacionbaja.ui.theme.NavegacionBajaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NavegacionBajaTheme {
                AppNavigation()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun NavegacionBajaPreview() {
    NavegacionBajaTheme {
        HomeScreen(
            uiState = HomeUiState(),
            onIncrement = {}
        )
    }
}
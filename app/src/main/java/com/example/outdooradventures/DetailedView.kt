package com.example.outdooradventures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.outdooradventures.ui.theme.OutdoorAdventuresTheme

class DetailedView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OutdoorAdventuresTheme {
                Column() {
                    Button(
                        onClick = {}
                    ) {
                        Text("Full list of gear")//All listed gear
                    }
                    Column() {
                        Button(
                            onClick = {}
                        ) {
                            Text("Back to Base")
                        }

                    }
                }
            }
        }
    }
}

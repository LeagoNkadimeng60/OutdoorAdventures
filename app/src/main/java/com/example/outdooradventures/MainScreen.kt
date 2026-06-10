package com.example.outdooradventures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.outdooradventures.ui.theme.OutdoorAdventuresTheme
import org.w3c.dom.Comment

class MainScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OutdoorAdventuresTheme {
                var screen = remember { mutableStateOf("Campsite Commander") }
                var index =remember { mutableStateOf(0) }
                var score = remember{mutableStateOf(0)}
                Text("HEllo Welcome To Campsite Commander")
                val Items=arrayOf("Tent","Marshmallows","Flashlight")
                val Catergory=arrayOf("Shelter","Food","Safety")
                var quantity=arrayOf(1,3,2)
                var cooments=arrayOf("4- person waterproof","For S'mores(Mega Size)","Check batteries(AA)")

                Column() {
                    Button(
                        onClick = {}
                    ) {
                        Text("Item Name")

                    }
                    Button(
                        onClick = {}
                    ) {
                        Text("Catergory")

                    }
                    Button(
                        onClick = {}
                    ) {
                        Text("Comments")

                    }
                }


                                                                    }
            }
        }
    }




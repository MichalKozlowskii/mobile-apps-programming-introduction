package com.example.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContent {
            Greeting(name = "michu")
        }*/
        /*setContent {
            Column {
                Text(text = "Jeden")
                Text(text = "Dwa")
            }
        }*/
        /*setContent {
            Row {
                Text(text = "Jeden")
                Text(text = "Dwa")
            }
        }*/
        /*setContent {
            Column(
                modifier = Modifier
                    .fillMaxWidth() // szerokość kolumny
                    .background(Color.Cyan) // kolor tła kolumny
            ) {
                Text(text = "Jeden")
                Text(text = "Dwa")
            }
        }*/
        /*setContent {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Jeden")
                Text(text = "Dwa")
            }
        }*/
        /*setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Cyan),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Jeden")
                Text(text = "Dwa")
            }
        }*/
        setContent {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Cyan),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Jeden")
                Text(text = "Dwa")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeBasicsTheme {
        Greeting("Michu")
    }
}
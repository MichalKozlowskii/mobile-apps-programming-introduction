package com.example.lista4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lista4.ui.theme.Lista4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lista4Theme {
            }
        }
    }
}

@Composable
fun QuizUI() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.weight(0.1f))
        Text(
            text = "Pytanie 1/10",
            fontSize = 34.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(0.1f)
        )
        LinearProgressIndicator(
            progress = {
                0.4f
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp)
                .weight(0.01f) // Adjust padding
        )
        Card(
            modifier = Modifier
                .weight(0.68f)
                .padding(horizontal = 20.dp)
        ) {
            

        }
        Button(
            onClick = {},
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.1f)
                .padding(horizontal = 20.dp, vertical = 10.dp)
        ) {
            Text(text = "Następne", fontSize = 24.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuizUIPreview() {
    Lista4Theme {
        QuizUI()
    }
}
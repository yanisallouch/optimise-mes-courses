package com.yanisallouch.thecomposequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yanisallouch.thecomposequadrant.ui.theme.TheComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    TheComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun TheComposeQuadrant(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.weight(1f, true)) {
            Box(
                modifier = modifier
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
                    .weight(1f)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = Bold,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify
                )
            }
            Box(
                modifier = modifier
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
                    .weight(1f)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Image composable",
                    fontWeight = Bold,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(modifier = Modifier.weight(1f, true)) {
            Box(
                modifier = modifier
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
                    .weight(1f)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Row composable",
                    fontWeight = Bold,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify
                )
            }
            Box(
                modifier = modifier
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .weight(1f)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Column composable",
                    fontWeight = Bold,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheComposeQuadrantTheme {
        TheComposeQuadrant()
    }
}
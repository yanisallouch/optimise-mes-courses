package com.yanisallouch.theshoppinglist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.yanisallouch.theshoppinglist.ui.theme.TheShoppingListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheShoppingListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    TheShoppingList()
                }
            }
        }
    }
}

@Composable
fun TheShoppingList(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Header(modifier)
        Cards()
    }
}

@Composable
fun Header(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Clear")
        }
        Box(contentAlignment = Alignment.Center) {
            Text(text = "1999.99 €", textAlign = TextAlign.Center)
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Save")
        }
    }
}

@Composable
fun Cards() {
    for (i in 1..3){
        makeCard()
    }
}

fun makeCard() {
    
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TheShoppingListTheme {
        TheShoppingList()
    }
}
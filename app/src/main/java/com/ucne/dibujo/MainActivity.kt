package com.ucne.dibujo

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ucne.dibujo.ui.theme.DibujoTheme
import com.ucne.dibujo.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DibujoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla()
                }
            }
        }
    }
}

@Composable
fun Pantalla(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){

        var text by remember { mutableStateOf("") }

        OutlinedTextField(
            value = text ,
            onValueChange = {text = it},
            label = { Text(text = "Nombre")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp, 0.dp)

        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp, 0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            border = BorderStroke(1.dp, Color.Gray),
            onClick = { /*TODO*/ }

        ) {
            Icon(
                modifier = Modifier.size(20.dp),
                painter = painterResource(R.drawable.checkmark),
                contentDescription = null,
                tint = Color(0xFF02678C)
            )
            Text(
                text = " Guardar",
                color = Color(0xFF02678C)
            )
        }
    }
}

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun Preview() {
    DibujoTheme {
        Pantalla()
    }
}
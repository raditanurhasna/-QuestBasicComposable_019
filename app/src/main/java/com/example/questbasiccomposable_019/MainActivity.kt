package com.example.questbasiccomposable_019

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_019.ui.theme.QuestBasicComposable_019Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_019Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose( modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            modifier = modifier,
            fontSize = 60.sp,
            color = Color.Black
        )
        Text(
            text = "Ini adalah halaman login",
            style = TextStyle(
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Blue
            )
        )
        Image(
            painterResource(id = R.drawable.download),
            contentDescription = null,
            modifier =  Modifier
                .size(200.dp)
        )
        Text(
            text = "Nama",
            modifier = modifier,
            fontSize = 20.sp,
            color = Color.Black
        )
        Text(
            text = "Radita Nurhasna",
            modifier = modifier,
            fontSize = 30.sp,
            color = Color.Black
        )
        Text(
            text = "20220140019",
            modifier = modifier,
            fontSize = 20.sp,
            color = Color.Black
        )
        Image(
            painterResource(id = R.drawable.fotodita),
            contentDescription = null,
            modifier =  Modifier
                .size(500.dp)
                .shadow(150.dp, spotColor = Color.Black)
        )

    }
}

@Composable
fun BasicCompose(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_019Theme {
        BasicCompose("Android")
    }
}













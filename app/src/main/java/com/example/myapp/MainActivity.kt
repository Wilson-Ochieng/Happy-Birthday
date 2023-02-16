package com.example.myapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage("Happy Birthday Sam!", "- from Emma")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingtWithText(message: String, from: String) {


    Column {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(start = 16.dp, top = 16.dp)

        )

        Text(

            text = from,
            fontSize = 24.sp
        )
    }


}

@Composable

fun BirthdayGreetingWithImage(message: String, from: String) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop

        )
        BirthdayGreetingtWithText("Happy Birthday Sam!", " - from Wilson")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyAppTheme {
//        BirthdayGreetingtWithText( "Happy Birthday Sam!"," - from Wilson")
        BirthdayGreetingWithImage("Happy Birthday Sam!", "- from Emma")
    }
}
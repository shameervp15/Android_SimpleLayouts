package com.example.taskscompletedscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskscompletedscreen.ui.theme.TasksCompletedScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TasksCompletedScreenTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TasksImage(
                        message1 = stringResource(R.string.FirstText),
                        message2 = stringResource(R.string.SecondText)
                    )
                }
            }
        }
    }
}

@Composable
fun TasksText(message1: String, message2: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = message1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 8.dp, bottom = 8.dp)
        )
        Text(
            text = message2,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun TasksImage(message1: String, message2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.task_completed)
    Column(modifier = modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
        )
        TasksText(
            message1 = message1,
            message2 = message2
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TasksCompletedScreenTheme {
        TasksImage(
            message1 = stringResource(R.string.FirstText),
            message2 = stringResource(R.string.SecondText)
        )
    }
}
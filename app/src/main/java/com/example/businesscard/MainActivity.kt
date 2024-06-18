package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF72DAE7)),
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-40).dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainHeaderImage()
        MainHeaderText()
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(start = 32.dp)
        ) {
            FooterText()
        }
    }
}


@Composable
fun MainHeaderText() {
    Text(
        text = stringResource(R.string.FullName),
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = stringResource(R.string.Designation),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun MainHeaderImage() {
    val image = painterResource(R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .size(192.dp)
            .background(Color(0xFF101312))
    )
}

@Composable
fun FooterText() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp)
    ) {
        Image(Icons.Rounded.Call, contentDescription = null, modifier = Modifier.padding(8.dp))
        Text(
            text = stringResource(R.string.PhoneNumber),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )

    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp)
    ) {
        Image(Icons.Rounded.Share, contentDescription = null, modifier = Modifier.padding(8.dp))
        Text(
            text = stringResource(R.string.ShareText),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )

    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp)
    ) {
        Image(Icons.Rounded.Email, contentDescription = null, modifier = Modifier.padding(8.dp))
        Text(
            text = stringResource(R.string.EmailText),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF72DAE7)),
        ) {
            BusinessCardApp()
        }
    }
}

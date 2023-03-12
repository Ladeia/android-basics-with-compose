package com.antonioladeia.quadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.antonioladeia.quadrants.ui.theme.QuadrantsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CardHolder()
                }
            }
        }
    }
}

@Composable
fun CardHolder() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Row(Modifier.weight(1f)) {
            BasicCard(
                title = stringResource(R.string.title1),
                description = stringResource(R.string.description1),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            BasicCard(
                title = stringResource(R.string.title2),
                description = stringResource(R.string.description2),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            BasicCard(
                title = stringResource(R.string.title3),
                description = stringResource(R.string.description3),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            BasicCard(
                title = stringResource(R.string.title4),
                description = stringResource(R.string.description4),
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun BasicCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                color = backgroundColor
            )
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally,

    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    bottom = 16.dp
                )
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    QuadrantsTheme {
        CardHolder()
    }
}
package com.example.quadrantescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantescompose.ui.theme.QuadrantesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantesComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    QuadranteComposable()
                }
            }
        }
    }
}


@Composable
fun QuadranteComposable() {
    CardWithInfos(
        color = Color.Green,
        color2 = Color.Yellow,
        color3 = Color.Cyan,
        color4 = Color.LightGray
    )
}

@Composable
fun CardWithInfos(color: Color, color2: Color, color3: Color, color4: Color) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Row(
            Modifier
                .weight(1f)
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Column(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(color)
                    .testTag("First Column")
            ) {
                CardInformations(
                    title = stringResource(id = R.string.first_title), subtitle = stringResource(
                        id = R.string.first_description
                    )
                )

            }
            Column(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(color2)
                    .testTag("Second Column")

            ) {
                CardInformations(
                    title = stringResource(id = R.string.second_title), subtitle = stringResource(
                        id = R.string.second_description
                    )
                )
            }

        }
        Row(
            Modifier
                .weight(1f)
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Column(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(color3)
                    .testTag("Third Column")

            ) {
                CardInformations(
                    title = stringResource(id = R.string.third_title), subtitle = stringResource(
                        id = R.string.third_description
                    )
                )
            }
            Column(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(color4)
                    .testTag("Fourth Column")

            ) {
                CardInformations(
                    title = stringResource(id = R.string.fourth_title), subtitle = stringResource(
                        id = R.string.fourth_description
                    )
                )
            }


        }
    }

}

@Composable
fun CardInformations(title: String, subtitle: String) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentWidth()
            .wrapContentHeight()
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
        Text(text = subtitle, textAlign = TextAlign.Justify)

    }
}

@Preview(showSystemUi = true)
@Composable
fun QuadranteComposablePreview() {
    QuadranteComposable()
}
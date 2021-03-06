package com.example.project_1_ravture_bestie_app.myui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1_ravture_bestie_app.model.MusicVenues
import com.example.project_1_ravture_bestie_app.model.Restaurants
import com.example.project_1_ravture_bestie_app.myui.ui.theme.Project_1_Ravture_Bestie_AppTheme

class MusicList : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_1_Ravture_Bestie_AppTheme {
                // A surface container using the 'background' color from the theme

                    AreaMusic(MusicHouston)

            }
        }
    }
}

@Composable
fun AreaMusic(musicList:List<MusicVenues>)
{

    Scaffold(

        topBar = {
           //
            TopAppBar(modifier = Modifier.background(colorResource(id = com.example.project_1_ravture_bestie_app.R.color.purple_500)),
                title = { Text(
                        text="LOCAL MUSIC", fontWeight = FontWeight.Bold,
                        color = androidx.compose.ui.graphics.Color.White,
                        fontSize = 25.sp) }
            )

        }

    )
    {

        LazyColumn(
            Modifier
                .fillMaxWidth()
                .background(colorResource(id = com.example.project_1_ravture_bestie_app.R.color.purple_200)),
            contentPadding = PaddingValues(16.dp)
        )
        {

            item {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 25.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically


                ) {

                    Text(
                        text = "Houston Area",
                        style = MaterialTheme.typography.h5)

                }
            }

            items(musicList)
            {MusicVenues->

                MusicCard(MusicVenues.venuename, MusicVenues.bandname, MusicVenues.musictype, MusicVenues.imageMus )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    Project_1_Ravture_Bestie_AppTheme {

    }
}
package edu.uksw.fti.pam.pamactivity.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pamactivity.ui.theme.PAMActivityTheme
import me.saket.swipe.SwipeAction
import me.saket.swipe.SwipeableActionsBox
import edu.uksw.fti.pam.pamactivity.R


@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
    ){
        Card( elevation = 0.dp) {
            Image(painter = painterResource(id = R.drawable.bg), contentDescription = "background")
            Column( modifier =  Modifier.padding(top = 27.dp, start = 30.dp)) {
                val logo1 = Modifier
                    .size(30.dp)
                Image(painter = painterResource(id = R.drawable.logo1),
                    contentDescription = null,
                    modifier = logo1)

            }
            Column( modifier =  Modifier.padding(top = 25.dp, start = 70.dp)) {
                Text("SAMBARA", style = MaterialTheme.typography.h3)
            }

            Column( modifier =  Modifier.padding(top = 45.dp, start = 70.dp)) {
                Text(text = "Samsat Mobile Jawa Barat", style = MaterialTheme.typography.h4)
            }



            Column( modifier =  Modifier.padding( start = 300.dp, top = 3.dp)) {
                val logo2 = Modifier
                    .size(80.dp)
                Image(
                    painter = painterResource(id = R.drawable.logo2),
                    contentDescription = null,
                    modifier = logo2
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight()
            )

            //              carusel
            { Column(modifier =  Modifier.padding(top = 5.dp)) {
                val carusel = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(320.dp)
                Image(painter = painterResource(id = R.drawable.carusel),
                    contentDescription = null,
                    modifier = carusel,
                )
            }
            }


            val button = Modifier
                .size(65.dp, 65.dp)
            val buttoncolor = Color(0xFF4067A3)
            val buttoncolorr = ButtonDefaults.buttonColors(backgroundColor = buttoncolor)


//                button
            Row(modifier =  Modifier.padding(top = 235.dp, start = 55.dp)) {
                Column(verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    val a1 = Modifier
                        .size(38.dp)
                    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10), modifier = button, colors = buttoncolorr) {
                        Column() {
                            Image(
                                painter = painterResource(id = R.drawable.a1),
                                contentDescription = null,
                                modifier = a1
                            )
                        }
                    }
                    Column(modifier = Modifier.padding(top = 5.dp)
                    ) {
                        Text(text = stringResource(R.string.home_a1),
                            style = MaterialTheme.typography.h5,
                        )
                    }


                }
                Column(modifier = Modifier.padding(start = 13.dp),verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    val a2 = Modifier
                        .size(38.dp)
                    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10), modifier = button, colors = buttoncolorr) {
                        Column() {
                            Image(
                                painter = painterResource(id = R.drawable.a2),
                                contentDescription = null,
                                modifier = a2
                            )
                        }
                    }
                    Column(modifier = Modifier.padding(top = 5.dp)) {
                        Text(text = stringResource(R.string.home_a2),
                            style = MaterialTheme.typography.h5,
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 13.dp),verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    val a3 = Modifier
                        .size(38.dp)
                    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10), modifier = button, colors = buttoncolorr) {
                        Column() {
                            Image(
                                painter = painterResource(id = R.drawable.a3),
                                contentDescription = null,
                                modifier = a3
                            )
                        }
                    }
                    Column(modifier = Modifier.padding(top = 5.dp)) {
                        Text(text = stringResource(R.string.home_a3),
                            style = MaterialTheme.typography.h5,
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 13.dp),verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    val a4 = Modifier
                        .size(38.dp)
                    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10), modifier = button, colors = buttoncolorr) {
                        Column() {
                            Image(
                                painter = painterResource(id = R.drawable.a4),
                                contentDescription = null,
                                modifier = a4
                            )
                        }
                    }
                    Column(modifier = Modifier.padding(top = 5.dp)) {
                        Text(text = stringResource(R.string.home_a4),
                            style = MaterialTheme.typography.h5,textAlign = TextAlign.Center
                        )
                    }

                }
            }

            Row(modifier =  Modifier.padding(top = 330.dp, start = 55.dp)) {
                Column(verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    val b1 = Modifier
                        .size(38.dp)
                    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10), modifier = button, colors = buttoncolorr) {
                        Column() {
                            Image(
                                painter = painterResource(id = R.drawable.b1),
                                contentDescription = null,
                                modifier = b1
                            )
                        }
                    }
                    Column(modifier = Modifier.padding(top = 5.dp)) {
                        Text(text = stringResource(R.string.home_b1),
                            style = MaterialTheme.typography.h5,textAlign = TextAlign.Center
                        )
                    }


                }
                Column(modifier = Modifier.padding(start = 13.dp),verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    val b2 = Modifier
                        .size(38.dp)
                    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10), modifier = button, colors = buttoncolorr) {
                        Column() {
                            Image(
                                painter = painterResource(id = R.drawable.b2),
                                contentDescription = null,
                                modifier = b2
                            )
                        }
                    }
                    Column(modifier = Modifier.padding(top = 5.dp)) {
                        Text(text = stringResource(R.string.home_b2),
                            style = MaterialTheme.typography.h5,textAlign = TextAlign.Center
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 13.dp),verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    val b3 = Modifier
                        .size(38.dp)
                    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10), modifier = button, colors = buttoncolorr) {
                        Column() {
                            Image(
                                painter = painterResource(id = R.drawable.b3),
                                contentDescription = null,
                                modifier = b3
                            )
                        }
                    }
                    Column(modifier = Modifier.padding(top = 5.dp)) {
                        Text(text = stringResource(R.string.home_b3),
                            style = MaterialTheme.typography.h5,textAlign = TextAlign.Center
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 13.dp),verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,) {
                    val b4 = Modifier
                        .size(38.dp)
                    Button(onClick = { /*TODO*/ }, shape = CutCornerShape(10), modifier = button, colors = buttoncolorr) {
                        Column() {
                            Image(
                                painter = painterResource(id = R.drawable.b4),
                                contentDescription = null,
                                modifier = b4
                            )
                        }
                    }
                    Column(modifier = Modifier.padding(top = 5.dp)) {
                        Text(text = stringResource(R.string.home_b4),
                            style = MaterialTheme.typography.h5,
                        )
                    }

                }
            }


            Box(
                modifier = Modifier
                    .padding(start = 0.dp)
                    .size(500.dp)
            )

//              bapenda
            { Column(modifier = Modifier
                .padding(top = 450.dp)
            ) {

                val right = SwipeAction(

                    onSwipe = {
                        Log.d("HomeActivity", "right")
                    },
                    icon = {
                        Box {
                            val bapenda = Modifier
                                .size(500.dp)
                                .aspectRatio(18f / 9f)
                            Image(painter = painterResource(id = R.drawable.bgswipe),
                                contentDescription = null,
                                modifier = bapenda,
                            )
                            Row() {
                                Image(painter = painterResource(id = R.drawable.swipe), contentDescription = null, modifier = Modifier.size(50.dp))
                            }
                        }
                    },
                    background = Color(0xFF4067A3),

                    )
                SwipeableActionsBox(endActions = listOf(right)) {
                    Box {
                        val bapenda = Modifier
                            .size(500.dp)
                            .aspectRatio(18f / 9f)
                        Image(painter = painterResource(id = R.drawable.bapenda),
                            contentDescription = null,
                            modifier = bapenda,
                        )
                        Row() {
                            Column(modifier = Modifier.padding(start = 75.dp, top = 10.dp)) {
                                Text(text = "HALO\n" +
                                        "BAPENDA!",
                                    style = MaterialTheme.typography.h3,)
                            }
                            Row() {
                                Text(
                                    text = stringResource(R.string.home_c1),
                                    modifier = Modifier.padding(top = 14.dp, start = 55.dp),
                                    style = MaterialTheme.typography.h3,
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.swipe),
                                    contentDescription = null,
                                    modifier = Modifier.size(50.dp)
                                )
                            }

                        }

                    }
                }
            }
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight()
            )

//              maps
            { Column(modifier =  Modifier.padding(top = 500.dp)) {
                val maps = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(330.dp)
                Image(painter = painterResource(id = R.drawable.maps),
                    contentDescription = null,
                    modifier = maps,

                    )
            }
            }

        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMActivityTheme {
        HomeScreen()

    }
}
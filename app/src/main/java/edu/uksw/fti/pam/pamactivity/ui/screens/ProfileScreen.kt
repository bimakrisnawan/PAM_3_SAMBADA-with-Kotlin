package edu.uksw.fti.pam.pamactivity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pamactivity.R
import edu.uksw.fti.pam.pamactivity.datastore.StoreFirstName
import edu.uksw.fti.pam.pamactivity.datastore.StoreLastName


@Composable
fun ProfileScreen() {
    val context = LocalContext.current

    //    data store
    val dataStore = StoreFirstName(context)
    val dataStore_a = StoreLastName(context)

    //    saved
    val savedFirstName = dataStore.getFirstName.collectAsState(initial = "")
    val savedLastName = dataStore_a.getLastName.collectAsState(initial = "")

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()

    ){
        Card( elevation = 0.dp) {
            Image(painter = painterResource(id = R.drawable.profile_bg), contentDescription = "background")
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight()
                    .padding(top = 25.dp)

            ) {
                Text(stringResource(R.string.profile_a1), style = MaterialTheme.typography.body1)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight()
                    .padding(top = 70.dp)
            )

            //              carusel
            {
                Column {
                    val photo = Modifier
                        .size(100.dp)
                    Image(painter = painterResource(id = R.drawable.pf_photo),
                        contentDescription = null,
                        modifier = photo,
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(top = 10.dp)) {
                    Column {
                        Text(text = savedFirstName.value +" "+savedLastName.value, style = MaterialTheme.typography.body1)
                    }
                    Column {
                        Text(text = "Bandung | Jawa Barat", style = MaterialTheme.typography.h4)
                    }
                }
                Column(modifier = Modifier
                    .padding(top = 30.dp)
                    .shadow(
                        elevation = 2.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                ) {
                    Column {
                        Box(
                            modifier = Modifier
                                .size(height = 80.dp, width = 370.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .padding(start = 20.dp)
                        ) {
                            Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                Image(
                                    painter = painterResource(id = R.drawable.a1_pf),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                            }
                            Row (modifier = Modifier
                                .padding(start = 40.dp)
                                .align(Alignment.CenterStart)) {
                                Column () {
                                    Column {
                                        Text(text = stringResource(R.string.profile_b1), style = MaterialTheme.typography.body2)
                                    }
                                    Column {
                                        Text(text = "Krisnawan_Uhuy@gmail.com", style = MaterialTheme.typography.subtitle2)
                                    }
                                }
                            }

                        }
                    }
                }
                Column(modifier = Modifier
                    .padding(top = 10.dp)
                    .shadow(
                        elevation = 2.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                ) {
                    Column {
                        Box(
                            modifier = Modifier
                                .size(height = 80.dp, width = 370.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .padding(start = 20.dp)
                        ) {
                            Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                Image(
                                    painter = painterResource(id = R.drawable.a2_pf),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                            }
                            Row (modifier = Modifier
                                .padding(start = 40.dp)
                                .align(Alignment.CenterStart)) {
                                Column () {
                                    Column {
                                        Text(text = stringResource(R.string.profile_b2), style = MaterialTheme.typography.body2)
                                    }
                                    Column {
                                        Text(text = "088869696969", style = MaterialTheme.typography.subtitle2)
                                    }
                                }
                            }

                        }
                    }
                }

                Column(modifier = Modifier
                    .padding(top = 10.dp)
                    .shadow(
                        elevation = 2.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                ) {
                    Column {
                        Box(
                            modifier = Modifier
                                .size(height = 80.dp, width = 370.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .padding(start = 20.dp)
                        ) {
                            Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                Image(
                                    painter = painterResource(id = R.drawable.a3_pf),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                            }
                            Row (modifier = Modifier
                                .padding(start = 40.dp)
                                .align(Alignment.CenterStart)) {
                                Column () {
                                    Column {
                                        Text(text = stringResource(R.string.profile_b3), style = MaterialTheme.typography.body2)
                                    }
                                    Column {
                                        Text(text = "12", style = MaterialTheme.typography.subtitle2)
                                    }
                                }
                            }

                        }
                    }
                }

                Column(modifier = Modifier
                    .padding(top = 10.dp)
                    .shadow(
                        elevation = 2.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                ) {
                    Column {
                        Box(
                            modifier = Modifier
                                .size(height = 80.dp, width = 370.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .padding(start = 20.dp)
                        ) {
                            Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                Image(
                                    painter = painterResource(id = R.drawable.a4_pf),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                            }
                            Row (modifier = Modifier
                                .padding(start = 40.dp)
                                .align(Alignment.CenterStart)) {
                                Column () {
                                    Column {
                                        Text(text = stringResource(R.string.profile_b4), style = MaterialTheme.typography.body2)
                                    }
                                    Column {
                                        Text(text = stringResource(R.string.profile_b4_content), style = MaterialTheme.typography.subtitle2)
                                    }
                                }
                            }

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

    ){


    }

}

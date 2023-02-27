package edu.uksw.fti.pam.pamactivity.ui.screens

import android.icu.text.CaseMap.Title
import android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pamactivity.R
import edu.uksw.fti.pam.pamactivity.ui.theme.Purple500
import edu.uksw.fti.pam.pamactivity.ui.theme.Tealblue
import edu.uksw.fti.pam.pamactivity.ui.theme.Whiteteeth
import edu.uksw.fti.pam.pamactivity.ui.theme.gray


@Composable
fun ArticleScreen(){
    Box(modifier = Modifier
        .background(Whiteteeth)
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ){
        Column {
            GreetingSection()
            Trending()
            news()
            fitur()
            articlescroll()
        }
    }
}

@Composable
fun GreetingSection(
    name: String = "User"
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(R.string.greeting),
                style = MaterialTheme.typography.h2
            )
            Text(
                text = stringResource(R.string.greeting2),
                style = MaterialTheme.typography.body2
            )
        }
        Icon(painter = painterResource(id = R.drawable.baseline_search),
            contentDescription = "Search",
            tint = Color.Black,
            modifier = Modifier.size(34.dp)
        )
    }
}

@Composable
fun Trending() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text= stringResource(id = R.string.trending),
            style = MaterialTheme.typography.h2,
            modifier = Modifier.padding(15.dp)
        )
    }
}

@Composable
fun news(){
    LazyRow(
        modifier = Modifier
            .height(180.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ){
        item {
            newsItem(imagePainter = painterResource(id = R.drawable.samsat1),
                title = stringResource(id = R.string.newstitle1),
                subtitle = stringResource(id = R.string.news1),
                backgroudColor = Tealblue
            )
        }
        item {
            newsItem(imagePainter = painterResource(id = R.drawable.samsat2),
                title = stringResource(id = R.string.newstitle2),
                subtitle = stringResource(id = R.string.news2),
                backgroudColor = Tealblue
            )
        }
        item {
            newsItem(imagePainter = painterResource(id = R.drawable.samsat3),
                title = stringResource(id = R.string.newstitle3),
                subtitle = stringResource(id = R.string.news3),
                backgroudColor = Tealblue
            )
        }
    }
}

@Composable
fun newsItem(
    title: String = "",
    subtitle: String = "",
    backgroudColor: Color = Tealblue,
    imagePainter: Painter
){
    Card(
        modifier = Modifier
            .width(300.dp),
        backgroundColor = backgroudColor,
        elevation = 0.dp

    ) {
        Column {
            Image(
                painter = imagePainter,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(5.dp)),

                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(top = 2.dp, start = 5.dp, bottom = 5.dp)
            ) {
                Text(text = title, fontSize = 14.sp, style = MaterialTheme.typography.h3)
                Text(text = subtitle, fontSize = 14.sp, style = MaterialTheme.typography.body2)
            }

        }
    }
}


@Composable
fun fitur() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text= stringResource(id = R.string.titlefeature),
            style = MaterialTheme.typography.h2,
            modifier = Modifier.padding(15.dp)
        )
    }
}

@Composable
fun articlescroll() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()

    ){
        Card( elevation = 0.dp) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight()
            )

            //              carusel
            {
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
                                    painter = painterResource(id = R.drawable.transporter),
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
                                        Text(text = stringResource(R.string.article_1), style = MaterialTheme.typography.body2)
                                    }
                                    Column {
                                        Text(text = stringResource(R.string.jadwalsamsat), style = MaterialTheme.typography.subtitle2)
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
                                    painter = painterResource(id = R.drawable.server_time),
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
                                        Text(text = stringResource(R.string.article_2), style = MaterialTheme.typography.body2)
                                    }
                                    Column {
                                        Text(text = stringResource(R.string.maintenance), style = MaterialTheme.typography.subtitle2)
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
                                    painter = painterResource(id = R.drawable.money_hand_line),
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
                                        Text(text = stringResource(R.string.article_3), style = MaterialTheme.typography.body2)
                                    }
                                    Column {
                                        Text(text = stringResource(R.string.taxinfo), style = MaterialTheme.typography.subtitle2)
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
                                    painter = painterResource(id = R.drawable.info_outline),
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
                                        Text(text = stringResource(R.string.paymentinfo), style = MaterialTheme.typography.subtitle2)
                                    }
                                }
                            }

                        }
                    }
                }

                }

            }



        }

    }
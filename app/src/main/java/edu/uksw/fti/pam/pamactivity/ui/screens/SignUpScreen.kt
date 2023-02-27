package edu.uksw.fti.pam.pamactivity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pamactivity.ui.theme.PAMActivityTheme
import edu.uksw.fti.pam.pamactivity.R
import edu.uksw.fti.pam.pamactivity.datastore.StoreFirstName
import edu.uksw.fti.pam.pamactivity.datastore.StoreLastName
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@Composable
fun SignForm(
    btnOnClickAction: (String?) -> Unit
) {
    val context = LocalContext.current

//    scope
    val scope = rememberCoroutineScope()

//    data store
    val dataStore = StoreFirstName(context)
    val dataStore_a = StoreLastName(context)


    var firstname by remember {
        mutableStateOf(value = "")
    }
    var secondname by remember {
        mutableStateOf(value = "")
    }
    var username by remember {
        mutableStateOf(value = "")
    }
    var passwordSign by remember {
        mutableStateOf(value = "")
    }
    var confpasswordSign by remember {
        mutableStateOf(value = "")
    }

    Card(elevation = 0.dp) {
        Image(
            painter = painterResource(id = R.drawable.bg_awal),
            contentDescription = "background",
            contentScale = ContentScale.Crop
        )

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column() {
            Image(painter = painterResource(id = R.drawable.maskot), contentDescription = "maskot",
            modifier = Modifier.size(100.dp))
        }
        Column(modifier = Modifier.padding(top=15.dp),) {
            Text(text = stringResource(R.string.sign_desc), style = MaterialTheme.typography.body1,
            textAlign = TextAlign.Center)
        }

        Row(modifier = Modifier.padding(top = 15.dp)) {
            TextField(
                value = firstname,
                onValueChange = { firstname = it },
                label = {
                    Text(text = stringResource(id = R.string.first))
                },
                modifier = Modifier.size(150.dp, 70.dp)
            );TextField(
            value = secondname,
            onValueChange = { secondname = it },
            label = {
                Text(text = stringResource(id = R.string.second))
            },
            modifier = Modifier
                .size(150.dp, 70.dp)
                .padding(start = 10.dp)
        )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TextField(
                value = username,
                onValueChange = { username = it },
                label = {
                    Text(text = stringResource(id = R.string.username_sign))
                },
                modifier = Modifier
                    .size(300.dp, 70.dp)
                    .padding(top = 10.dp)
            )
            TextField(
                value = passwordSign,
                onValueChange = { passwordSign = it },
                label = {
                    Text(text = stringResource(id = R.string.password_sign))
                },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .size(300.dp, 70.dp)
                    .padding(top = 10.dp),
            )
            TextField(
                value = confpasswordSign,
                onValueChange = { confpasswordSign = it },
                label = {
                    Text(text = stringResource(id = R.string.confirm))
                },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .size(300.dp, 70.dp)
                    .padding(top = 10.dp)
            )
            Button(
                onClick = {
                    scope.launch {
                        dataStore.saveFirstName(firstname)
                        dataStore_a.saveLastName(secondname)
                    }
                    btnOnClickAction(username)
                }, modifier = Modifier.padding(top = 15.dp)
            ) {
                Text(text = stringResource(id = R.string.sign))
            }
        }
    }
}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PAMActivityTheme {
        SignForm({})
    }
}
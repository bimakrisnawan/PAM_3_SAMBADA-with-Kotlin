package edu.uksw.fti.pam.pamactivity.ui.screens

import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pamactivity.HomeActivity
import edu.uksw.fti.pam.pamactivity.contracts.SignUpContract
import edu.uksw.fti.pam.pamactivity.ui.theme.PAMActivityTheme
import edu.uksw.fti.pam.pamactivity.R

internal fun doAuth(
    username : String,
    password : String,
): Boolean{
    return (username.equals("1") && password.equals("1"))
}

@Composable
fun LoginForm() {
    val lContext = LocalContext.current
    var usernameInput by remember {
        mutableStateOf(value = "")
    }
    var passwordInput by remember {
        mutableStateOf(value = "")
    }

    val getUsernameFromSignUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!! })

    Card(elevation = 0.dp) {
        Image(
            painter = painterResource(id = R.drawable.profile_bg),
            contentDescription = "background"
        )


    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            value = usernameInput.toString(),
            onValueChange = { usernameInput = it },
            label = {
                Text(text = stringResource(id = R.string.label_username))
            },
            modifier = Modifier.size(width = 300.dp, height = 60.dp),
        )
        TextField(
            value = passwordInput.toString(),
            onValueChange = { passwordInput = it },
            label = {
                Text(text = stringResource(id = R.string.label_password))
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.size(width = 300.dp, height = 60.dp).padding(top = 10.dp),
        )
        Row() {
            Column() {
                TextButton(
                    onClick = {
                        getUsernameFromSignUpForm.launch("")
                    }

                ) {
                    Text(text = stringResource(R.string.signup))
                }
            }

            Column(modifier = Modifier.padding(start = 10.dp)) {
                Button(
                    onClick = {
                        val isAuthentication = doAuth(usernameInput, passwordInput)
                        if (isAuthentication) {
                            lContext.startActivity(
                                Intent(lContext, HomeActivity::class.java)
                                    .apply {
                                        putExtra("username", usernameInput)
                                    }
                            )
                        }
                    }

                ) {
                    Text(text = stringResource(id = R.string.login))
                }
            }


        }

    }
}
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview(){
    PAMActivityTheme {
        LoginForm()
    }
}

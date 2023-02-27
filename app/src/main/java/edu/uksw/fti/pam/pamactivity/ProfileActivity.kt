package edu.uksw.fti.pam.pamactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import edu.uksw.fti.pam.pamactivity.ui.screens.BottomNavigationMainScreenView
import edu.uksw.fti.pam.pamactivity.ui.screens.ProfileScreen
import edu.uksw.fti.pam.pamactivity.ui.theme.PAMActivityTheme

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PAMActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    val username = getIntent().getStringExtra("username")?: ""
                    ProfileScreen()
                    BottomNavigationMainScreenView()
                }
            }
        }
    }
    private fun sendusernameBackToLogin(username : String?){
        val result = Intent().putExtra("username", username)
        setResult(Activity.RESULT_OK, result)
        finish()
    }
}


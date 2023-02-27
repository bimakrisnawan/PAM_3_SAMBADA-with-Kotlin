package edu.uksw.fti.pam.pamactivity.ui.screens

import android.annotation.SuppressLint
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import edu.uksw.fti.pam.pamactivity.HomeActivity
import edu.uksw.fti.pam.pamactivity.R
import edu.uksw.fti.pam.pamactivity.ui.BottomNavItems

@Composable
fun NavigationGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = BottomNavItems.Home.screen_route
    ){
        composable(BottomNavItems.Home.screen_route){
            HomeScreen()
        }
        composable(BottomNavItems.Article.screen_route){
            ArticleScreen()
        }
        composable(BottomNavItems.Profile.screen_route){
            ProfileScreen()
        }
    }
}

@Composable
fun BottomNavigation(
    navController: NavController
){
    val items = listOf(
        BottomNavItems.Home,
        BottomNavItems.Article,
        BottomNavItems.Profile
    )
    androidx.compose.material.BottomNavigation(
        backgroundColor = colorResource(id = R.color.tealblue),
        contentColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

            BottomNavigationItem(
                icon = {Icon(
                    imageVector = BottomNavItems.Home.icon,
                    contentDescription = stringResource(R.string.bot_1)
                )},
                label = {
                    Text(text = stringResource(R.string.bot_1),
                        fontSize = 9.sp)
                },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == BottomNavItems.Home.screen_route,
                onClick = {
                    navController.navigate(BottomNavItems.Home.screen_route) {
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )

        BottomNavigationItem(
            icon = {Icon(
                imageVector = BottomNavItems.Article.icon,
                contentDescription = stringResource(R.string.bot_2)
            )},
            label = {
                Text(text = stringResource(R.string.bot_2),
                    fontSize = 9.sp)
            },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.Black.copy(0.4f),
            alwaysShowLabel = true,
            selected = currentRoute == BottomNavItems.Article.screen_route,
            onClick = {
                navController.navigate(BottomNavItems.Article.screen_route) {
                    navController.graph.startDestinationRoute?.let { screen_route ->
                        popUpTo(screen_route) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        )

        BottomNavigationItem(
            icon = {Icon(
                imageVector = BottomNavItems.Profile.icon,
                contentDescription = stringResource(R.string.bot_3)
            )},
            label = {
                Text(text = stringResource(R.string.bot_3),
                    fontSize = 9.sp)
            },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.Black.copy(0.4f),
            alwaysShowLabel = true,
            selected = currentRoute == BottomNavItems.Profile.screen_route,
            onClick = {
                navController.navigate(BottomNavItems.Profile.screen_route) {
                    navController.graph.startDestinationRoute?.let { screen_route ->
                        popUpTo(screen_route) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        )


        }
    }

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigationMainScreenView(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation(
                navController = navController,
            )
        }
    ) {
        NavigationGraph(navController = navController)
    }
}
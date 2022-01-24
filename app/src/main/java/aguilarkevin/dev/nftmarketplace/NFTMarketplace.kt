package aguilarkevin.dev.nftmarketplace

import aguilarkevin.dev.nftmarketplace.ui.theme.NFTMarketplaceTheme
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@ExperimentalMaterial3Api
@Composable
fun NFTMarketplaceApp(){
    val navController = rememberNavController()

    NFTMarketplaceTheme {
        Scaffold(
            bottomBar = {
                NavigationBar {
                    val screens = listOf(
                        Screen.Overview,
                        Screen.Explore,
                        Screen.Alerts,
                        Screen.Profile,
                    )
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentRoute = navBackStackEntry?.destination?.route

                    for(screen in screens ){
                        NavigationBarItem(
                            icon = { Icon(contentDescription = null, imageVector = screen.icon) },
                            selected = currentRoute == screen.route,
                            onClick = {
                                navController.navigate(screen.route)
                            }
                        )
                    }
                }
            }
        ) {
            NavHost(navController, startDestination = "overview") {
                composable("overview") {
                    Text("overview")
                }
                composable("explore") {
                    Text("explore")
                }
                composable("alerts") {
                    Text("notifications")
                }
                composable("profile") {
                    Text("profile")
                }
            }
        }
    }
}
@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun AppPreview() {
    NFTMarketplaceApp()
}

sealed class Screen(val route: String, val icon: ImageVector, @StringRes val resourceId: Int) {
    object Overview : Screen("overview", Icons.Filled.Home, R.string.overview)
    object Explore : Screen("explore", Icons.Filled.Search, R.string.explore)
    object Alerts : Screen("alerts", Icons.Filled.Notifications, R.string.alerts)
    object Profile : Screen("profile", Icons.Filled.Person, R.string.profile)
}
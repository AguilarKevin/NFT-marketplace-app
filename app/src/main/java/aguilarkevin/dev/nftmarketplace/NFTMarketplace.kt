package aguilarkevin.dev.nftmarketplace

import aguilarkevin.dev.nftmarketplace.ui.explore.ExploreScreen
import aguilarkevin.dev.nftmarketplace.ui.overview.OverviewScreen
import aguilarkevin.dev.nftmarketplace.ui.profile.ProfileScreen
import aguilarkevin.dev.nftmarketplace.ui.theme.NFTMarketplaceTheme
import aguilarkevin.dev.nftmarketplace.ui.theme.backgroundGray
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContainerGray
import aguilarkevin.dev.nftmarketplace.ui.theme.primaryColor
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@ExperimentalFoundationApi
@ExperimentalMaterial3Api
@Composable
fun NFTMarketplaceApp() {
    NFTMarketplaceTheme {
        val navController = rememberNavController()
        Scaffold(
            containerColor = backgroundGray,
            bottomBar = { AppNavigationBar(navController) }
        ) { contentPadding ->
            NavHost(
                navController,
                startDestination = "profile",
                modifier = Modifier.padding(contentPadding)
            ) {
                composable("overview") {
                    OverviewScreen()
                }
                composable("explore") {
                    ExploreScreen()
                }
                composable("alerts") {
                    Text("notifications")
                }
                composable("profile") {
                    ProfileScreen()
                }
            }
        }
    }
}

@Composable
fun AppNavigationBar(navController: NavHostController) {
    NavigationBar(
        containerColor = Color.White,
    ) {
        val screens = listOf(
            Screen.Overview,
            Screen.Explore,
            Screen.Alerts,
            Screen.Profile,
        )
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        Row(
            modifier = Modifier
                .padding(horizontal = 38.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            for (screen in screens) {
                NavigationBarItem(
                    colors = NavigationBarItemDefaults
                        .colors(
                            indicatorColor = buttonContainerGray,
                            selectedIconColor = primaryColor,
                            unselectedIconColor = Color.LightGray
                        ),
                    icon = {
                        Icon(
                            contentDescription = null,
                            painter = painterResource(id = screen.icon),
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    selected = currentRoute == screen.route,
                    onClick = {
                        navController.navigate(screen.route)
                    },
                    modifier = Modifier.clip(CircleShape)
                )
            }
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun AppPreview() {
    NFTMarketplaceTheme {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = { AppNavigationBar(navController) }
        ) {

        }
    }
}


sealed class Screen(val route: String, val icon: Int) {
    object Overview : Screen("overview", R.drawable.ic_home)
    object Explore : Screen("explore", R.drawable.ic_search)
    object Alerts : Screen("alerts", R.drawable.ic_chat_bubble)
    object Profile : Screen("profile", R.drawable.ic_user)
}
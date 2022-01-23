package aguilarkevin.dev.nftmarketplace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import aguilarkevin.dev.nftmarketplace.ui.theme.NFTMarketplaceTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NFTMarketplaceTheme {
                Scaffold(
                    bottomBar = {
                        AppBottomNavigation()
                    }
                ) {
                    // Screen content
                }
            }
        }
    }
}


@Preview
@Composable
fun App(){
    NFTMarketplaceTheme {
        Scaffold(
            bottomBar = {
                AppBottomNavigation()
            }
        ) {
            // Screen content

        }
    }
}

@Composable
fun AppBottomNavigation(){
    val bottomNavigationItems = listOf(
        R.drawable.ic_home,
        R.drawable.ic_search,
        R.drawable.ic_comment,
        R.drawable.ic_user
    )


    BottomNavigation(
        backgroundColor = Color(255,255,255),
        modifier = Modifier.height(68.dp)
    ) {
        for (icon in bottomNavigationItems){
            BottomNavigationItem(
                selected = true,
                onClick = { 1 + 1 },
                modifier = Modifier.padding(
                    PaddingValues(
                        start = 0.dp,
                        top = 20.dp,
                        end = 0.dp,
                        bottom = 20.dp
                    )
                ),
                icon = {
                    Icon(
                        painterResource(id = icon),
                        "home",
                        Modifier.size(28.dp,28.dp),
                        tint = Color(200,200,200)) },
            )
        }
    }
}


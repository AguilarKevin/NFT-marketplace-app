package aguilarkevin.dev.nftmarketplace.ui.profile

import aguilarkevin.dev.nftmarketplace.R
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.TabItem
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.Tabs
import aguilarkevin.dev.nftmarketplace.ui.profile.components.ProfileCard
import aguilarkevin.dev.nftmarketplace.ui.profile.components.ProfileTabs
import aguilarkevin.dev.nftmarketplace.ui.theme.primaryColor
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@ExperimentalFoundationApi
@ExperimentalMaterial3Api
@Composable
fun ProfileScreen() {


    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("User Profile") },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_dots),
                            contentDescription = "Localized description",
                            modifier = Modifier.size(18.dp)
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.White
                )
            )
        }
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp),
//            modifier = Modifier.verticalScroll(scrollState)
        ) {
            ProfileCard()
            ProfileTabs()
        }

    }
}



@ExperimentalFoundationApi
@ExperimentalMaterial3Api
@Preview
@Composable
fun ProfileScreenPreview(){
    Column(){
//        ProfileCard()
        CenterAlignedTopAppBar(
            title = { Text("User Profile") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = null)
                }
            },
            actions = {
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_dots),
                        contentDescription = "Localized description",
                        modifier = Modifier.size(18.dp)
                    )
                }
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color.White
            )
        )
        ProfileTabs()
    }
}
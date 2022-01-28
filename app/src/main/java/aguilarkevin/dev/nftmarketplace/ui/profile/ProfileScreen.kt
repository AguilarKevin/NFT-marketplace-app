package aguilarkevin.dev.nftmarketplace.ui.profile

import aguilarkevin.dev.nftmarketplace.R
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.TabItem
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.Tabs
import aguilarkevin.dev.nftmarketplace.ui.profile.components.ProfileCard
import aguilarkevin.dev.nftmarketplace.ui.theme.primaryColor
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@Composable
fun ProfileScreen() {

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
        Column( verticalArrangement = Arrangement.spacedBy(32.dp)) {
            ProfileCard()

            Tabs(horizontaAlignment = Alignment.CenterHorizontally) {
                TabItem(
                    onClick = { /*TODO*/ },
                    label = "OnSale(0)"
                )
                TabItem(
                    onClick = { /*TODO*/ },
                    label = "Owned(321)"
                )
                TabItem(
                    onClick = { /*TODO*/ },
                    label = "Created(128)"
                )
            }
        }

    }
}



@ExperimentalMaterial3Api
@Preview
@Composable
fun ProfileScreenPreview(){
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
//        ProfileCard()
        Tabs(horizontaAlignment = Alignment.CenterHorizontally) {
            TabItem(
                onClick = { /*TODO*/ },
                label = "OnSale(0)"
            )
            TabItem(
                onClick = { /*TODO*/ },
                label = "Owned(321)"
            )
            TabItem(
                onClick = { /*TODO*/ },
                label = "Created(128)"
            )
        }
    }
}
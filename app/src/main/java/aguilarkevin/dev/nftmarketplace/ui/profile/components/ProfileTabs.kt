package aguilarkevin.dev.nftmarketplace.ui.profile.components

import aguilarkevin.dev.nftmarketplace.ui.components.tabs.TabItem
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.Tabs
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun ProfileTabs(){
    Tabs(
        horizontalAlignment = Alignment.CenterHorizontally,
        tabItems = {
            TabItem(
                onClick = { /*TODO*/ },
                label = "OnSale(0)",
                selected = true
            )
            TabItem(
                onClick = { /*TODO*/ },
                label = "Owned(321)",
                selected = false
            )
            TabItem(
                onClick = { /*TODO*/ },
                label = "Created(128)",
                selected = false
            )

        }
    ) {

    }
}
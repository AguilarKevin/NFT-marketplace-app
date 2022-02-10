package aguilarkevin.dev.nftmarketplace.ui.profile.components

import aguilarkevin.dev.nftmarketplace.models.Bid
import aguilarkevin.dev.nftmarketplace.models.NFT
import aguilarkevin.dev.nftmarketplace.models.User
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.TabItem
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.Tabs
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalFoundationApi
@Composable
fun ProfileTabs() {
    val nftItems = listOf(
        NFT(
            id = "#11231",
            title = "Fakurian of space #6",
            owner = User(
                name = "Kevin Aguilar",
                avatarUrl = "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2021/10/25/16351831527188.jpg",
                description = "conceptual collector"
            ),
            assetUrl = "https://images.unsplash.com/photo-1633783156075-a01661455344?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1632&q=80",

            bids = listOf<Bid>()
        ),
        NFT(
            id = "#11231",
            title = "Fakurian of space #6",
            owner = User(
                name = "Kevin Aguilar",
                avatarUrl = "https://preview.redd.it/rytm7cvt3sk51.jpg?width=1100&format=pjpg&auto=webp&s=4601ed4c07cde0292fe6fd51121a0b545ff8c2ad",
                description = "conceptual collector"
            ),
            assetUrl = "https://images.unsplash.com/photo-1632516643720-e7f5d7d6ecc9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=711&q=80",
            bids = listOf<Bid>()
        ),
        NFT(
            id = "#11231",
            title = "Fakurian of space #6",
            owner = User(
                name = "Kevin Aguilar",
                avatarUrl = "https://images.unsplash.com/photo-1640960543409-dbe56ccc30e2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80",
                description = "conceptual collector"
            ),
            assetUrl = "https://images.unsplash.com/photo-1617791160588-241658c0f566?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1364&q=80",
            bids = listOf<Bid>()
        ),
        NFT(
            id = "#11231",
            title = "Fakurian of space #6",
            owner = User(
                name = "Kevin Aguilar",
                avatarUrl = "https://i.guim.co.uk/img/media/a49b541c86c50ffc9a183cd3894431950037b383/0_150_4500_2700/master/4500.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=6aaf409397b1e4d4a45d13b7bd489a41",
                description = "conceptual collector"
            ),
            assetUrl = "https://images.unsplash.com/photo-1598705352140-be8e33a97d55?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1338&q=80",
            bids = listOf<Bid>()
        )
    )

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
        LazyVerticalGrid(
            cells = GridCells.Adaptive(150.dp),
            contentPadding = PaddingValues(24.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            modifier = Modifier.fillMaxHeight()
        ) {
            for (nft in nftItems) {
                item {
                    SmallNftCard(nft)
                }
            }
        }
    }
}
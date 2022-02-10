package aguilarkevin.dev.nftmarketplace.ui.overview

import aguilarkevin.dev.nftmarketplace.models.Bid
import aguilarkevin.dev.nftmarketplace.models.NFT
import aguilarkevin.dev.nftmarketplace.models.User
import aguilarkevin.dev.nftmarketplace.ui.overview.components.HotBidCard
import aguilarkevin.dev.nftmarketplace.ui.overview.components.SellerCard
import aguilarkevin.dev.nftmarketplace.ui.theme.textWarningColor
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.TextButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun OverviewScreen() {

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
            bids = listOf()
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
            bids = listOf()
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

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 24.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Find the best \nNFTArt\uD83D\uDCA5",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                lineHeight = 34.sp
            )

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Hot bids", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                TextButton(onClick = { /*TODO*/ }) {
                    Text(
                        text = "See all",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = textWarningColor
                    )
                }

            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                for (item in nftItems) {
                    HotBidCard(
                        nft = item
                    )
                }
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        ) {
            Text(text = "Top seller", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "See all",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = textWarningColor
                )
            }

        }
        for(nft in nftItems){
            SellerCard(seller = nft.owner)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OverviewScreenPreview() {
    Scaffold(Modifier.fillMaxWidth()) {
        OverviewScreen()
    }
}
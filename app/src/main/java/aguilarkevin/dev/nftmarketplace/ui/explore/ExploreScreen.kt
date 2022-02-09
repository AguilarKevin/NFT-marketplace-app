package aguilarkevin.dev.nftmarketplace.ui.explore

import aguilarkevin.dev.nftmarketplace.models.Bid
import aguilarkevin.dev.nftmarketplace.models.NFT
import aguilarkevin.dev.nftmarketplace.models.User
import aguilarkevin.dev.nftmarketplace.ui.components.Menu
import aguilarkevin.dev.nftmarketplace.ui.explore.components.NFTCard
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExploreScreen() {

    val nftItems = listOf<NFT>(
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

    val scrollState = rememberScrollState()

    Column(
        verticalArrangement = Arrangement.spacedBy(28.dp),
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)
            .padding(24.dp)
    ) {
        Text(
            text = "Explore the \nbest NFTArt\uD83D\uDCA5",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )

        TextField(
            value = "",
            onValueChange = {/*TODO*/ },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                trailingIconColor = Color.White
            ),
            trailingIcon = {
                Box(
                    modifier = Modifier
                        .background(color = Color.Black, shape = CircleShape)
                        .padding(2.dp)
                ) {
                    Icon(Icons.Filled.Search, contentDescription = null)
                }
            },
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Menu(label = "Category", items = listOf("opt 1", "opt 2"))
            Menu(label = "Collection", items = listOf("opt 1", "opt 2"))
            Menu(label = "Short by", items = listOf("opt 1", "opt 2"))
        }

        for (item in nftItems) {
            NFTCard(
                id = item.id,
                imageUrl = item.assetUrl,
                title = item.title,
                owner = item.owner,
                lastBid = "0.08"
            )
        }
    }
}
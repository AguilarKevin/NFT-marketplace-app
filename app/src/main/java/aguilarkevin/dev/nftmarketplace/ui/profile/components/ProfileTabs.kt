package aguilarkevin.dev.nftmarketplace.ui.profile.components

import aguilarkevin.dev.nftmarketplace.R
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.TabItem
import aguilarkevin.dev.nftmarketplace.ui.components.tabs.Tabs
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContainerGray
import aguilarkevin.dev.nftmarketplace.ui.theme.primaryColor
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.glide.GlideImage

@ExperimentalFoundationApi
@Composable
fun ProfileTabs() {
    val data = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5")

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
            for (card in data) {
                item {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        backgroundColor = Color.White
                    ) {
                        Column(
                            modifier = Modifier.padding(8.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            GlideImage(
                                imageModel = "https://images.unsplash.com/photo-1567095716798-1d95d8f4c479?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                                // Crop, Fit, Inside, FillHeight, FillWidth, None
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(114.dp)
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                            )
                            Row(
                                modifier = Modifier.padding(vertical = 8.dp),
                                horizontalArrangement = Arrangement.spacedBy(12.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Box(
                                    modifier = Modifier
                                        .background(
                                            buttonContainerGray,
                                            shape = RoundedCornerShape(8.dp)
                                        )
                                        .padding(vertical = 8.dp, horizontal = 6.dp)
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_sort),
                                        contentDescription = null,
                                        tint = primaryColor,
                                        modifier = Modifier.size(20.dp)
                                    )
                                }

                                Column(
                                    verticalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = "Lost bid",
                                        fontSize = 13.sp,
                                        fontWeight  = FontWeight.SemiBold,
                                        color = Color.LightGray
                                    )

                                    Text(
                                        text = "0.50 ETH",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

//data class NFTItem(val title: String, val )
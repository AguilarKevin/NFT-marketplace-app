package aguilarkevin.dev.nftmarketplace

import aguilarkevin.dev.nftmarketplace.models.NFT
import aguilarkevin.dev.nftmarketplace.models.User
import aguilarkevin.dev.nftmarketplace.ui.components.Avatar
import aguilarkevin.dev.nftmarketplace.ui.theme.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.glide.GlideImage

class NFTDetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NFTMarketplaceTheme {
                NftActivity()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun NftActivity() {

    val ctx = LocalContext.current
    val intent = (ctx as NFTDetailsActivity).intent

    val nft = NFT(
        title = intent.getStringExtra("title") ?: "",
        assetUrl = intent.getStringExtra("assetUrl") ?: "",
        owner = User(
            name = intent.getStringExtra("ownerName") ?: "",
            avatarUrl = intent.getStringExtra("ownerAvatar") ?: "",
            description = "Creator",
        ),
        bids = listOf(),
        id = ""
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Badge(containerColor = buttonContainerGray) {
                        Text(
                            "Available to bid",
                            color = buttonContentGreen,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { ctx.onBackPressed() }) {
                        Surface(color = Color.White, shape = RoundedCornerShape(10.dp)) {
                            Icon(
                                Icons.Filled.ArrowBack,
                                contentDescription = null,
                                modifier = Modifier.padding(4.dp)
                            )
                        }
                    }
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Surface(color = Color.White, shape = RoundedCornerShape(10.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_dots),
                                contentDescription = "Localized description",
                                modifier = Modifier
                                    .size(28.dp)
                                    .padding(vertical = 6.dp, horizontal = 4.dp)
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = backgroundGray
                ),
                modifier = Modifier.padding(horizontal = 12.dp)
            )
        },
        containerColor = backgroundGray
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxHeight()
        ) {
            GlideImage(
                imageModel = nft.assetUrl,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(24.dp))
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier.padding(top = 6.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Avatar(imageUrl = nft.owner.avatarUrl, size = 42.dp)
                        Column {
                            Text(
                                text = nft.owner.name,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium
                            )
                            Text(text = "Creator", color = Color.Gray)
                        }
                    }
                    FilledTonalButton(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.filledTonalButtonColors(containerColor = buttonContainerGray),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.defaultMinSize(minHeight = 24.dp)
                    ) {

                        Icon(
                            Icons.Filled.Check,
                            contentDescription = "Localized description",
                            modifier = Modifier.size(14.dp),
                            tint = buttonContentGreen
                        )

                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))

                        Text(
                            text = "Following",
                            fontSize = 15.sp,
                            color = buttonContentGreen
                        )
                    }
                }

                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(text = nft.title, fontSize = 18.sp, fontWeight = FontWeight.Medium)
                    Text(
                        text = "Our vision is to create a metaverse guild that spans multiple games and communities." +
                                " Badass Ape Guild is not just a PFP project.",
                        fontSize = 18.sp,
                        lineHeight = 26.sp
                    )
                }

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    val textStyle = TextStyle(fontWeight = FontWeight.Medium, fontSize = 28.sp)
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text(text = "last Bid", color = Color.LightGray)
                        Badge(
                            containerColor = buttonContainerGray,
                            content = {
                                Text(
                                    "0.96 ETH",
                                    style = textStyle,
                                    modifier = Modifier.padding(horizontal = 6.dp)
                                )
                            })
                    }

                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text(text = "Auction ending in", color = textWarningColor)
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Badge(
                                containerColor = buttonContainerGray,
                                content = {
                                    Text(
                                        "04",
                                        style = textStyle,
                                        modifier = Modifier.padding(horizontal = 4.dp)
                                    )
                                })
                            Text(":", style = textStyle)
                            Badge(
                                containerColor = buttonContainerGray,
                                content = {
                                    Text(
                                        "45",
                                        style = textStyle,
                                        modifier = Modifier.padding(horizontal = 4.dp)
                                    )
                                })
                            Text(":", style = textStyle)
                            Badge(
                                containerColor = buttonContainerGray,
                                content = {
                                    Text(
                                        "32",
                                        style = textStyle,
                                        modifier = Modifier.padding(horizontal = 4.dp)
                                    )
                                })

                        }
                    }
                }


            }
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(18.dp),
                colors = ButtonDefaults.buttonColors(containerColor = primaryColor),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Place a bid",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NFTMarketplaceTheme {
//        NftActivity(nft)
    }
}
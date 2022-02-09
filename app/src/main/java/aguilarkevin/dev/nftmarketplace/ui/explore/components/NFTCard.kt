package aguilarkevin.dev.nftmarketplace.ui.explore.components

import aguilarkevin.dev.nftmarketplace.R
import aguilarkevin.dev.nftmarketplace.models.User
import aguilarkevin.dev.nftmarketplace.ui.components.Avatar
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContainerGray
import aguilarkevin.dev.nftmarketplace.ui.theme.primaryColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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

@Composable
fun NFTCard(id: String?, imageUrl: String, title: String, owner: User, lastBid: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            GlideImage(
                imageModel = imageUrl,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
            )
            Column(modifier = Modifier.padding(vertical = 6.dp)) {
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    Avatar(imageUrl = owner.avatarUrl, size = 42.dp)
                    Column {
                        Text(text = title, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                        Text(text = owner.name, color = Color.LightGray)
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Row(horizontalArrangement = Arrangement.spacedBy(14.dp)) {
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
                                text = "Last bid",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.LightGray
                            )

                            Text(
                                text = "$lastBid ETH",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = primaryColor)
                    ) {
                        Text(text = "Place a bid", color = Color.White)
                    }
                }
            }
        }
    }
}
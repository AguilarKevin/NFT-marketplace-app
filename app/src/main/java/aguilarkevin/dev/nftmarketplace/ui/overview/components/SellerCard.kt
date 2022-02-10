package aguilarkevin.dev.nftmarketplace.ui.overview.components

import aguilarkevin.dev.nftmarketplace.models.User
import aguilarkevin.dev.nftmarketplace.ui.components.Avatar
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContainerLightGray
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SellerCard(seller: User) {
    Card(
        backgroundColor = Color.White,
        elevation = 0.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Avatar(imageUrl = seller.avatarUrl, size = 48.dp)
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Text(text = seller.name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(text = "$23,001,428", color = Color.Gray,  fontWeight = FontWeight.Medium)
                }
            }
            FilledTonalButton(
                onClick = { /*TODO*/ }, colors = ButtonDefaults.filledTonalButtonColors(
                    containerColor = buttonContainerLightGray
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "Follow")
            }
        }
    }
}
package aguilarkevin.dev.nftmarketplace.ui.profile.components

import aguilarkevin.dev.nftmarketplace.models.User
import aguilarkevin.dev.nftmarketplace.ui.components.Avatar
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContainerGray
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContainerLightGray
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContentGreen
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileCard() {
    val user = User(
        name = "Kevin Aguilar",
        avatarUrl = "https://lh3.googleusercontent.com/Y5GFseIm0B_jQnjUM9Yg4dYXeD6N6593lDyjuRD-MjMpd-6ly6pTy3-nIv8UzYftS5DjnkaPGx6Gfg0hTxOb-SZOqg=w600",
        description = "conceptual collector"
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            elevation = 0.dp,
            shape = RoundedCornerShape(bottomEnd = 24.dp, bottomStart = 24.dp),
            backgroundColor = Color.White,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 14.dp).padding(bottom = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy((-68).dp)
                ) {

                    ProfileBanner(
                        imageUrl = "https://w0.peakpx.com/wallpaper/779/367/HD-wallpaper-retro-car-to-synthwave-city-synthwave-retrowave-vaporwave-artist-artwork-digital-art-artstation.jpg",
                        height = 140.dp
                    )

                    Avatar(
                        imageUrl = user.avatarUrl,
                        size = 92.dp
                    )

                }

                Text(
                    text = user.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = user.description,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.LightGray
                )

                Spacer(Modifier.size(14.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    FilledTonalButton(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.filledTonalButtonColors(containerColor = buttonContainerLightGray)
                    ) {

                        Icon(
                            Icons.Filled.Check,
                            contentDescription = "Localized description",
                            modifier = Modifier.size(14.dp),
                            tint = buttonContentGreen
                        )

                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))

                        Text(text = "Following", color = buttonContentGreen)
                    }

                    Stat(label = "Followers", value = "300")

                    Stat(label = "Following", value = "230")
                }


            }
        }
    }
}

@Composable
fun Stat(label: String, value: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        Text(text = value, fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text(text = label, color = Color.LightGray)
    }
}
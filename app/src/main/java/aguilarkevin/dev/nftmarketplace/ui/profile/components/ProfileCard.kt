package aguilarkevin.dev.nftmarketplace.ui.profile.components

import aguilarkevin.dev.nftmarketplace.ui.components.Avatar
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContainerGray
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
    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(bottomEnd = 24.dp, bottomStart = 24.dp),
            backgroundColor = Color.White,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(14.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy((-68).dp)
                ) {

                    ProfileBanner(
                        imageUrl = "https://images.unsplash.com/photo-1567095716798-1d95d8f4c479?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                        height = 140.dp
                    )

                    Avatar(
                        imageUrl = "https://avatars.githubusercontent.com/u/36524241?v=4",
                        size = 92.dp
                    )

                }

                Text(
                    text = "Kevin Aguilar",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Conceptual Collector",
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
                        colors = ButtonDefaults.filledTonalButtonColors(containerColor = buttonContainerGray)
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
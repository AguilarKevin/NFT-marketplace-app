package aguilarkevin.dev.nftmarketplace.ui.profile.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileCard(){
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
                ){

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

            }
        }
    }
}
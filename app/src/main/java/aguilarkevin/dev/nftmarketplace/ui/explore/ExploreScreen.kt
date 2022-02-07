package aguilarkevin.dev.nftmarketplace.ui.explore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
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
fun ExploreScreen(){
    Column(
        verticalArrangement = Arrangement.spacedBy(28.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Text(
            text = "Explore the \nbest NFTArt\uD83D\uDCA5",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )

        TextField(
            value = "",
            onValueChange = {/*TODO*/},
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                trailingIconColor = Color.White
            ),
            trailingIcon = { Box(modifier = Modifier
                .background(color = Color.Black, shape = CircleShape)
                .padding(2.dp)){
                Icon( Icons.Filled.Search, contentDescription = null)
            } },
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier.fillMaxWidth()
        )
    }
}
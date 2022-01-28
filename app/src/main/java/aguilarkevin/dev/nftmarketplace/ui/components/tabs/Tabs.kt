package aguilarkevin.dev.nftmarketplace.ui.components.tabs

import aguilarkevin.dev.nftmarketplace.ui.theme.primaryColor
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Tabs(horizontaAlignment: Alignment.Horizontal,  content: @Composable RowScope.() -> Unit){
    Column(
        horizontalAlignment = horizontaAlignment,
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth(),
            content = content
        )
    }
}
package aguilarkevin.dev.nftmarketplace.ui.components.tabs

import aguilarkevin.dev.nftmarketplace.ui.theme.primaryColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TabItem(label: String, onClick: () -> Unit ){
    Button(
        onClick = onClick
    ){
        Text(text = label)
    }
}
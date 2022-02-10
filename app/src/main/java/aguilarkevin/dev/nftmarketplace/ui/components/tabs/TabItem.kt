package aguilarkevin.dev.nftmarketplace.ui.components.tabs

import aguilarkevin.dev.nftmarketplace.ui.theme.primaryColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun TabItem(label: String, onClick: () -> Unit, selected: Boolean) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (selected) {
                primaryColor
            } else {
                Color.White
            },
            contentColor = if (!selected) {
                primaryColor
            } else {
                Color.White
            },
        )
    ) {
        Text(text = label)
    }
}
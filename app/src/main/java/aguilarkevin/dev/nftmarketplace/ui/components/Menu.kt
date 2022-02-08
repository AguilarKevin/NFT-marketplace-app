package aguilarkevin.dev.nftmarketplace.ui.components

import aguilarkevin.dev.nftmarketplace.R
import aguilarkevin.dev.nftmarketplace.ui.theme.buttonContentGray
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Menu(label: String, items: List<String>) {

    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .wrapContentSize(Alignment.TopStart)
    ) {
        TextButton(
            onClick = { expanded = true },
            modifier = Modifier.padding(horizontal = 2.dp),
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color.White,
                contentColor = buttonContentGray
            )
        ) {
            Text(text = label)
            Spacer(modifier = Modifier.size(4.dp))
            Icon(
                painterResource(id = R.drawable.ic_expand_arrow),
                contentDescription = "Localized description",
            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.background(color = Color.White, shape = RoundedCornerShape(8.dp))
        ) {
            items.forEach {
                DropdownMenuItem(
                    onClick = { /* Handle refresh! */ },
                ) {
                    Text(text = it, color = Color.DarkGray)
                }
            }
        }
    }
}
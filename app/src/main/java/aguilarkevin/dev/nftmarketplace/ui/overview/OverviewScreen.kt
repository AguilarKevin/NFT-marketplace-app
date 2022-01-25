package aguilarkevin.dev.nftmarketplace.ui.overview

import aguilarkevin.dev.nftmarketplace.ui.theme.Shapes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun OverviewScreen(){

    var text by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("", TextRange(0, 1)))
    }

    Column( Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp  ).fillMaxWidth() ) {
        OutlinedTextField(
            value = text,
            onValueChange = {text = it},
            trailingIcon = { SearchRoundedIcon() },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun SearchRoundedIcon(){
    Surface(contentColor = Color.Black, shape = Shapes.large, modifier = Modifier.padding(6.dp)) {
        Icon(Icons.Filled.Search, contentDescription = null, tint = Color.White)
    }
}


@Preview(showBackground = true)
@Composable
fun OverviewScreenPreview(){
    Scaffold( Modifier.fillMaxWidth()) {
        OverviewScreen()
    }
}
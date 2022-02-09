package aguilarkevin.dev.nftmarketplace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import aguilarkevin.dev.nftmarketplace.ui.theme.NFTMarketplaceTheme
import androidx.compose.material.Scaffold

class NFTActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NFTMarketplaceTheme {

            }
        }
    }
}

@Composable
private fun NftActivity(){
    Scaffold() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NFTMarketplaceTheme {
        NftActivity()
    }
}
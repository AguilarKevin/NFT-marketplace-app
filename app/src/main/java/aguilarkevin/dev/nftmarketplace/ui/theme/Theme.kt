package aguilarkevin.dev.nftmarketplace.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = primaryColorLight,
    primaryVariant = primaryColor,
    secondary = secondaryColor
)

private val LightColorPalette = lightColors(
    primary = primaryColorLight,
    primaryVariant = primaryColor,
    secondary = secondaryColor,
    background = Color.LightGray,
    surface = backgroundGray,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = backgroundGray,
    onSurface = Color.Black
)

@Composable
fun NFTMarketplaceTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val systemUiController = rememberSystemUiController()

    systemUiController.setSystemBarsColor(
        color = Color.White
    )

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content,
    )
}
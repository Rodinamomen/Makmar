package com.makamar.makamar.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable


@Composable
fun MakamarTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) MakamarColorsDark else MakamarColorsLight
    CompositionLocalProvider(
        LocalMakamarColors provides colors,
    ) {
        content()
    }
}

object MakamarTheme {
    val colors: MakamarColors
        @Composable
        @ReadOnlyComposable get() = LocalMakamarColors.current
}
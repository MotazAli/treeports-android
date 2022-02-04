package com.aion8.treeports.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)


val LightColor = Color.White
val DarkColor = Color.Black

val Colors.ThemeBackgroundColor
    @Composable
    get() = if(isSystemInDarkTheme()) DarkColor else LightColor


val Colors.ThemeTextColor
    @Composable
    get() = if(isSystemInDarkTheme()) LightColor else DarkColor


val Colors.ThemeActiveColor
    @Composable
    get() = if(!isSystemInDarkTheme()) Purple500 else Color.LightGray



val Colors.ThemeInactiveColor : Color
    @Composable
    get() = if(!isSystemInDarkTheme()) Color.LightGray else DarkColor
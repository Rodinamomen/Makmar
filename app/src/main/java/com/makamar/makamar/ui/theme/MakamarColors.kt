package com.makamar.makamar.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
val LocalMakamarColors = staticCompositionLocalOf<MakamarColors> { error("Cannot provide colors") }
data class MakamarColors(
    val primary: Color,
    val status: Status,
    val text: TextColors,
    val background: Background,
)

data class TextColors(
    val text: Color,
    val hint: Color,
    val title: Color,
)

data class Status(
    val redAccent: Color,
    val orangeAccent: Color,
    val blueAccent: Color,
    val greenAccent: Color,
    val purpleAccent: Color,
    val yellowAccent: Color,
    val pinkAccent: Color,
)

data class Background(
    val natural100: Color,
    val natural200: Color,
    val natural300: Color,
    val natural400: Color,
    val red: Color,
    val orange: Color,
    val blue: Color,
    val green: Color,
    val purple: Color,
    val yellow: Color,
    val pink: Color,
)

val backgroundLight = Background(
    natural100 = Color(0xFFF1F5F9),
    natural200 = Color(0xFFE2E8F0),
    natural300 = Color(0xFFCBD5E1),
    natural400 = Color(0xFF94A3B8),
    red = Color(0xFFFEE2E2),
    orange = Color(0xFFFFEDD5),
    blue = Color(0xFFDBEAFE),
    green = Color(0xFFD1FAE5),
    purple = Color(0xFFF3E8FF),
    yellow = Color(0xFFFEF9C3),
    pink = Color(0xFFFCE7F3),
)
val statusLight = Status(
    redAccent = Color(0xFFEF4444),
    orangeAccent = Color(0xFFEA580C),
    blueAccent = Color(0xFF2563EB),
    greenAccent = Color(0xFF10B981),
    purpleAccent = Color(0xFF9333EA),
    yellowAccent = Color(0xFFD97706),
    pinkAccent = Color(0xFFDB2777)
)
val textLight = TextColors(
    text = Color(0xFF0F172A),
    hint = Color(0xFF6B7280),
    title = Color(0xFF334155)
)

val backgroundDark = Background(
    natural100 = Color(0xFF101322),
    natural200 = Color(0xFFE2E8F0),
    natural300 = Color(0xFFCBD5E1),
    natural400 = Color(0xFF94A3B8),
    red = Color(0x4D7F1D1D),
    orange = Color(0x4D7C2D12),
    blue =Color(0x4D164E63),
    green = Color(0x4D064E3B),
    purple = Color(0x4D581C87),
    yellow = Color(0x33F97316),
    pink = Color(0x4D831843),
)
val statusDark = Status(
    redAccent = Color(0xFFF87171),
    orangeAccent = Color(0xFFFB923C),
    blueAccent = Color(0xFF60A5FA),
    greenAccent = Color(0xFF34D399),
    purpleAccent = Color(0xFFC084FC),
    yellowAccent = Color(0xFFF97316),
    pinkAccent = Color(0xFFF472B6)
)
val textDark = TextColors(
    text = Color(0xFFF1F5F9),
    hint = Color(0xFF64748B),
    title = Color(0xFFE2E8F0)
)
val MakamarColorsLight = MakamarColors(
    primary = Color(0xFF1337EC),
    status = statusLight,
    text = textLight,
    background = backgroundLight
)
val MakamarColorsDark = MakamarColors(
    primary = Color(0xFF1337EC),
    status = statusDark,
    text = textDark,
    background = backgroundDark
)
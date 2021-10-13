package com.example.testlongtextsincompose

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object InfiniteBoundsText : Screen("infinite_bounds_screen")
    object InfiniteBoundsRowButSmallerText : Screen("not_quite_infinite_bounds_screen")
    object ScreenWidthText : Screen("screen_width_screen")
}

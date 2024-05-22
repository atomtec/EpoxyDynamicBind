package com.f11.epoxytrial

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// For simple items
data class CompositeItem(
    val id: Long,
    val type: Int,
    val text: String,
    @DrawableRes val imageRes: Int? = null,
    val content: List<ContentItem>
)

sealed class ContentItem {
    data class TextItem(val text: String) : ContentItem()
    data class ImageItem(@DrawableRes val imageRes: Int) : ContentItem()
}

data class CombinedItem(
    val id: Long,
    val topText1: String,
    val topText2: String,
    @DrawableRes val topImageRes: Int,
    val type: Int,  // Determines the type of middle content
    val middleText1: String = "",
    val middleText2: String = "",
    @DrawableRes val middleImageRes: Int = 0,
    @DrawableRes val bottomIcon1: Int,
    @DrawableRes val bottomIcon2: Int,
    @DrawableRes val bottomIcon3: Int,
    @DrawableRes val bottomIcon4: Int
)





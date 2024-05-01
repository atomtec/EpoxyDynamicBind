package com.f11.epoxytrial

// For simple items
data class SimpleItem(val title: String)

// For complex items (already defined earlier)
data class ComplexItem(val text1: String, val text2: String, val text3: String, val text4: String, val imageRes1: Int, val imageRes2: Int)

data class ComplexItem2(
    val text1: String,
    val text2: String,
    val text3: String,
    val text4: String,
    val imageRes1: Int,
    val imageRes2: Int,
    var showText1: Boolean = true,
    var showText3: Boolean = true
)

data class CompositeItem(
    val id: Long,
    val type: Int,
    val text: String,
    val imageRes: Int? = null
)



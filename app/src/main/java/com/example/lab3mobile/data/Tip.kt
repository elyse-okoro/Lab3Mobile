package com.example.lab3mobile.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Совет дня: номер дня, заголовок, краткое и полное описание, иллюстрация.
 */
data class Tip(
    val day: Int,
    @param:StringRes val titleRes: Int,
    @param:StringRes val summaryRes: Int,
    @param:StringRes val descriptionRes: Int,
    @param:DrawableRes val imageRes: Int
)

package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val heroName: Int,
    @StringRes val description: Int,
    @DrawableRes val heroImage: Int
)

package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(
            heroName = R.string.hero1,
            description = R.string.description1,
            heroImage = R.drawable.android_superhero1
        ),
        Hero(
            heroName = R.string.hero2,
            description = R.string.description2,
            heroImage = R.drawable.android_superhero2
        ),
        Hero(
            heroName = R.string.hero3,
            description = R.string.description3,
            heroImage = R.drawable.android_superhero3
        ),
        Hero(
            heroName = R.string.hero4,
            description = R.string.description4,
            heroImage = R.drawable.android_superhero4
        ),
        Hero(
            heroName = R.string.hero5,
            description = R.string.description5,
            heroImage = R.drawable.android_superhero5
        ),
        Hero(
            heroName = R.string.hero6,
            description = R.string.description6,
            heroImage = R.drawable.android_superhero6
        )
    )
}
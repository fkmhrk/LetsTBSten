package com.example.tbstenjam.core.data.tbsten

import com.example.tbstenjam.core.model.TBSTenText
import javax.inject.Inject
import kotlin.random.Random

class TBSTenRepositoryImpl @Inject constructor(): TBSTenRepository {
    override fun generate(): TBSTenText {
        val characters = listOf("て", "べ", "す")
        val length = Random.nextInt(3, 8)
        val middlePart = (1..length).map { characters.random() }.joinToString("")
        return TBSTenText("て${middlePart}てん")
    }
}
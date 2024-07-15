package com.example.tbstenjam.core.data.tbsten

import com.example.tbstenjam.core.model.TBSTenText
import javax.inject.Inject

class TBSTenRepositoryImpl @Inject constructor(
    private val randomRepository: RandomRepository,
): TBSTenRepository {

    override fun generate(): TBSTenText {
        val characters = listOf("て", "べ", "す")
        val length = randomRepository.nextInt()
        val middlePart = (1..length).joinToString("") {
            randomRepository.pick(characters)
        }
        return TBSTenText("て${middlePart}てん")
    }
}
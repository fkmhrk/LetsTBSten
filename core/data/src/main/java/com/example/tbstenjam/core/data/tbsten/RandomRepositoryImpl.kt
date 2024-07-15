package com.example.tbstenjam.core.data.tbsten

import javax.inject.Inject
import kotlin.random.Random

class RandomRepositoryImpl @Inject constructor(): RandomRepository {
    override fun nextInt(): Int {
        return Random.nextInt(3, 8)
    }

    override fun pick(list: List<String>): String {
        return list.random()
    }
}
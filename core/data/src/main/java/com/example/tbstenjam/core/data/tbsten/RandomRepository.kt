package com.example.tbstenjam.core.data.tbsten

interface RandomRepository {
    fun nextInt(): Int
    fun pick(list: List<String>): String
}
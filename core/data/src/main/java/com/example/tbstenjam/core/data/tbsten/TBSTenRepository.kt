package com.example.tbstenjam.core.data.tbsten

import com.example.tbstenjam.core.model.TBSTenText

interface TBSTenRepository {
    /**
     * Generate a [TBSTenText].
     */
    fun generate(): TBSTenText
}
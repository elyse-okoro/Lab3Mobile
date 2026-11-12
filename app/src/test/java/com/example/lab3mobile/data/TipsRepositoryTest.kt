package com.example.lab3mobile.data

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class TipsRepositoryTest {

    private val repository = TipsRepository()

    @Test
    fun thereIsOneTipForEachDayOfTheMonth() {
        val tips = repository.getTips()

        assertEquals(30, tips.size)
        assertEquals((1..30).toList(), tips.map { it.day })
    }

    @Test
    fun everyTipHasItsOwnTextsAndImage() {
        val tips = repository.getTips()

        assertEquals(30, tips.map { it.titleRes }.toSet().size)
        assertEquals(30, tips.map { it.summaryRes }.toSet().size)
        assertEquals(30, tips.map { it.descriptionRes }.toSet().size)
        assertEquals(30, tips.map { it.imageRes }.toSet().size)
    }

    @Test
    fun getTip_findsByDay() {
        assertEquals(15, repository.getTip(15)?.day)
        assertNull(repository.getTip(31))
    }
}

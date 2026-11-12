package com.example.lab3mobile.data

/**
 * Единая точка доступа к советам для ViewModel. Сейчас данные лежат в ресурсах,
 * при переходе на базу или сеть меняется только этот класс.
 */
class TipsRepository(private val tips: List<Tip> = TipsDataSource.loadTips()) {

    fun getTips(): List<Tip> = tips

    fun getTip(day: Int): Tip? = tips.firstOrNull { it.day == day }
}

package com.example.lab3mobile.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lab3mobile.TipsApplication

/**
 * ViewModel экрана подробностей получает номер дня, поэтому нужна своя фабрика.
 */
class TipDetailViewModelFactory(
    private val application: TipsApplication,
    private val day: Int
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TipDetailViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TipDetailViewModel(application.repository, day) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
    }
}

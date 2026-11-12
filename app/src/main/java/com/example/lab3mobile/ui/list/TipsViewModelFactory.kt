package com.example.lab3mobile.ui.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lab3mobile.TipsApplication

class TipsViewModelFactory(private val application: TipsApplication) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TipsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TipsViewModel(application.repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
    }
}

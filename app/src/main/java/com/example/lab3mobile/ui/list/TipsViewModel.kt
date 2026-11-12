package com.example.lab3mobile.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lab3mobile.data.Tip
import com.example.lab3mobile.data.TipsRepository

class TipsViewModel(repository: TipsRepository) : ViewModel() {

    private val _tips = MutableLiveData(repository.getTips())
    val tips: LiveData<List<Tip>> = _tips
}

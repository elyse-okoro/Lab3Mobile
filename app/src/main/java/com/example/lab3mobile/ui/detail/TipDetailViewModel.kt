package com.example.lab3mobile.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lab3mobile.data.Tip
import com.example.lab3mobile.data.TipsRepository

class TipDetailViewModel(repository: TipsRepository, day: Int) : ViewModel() {

    private val _tip = MutableLiveData(repository.getTip(day))
    val tip: LiveData<Tip?> = _tip
}

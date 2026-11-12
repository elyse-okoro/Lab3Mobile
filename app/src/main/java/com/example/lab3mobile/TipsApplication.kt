package com.example.lab3mobile

import android.app.Application
import com.example.lab3mobile.data.TipsRepository

class TipsApplication : Application() {

    val repository: TipsRepository by lazy { TipsRepository() }
}

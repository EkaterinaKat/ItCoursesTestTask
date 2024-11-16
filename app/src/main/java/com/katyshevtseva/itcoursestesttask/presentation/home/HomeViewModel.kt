package com.katyshevtseva.itcoursestesttask.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import com.katyshevtseva.itcoursestesttask.domain.usecase.UseCase
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {

    fun method() {
        Log.i("tag8527565", "HomeViewModel")
        useCase()
    }
}
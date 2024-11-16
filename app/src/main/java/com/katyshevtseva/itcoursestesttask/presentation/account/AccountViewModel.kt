package com.katyshevtseva.itcoursestesttask.presentation.account

import android.util.Log
import androidx.lifecycle.ViewModel
import com.katyshevtseva.itcoursestesttask.domain.usecase.UseCase
import javax.inject.Inject

class AccountViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {

    fun method() {
        Log.i("tag8527565", "AccountViewModel")
        useCase()
    }
}
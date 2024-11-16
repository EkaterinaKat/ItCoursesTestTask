package com.katyshevtseva.itcoursestesttask.domain.usecase

import com.katyshevtseva.itcoursestesttask.domain.repository.Repository
import javax.inject.Inject

class UseCase @Inject constructor(
    private val repository: Repository
) {

    operator fun invoke() {
        repository.method()
    }
}

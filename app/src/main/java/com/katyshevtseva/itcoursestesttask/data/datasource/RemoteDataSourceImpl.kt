package com.katyshevtseva.itcoursestesttask.data.datasource

import com.katyshevtseva.itcoursestesttask.data.network.ApiService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : RemoteDataSource {

    override fun method() {
        apiService.method()
    }
}

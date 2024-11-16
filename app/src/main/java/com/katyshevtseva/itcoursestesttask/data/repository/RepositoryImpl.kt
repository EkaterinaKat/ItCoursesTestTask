package com.katyshevtseva.itcoursestesttask.data.repository

import com.katyshevtseva.itcoursestesttask.data.datasource.LocalDataSource
import com.katyshevtseva.itcoursestesttask.data.datasource.RemoteDataSource
import com.katyshevtseva.itcoursestesttask.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : Repository {

    override fun method() {
        localDataSource.method()
        remoteDataSource.method()
    }
}

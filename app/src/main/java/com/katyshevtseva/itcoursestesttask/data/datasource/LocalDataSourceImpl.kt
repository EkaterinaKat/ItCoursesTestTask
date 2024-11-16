package com.katyshevtseva.itcoursestesttask.data.datasource

import com.katyshevtseva.itcoursestesttask.data.database.Database
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val database: Database
) : LocalDataSource {

    override fun method() {
        database.method()
    }
}
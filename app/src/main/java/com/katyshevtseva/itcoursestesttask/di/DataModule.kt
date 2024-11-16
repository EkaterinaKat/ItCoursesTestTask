package com.katyshevtseva.itcoursestesttask.di

import com.katyshevtseva.itcoursestesttask.data.datasource.LocalDataSource
import com.katyshevtseva.itcoursestesttask.data.datasource.LocalDataSourceImpl
import com.katyshevtseva.itcoursestesttask.data.datasource.RemoteDataSource
import com.katyshevtseva.itcoursestesttask.data.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: LocalDataSourceImpl): LocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: RemoteDataSourceImpl): RemoteDataSource
}
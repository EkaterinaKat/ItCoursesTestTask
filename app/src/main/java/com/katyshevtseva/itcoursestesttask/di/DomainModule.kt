package com.katyshevtseva.itcoursestesttask.di

import com.katyshevtseva.itcoursestesttask.data.repository.RepositoryImpl
import com.katyshevtseva.itcoursestesttask.domain.repository.Repository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: RepositoryImpl): Repository
}

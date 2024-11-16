package com.katyshevtseva.itcoursestesttask.di

import com.katyshevtseva.itcoursestesttask.presentation.account.AccountFragment
import com.katyshevtseva.itcoursestesttask.presentation.favorites.FavoritesFragment
import com.katyshevtseva.itcoursestesttask.presentation.home.HomeFragment
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: AccountFragment)

    fun inject(activity: FavoritesFragment)

    fun inject(activity: HomeFragment)
}

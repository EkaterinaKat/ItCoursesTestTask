package com.katyshevtseva.itcoursestesttask.di

import androidx.lifecycle.ViewModel
import com.katyshevtseva.itcoursestesttask.presentation.account.AccountViewModel
import com.katyshevtseva.itcoursestesttask.presentation.favorites.FavoritesViewModel
import com.katyshevtseva.itcoursestesttask.presentation.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(AccountViewModel::class)
    @Binds
    fun bindAccountViewModel(impl: AccountViewModel): ViewModel

    @IntoMap
    @ViewModelKey(FavoritesViewModel::class)
    @Binds
    fun bindFavoritesViewModel(impl: FavoritesViewModel): ViewModel

    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    @Binds
    fun bindHomeViewModel(impl: HomeViewModel): ViewModel
}

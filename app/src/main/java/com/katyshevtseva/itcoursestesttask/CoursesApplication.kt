package com.katyshevtseva.itcoursestesttask

import android.app.Application
import com.katyshevtseva.itcoursestesttask.di.DaggerApplicationComponent

class CoursesApplication : Application() {

    val component by lazy {
        DaggerApplicationComponent.create()
    }
}
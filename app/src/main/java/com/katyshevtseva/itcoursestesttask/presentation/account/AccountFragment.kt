package com.katyshevtseva.itcoursestesttask.presentation.account

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.katyshevtseva.itcoursestesttask.CoursesApplication
import com.katyshevtseva.itcoursestesttask.R
import com.katyshevtseva.itcoursestesttask.presentation.ViewModelFactory
import javax.inject.Inject

class AccountFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[AccountViewModel::class.java]
    }

    private val component by lazy {
        (requireActivity().application as CoursesApplication).component
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        component.inject(this)
        viewModel.method()
    }

}
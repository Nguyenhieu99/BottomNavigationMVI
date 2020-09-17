package com.example.bottomnavigationmvi.ui.home

import aacmvi.AacMviFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.bottomnavigationmvi.R

class HomeFragment :
    AacMviFragment<HomeFragmentViewState, HomeFragmentViewEffect, HomeFragmentViewEvent, HomeFragmentVM>() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val button_test = root.findViewById<Button>(R.id.bt_test)

        button_test.setOnClickListener {

//            Toast.makeText(this.context, "Click to Button TEST", Toast.LENGTH_SHORT).show()
        }

        return root
    }

    override val viewModel: HomeFragmentVM by viewModels()

    override fun renderViewState(viewState: HomeFragmentViewState) {
        when(viewState.status) {
            HomeFragmentViewStatus.Start -> {
                Toast.makeText(this.context, "Start Application", Toast.LENGTH_SHORT).show()
            }
        }
//        TODO("Not yet implemented")
    }

    override fun renderViewEffect(viewEffect: HomeFragmentViewEffect) {
//        TODO("Not yet implemented")
    }
}
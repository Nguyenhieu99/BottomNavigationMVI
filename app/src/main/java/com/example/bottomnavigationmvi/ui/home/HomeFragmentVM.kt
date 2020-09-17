package com.example.bottomnavigationmvi.ui.home

import aacmvi.AacMviFragment
import aacmvi.AacMviViewModel
import android.app.Application

class HomeFragmentVM(application: Application) :
    AacMviViewModel<HomeFragmentViewState, HomeFragmentViewEffect, HomeFragmentViewEvent>(
        application) {


}
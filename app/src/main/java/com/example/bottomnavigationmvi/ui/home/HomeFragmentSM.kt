package com.example.bottomnavigationmvi.ui.home


data class HomeFragmentViewState(
    val status: HomeFragmentViewStatus.Start
)

sealed class HomeFragmentViewEffect() {
    data class ShowToast(val message: String) : HomeFragmentViewEffect()
}

sealed class HomeFragmentViewEvent() {

}


sealed class HomeFragmentViewStatus {
    object Start: HomeFragmentViewStatus()
}
package com.example.bottomnavigationmvi.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.bottomnavigationmvi.R

class DashboardFragment : Fragment() {

//    private lateinit var dashboardViewModel: DashboardViewModel
    
    private val dashboardViewModel: DashboardViewModel by viewModels()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

//        dashboardViewModel =
//                ViewModelProviders.of(this).get(DashboardViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)

        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })


        return root
    }
}
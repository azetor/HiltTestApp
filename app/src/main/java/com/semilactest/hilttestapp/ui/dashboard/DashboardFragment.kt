package com.semilactest.hilttestapp.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.semilactest.hilttestapp.FragmentService
import com.semilactest.hilttestapp.ApplicationService
import com.semilactest.hilttestapp.ActivityService
import com.semilactest.hilttestapp.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DashboardFragment : Fragment() {

    @Inject lateinit var applicationService: ApplicationService
    @Inject lateinit var activityService: ActivityService
    @Inject lateinit var fragmentService: FragmentService

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this::class.java
            .let {
                Log.d("HILT", "--- FRAGMENT ---")
                applicationService.level(it)
                activityService.level(it)
                fragmentService.level(it)
                Log.d("HILT", "--- FRAGMENT ---")
            }
    }
}
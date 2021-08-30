package com.nssn.ui.services

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nssn.R

class FuturePlanFragment : Fragment() {

    companion object {
        fun newInstance() = FuturePlanFragment()
    }

    private lateinit var viewModel: FuturePlanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.future_plan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FuturePlanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
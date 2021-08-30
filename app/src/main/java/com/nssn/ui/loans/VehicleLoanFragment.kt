package com.nssn.ui.loans

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nssn.R

class VehicleLoanFragment : Fragment() {

    companion object {
        fun newInstance() = VehicleLoanFragment()
    }

    private lateinit var viewModel: VehicleLoanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vehicle_loan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VehicleLoanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
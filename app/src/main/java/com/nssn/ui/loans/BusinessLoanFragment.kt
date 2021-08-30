package com.nssn.ui.loans

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nssn.R

class BusinessLoanFragment : Fragment() {

    companion object {
        fun newInstance() = BusinessLoanFragment()
    }

    private lateinit var viewModel: BusinessLoanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.business_loan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BusinessLoanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
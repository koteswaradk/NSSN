package com.nssn.ui.loans

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nssn.R

class MortgageLoanFragment : Fragment() {

    companion object {
        fun newInstance() = MortgageLoanFragment()
    }

    private lateinit var viewModel: MortgageLoanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mortgage_loan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MortgageLoanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
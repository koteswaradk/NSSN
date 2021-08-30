package com.nssn.ui.loans

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nssn.R

class GoldLoanFragment : Fragment() {

    companion object {
        fun newInstance() = GoldLoanFragment()
    }

    private lateinit var viewModel: GoldLoanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gold_loan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GoldLoanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
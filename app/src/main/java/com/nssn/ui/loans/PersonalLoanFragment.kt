package com.nssn.ui.loans

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nssn.R

class PersonalLoanFragment : Fragment() {

    companion object {
        fun newInstance() = PersonalLoanFragment()
    }

    private lateinit var viewModel: PersonalLoanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.personal_loan_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PersonalLoanViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
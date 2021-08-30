package com.nssn.ui.accountopening

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nssn.R

class AccontOpeningFragment : Fragment() {

    companion object {
        fun newInstance() = AccontOpeningFragment()
    }

    private lateinit var viewModel: AccontOpeningViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.accont_opening_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AccontOpeningViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
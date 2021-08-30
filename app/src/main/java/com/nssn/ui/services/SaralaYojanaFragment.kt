package com.nssn.ui.services

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nssn.R

class SaralaYojanaFragment : Fragment() {

    companion object {
        fun newInstance() = SaralaYojanaFragment()
    }

    private lateinit var viewModel: SaralaYojanaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sarala_yojana_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SaralaYojanaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
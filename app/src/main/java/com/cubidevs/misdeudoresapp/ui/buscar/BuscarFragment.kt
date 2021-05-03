package com.cubidevs.misdeudoresapp.ui.buscar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cubidevs.misdeudoresapp.R
import com.cubidevs.misdeudoresapp.databinding.FragmentBuscarBinding

class BuscarFragment : Fragment() {

    private lateinit var binding: FragmentBuscarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBuscarBinding.inflate(inflater, container, false)

        binding.buscarButton.setOnClickListener {
            val nombre = binding.nombreBuscarEditText.text.toString()


        }
        return binding.root
    }
}
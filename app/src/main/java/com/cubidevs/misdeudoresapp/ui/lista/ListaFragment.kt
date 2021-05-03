package com.cubidevs.misdeudoresapp.ui.lista

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cubidevs.misdeudoresapp.databinding.FragmentCrearBinding
import com.cubidevs.misdeudoresapp.databinding.FragmentListaBinding

class ListaFragment : Fragment() {

    private lateinit var binding: FragmentListaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListaBinding.inflate(inflater, container, false)

        return binding.root
    }
}
package com.cubidevs.misdeudoresapp.ui.actualizar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cubidevs.misdeudoresapp.databinding.FragmentActualizarBinding

class ActualizarFragment : Fragment() {

    private lateinit var binding: FragmentActualizarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentActualizarBinding.inflate(inflater, container, false)

        binding.modificarButton.setOnClickListener {
            val nombre = binding.nombreBuscarEditText.text.toString()
            val telefono = binding.telefonoEditText.text.toString()
            val valor = binding.valorEditText.text.toString()
        }

        return binding.root
    }

}
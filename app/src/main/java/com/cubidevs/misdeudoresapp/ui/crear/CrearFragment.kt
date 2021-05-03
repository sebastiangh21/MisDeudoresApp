package com.cubidevs.misdeudoresapp.ui.crear

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cubidevs.misdeudoresapp.R
import com.cubidevs.misdeudoresapp.databinding.FragmentBuscarBinding
import com.cubidevs.misdeudoresapp.databinding.FragmentCrearBinding
import java.sql.Types.NULL

class CrearFragment : Fragment() {

    private lateinit var binding: FragmentCrearBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCrearBinding.inflate(inflater, container, false)


        return binding.root
    }

    fun cleanViews() {
        binding.nombreEditText.setText("")
        binding.telefonoEditText.setText("")
        binding.valorEditText.setText("")
    }
}
package com.cubidevs.misdeudoresapp.ui.borrar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cubidevs.misdeudoresapp.R
import com.cubidevs.misdeudoresapp.databinding.FragmentBorrarBinding

class BorrarFragment : Fragment() {

    private lateinit var binding: FragmentBorrarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBorrarBinding.inflate(inflater, container, false)

        binding.borrarButton.setOnClickListener {
            val nombre = binding.nombreBorrarEditText.text.toString()
        }

        return binding.root
    }

}
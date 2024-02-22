package com.example.test.OnBoarding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.test.R
import com.google.android.material.button.MaterialButton

class FirstScreenFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first_screen, container, false)

        view.findViewById<MaterialButton>(R.id.first_screen_next).setOnClickListener {
            findNavController().navigate(R.id.action_firstScreenFragment_to_secondScreenFragment)
        }

        view.findViewById<MaterialButton>(R.id.first_screen_skip).setOnClickListener {
            findNavController().navigate(R.id.action_firstScreenFragment_to_thirdScreenFragment)
        }

        return view
    }
}
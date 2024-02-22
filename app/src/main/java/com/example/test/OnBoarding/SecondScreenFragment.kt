package com.example.test.OnBoarding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.test.R
import com.google.android.material.button.MaterialButton


class SecondScreenFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_screen, container, false)

        view.findViewById<MaterialButton>(R.id.second_screen_next).setOnClickListener {
            findNavController().navigate(R.id.action_secondScreenFragment_to_thirdScreenFragment)
        }
        view.findViewById<MaterialButton>(R.id.second_screen_skip).setOnClickListener {
            findNavController().navigate(R.id.action_secondScreenFragment_to_thirdScreenFragment)
        }
        return view
    }

}
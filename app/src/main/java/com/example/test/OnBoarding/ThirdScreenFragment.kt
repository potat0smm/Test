package com.example.test.OnBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.test.R
import com.google.android.material.button.MaterialButton


class ThirdScreenFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_screen_frament, container, false)

        view.findViewById<MaterialButton>(R.id.signUp).setOnClickListener {
            findNavController().navigate(R.id.action_thirdScreenFragment_to_createAccountFragment)
        }

        view.findViewById<TextView>(R.id.signIn).setOnClickListener {
            findNavController().navigate(R.id.action_thirdScreenFragment_to_mainFragment)
        }
        return view
    }

}
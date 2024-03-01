package com.example.test.Main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test.R
import com.example.test.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding?=null
    private val binding get () = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentMainBinding.inflate(inflater, container, false)

        replaceFragment(MenuFragment())

        binding?.bottomNavigationView?.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.home -> replaceFragment(MenuFragment())
                R.id.wallet -> replaceFragment(WalletFragment())
                R.id.track -> replaceFragment(TrackFragment())
                R.id.profile -> replaceFragment(ProfileFragment())

                else -> {}
            }
            true
        }

        return binding?.root
    }

    private fun replaceFragment(fragment: Fragment) {
        fragment?.let{
            val fragmentManager = childFragmentManager
            val fragmentTransition = fragmentManager.beginTransaction()
            fragmentTransition.replace(R.id.frame_layout,it)
            fragmentTransition.commit()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
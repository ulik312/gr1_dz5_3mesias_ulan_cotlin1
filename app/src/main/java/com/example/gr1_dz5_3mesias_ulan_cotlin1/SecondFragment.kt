package com.example.gr1_dz5_3mesias_ulan_cotlin1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gr1_dz5_3mesias_ulan_cotlin1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private var sum = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ClickListener()
    }

    private fun ClickListener() {

        binding.plus.setOnClickListener {
            if (sum == 10 || binding.plus.text.equals("-1")){
                binding.plus.text = "-1"
                sum --
                binding.nul.text = sum.toString()
                if (sum ==0){
                    binding.plus.text = "+1"
                    requireActivity().supportFragmentManager.beginTransaction().add(R.id.sf,
                        ThirdFragment()
                    ).commit()
                }
            }
            else{
                sum ++
                binding.nul.text = sum.toString()
            }
        }
    }

}
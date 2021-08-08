package com.example.bmicalculator.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.bmicalculator.R
import com.example.bmicalculator.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        binding.weightUnits.setOnCheckedChangeListener { radioGroup: RadioGroup, checkedId: Int ->

            // Here is the checkId is METRIC UNITS view then make the view visible else US UNITS view.
            if (checkedId == R.id.lb_radio) {
                //Get the text from the weightEditText
                //As it is in  kg let's convert it into lbs
                val weightInKG=binding.weightEditText.text.toString().toInt()
                val weightInLB = (weightInKG/ 0.45359237)
                binding.weightEditText.setText(weightInLB.toString())


            } else {
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
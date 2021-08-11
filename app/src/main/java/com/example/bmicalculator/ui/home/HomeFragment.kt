package com.example.bmicalculator.ui.home

import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bmicalculator.R
import com.example.bmicalculator.databinding.FragmentHomeBinding
import com.example.bmicalculator.ui.home.adapters.AgeAdapter
import com.example.bmicalculator.ui.home.model.AgeModel

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private var ageAdapter: AgeAdapter? = null
    private var ageList: ArrayList<AgeModel>? = null // We will initialize the list later.
    private var currentAgePosition = -1 // Current Position of Age.


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
        ageList = Constants.defaultAgeList()
        setUpAgeRecyclerView()
        setHasOptionsMenu(true)
        return root
    }
    fun setUpAgeRecyclerView()
    {
        currentAgePosition++
        ageList!![currentAgePosition].setIsOnScreen(true)
        val recyclerView = binding.ageSelector
        recyclerView.adapter = AgeAdapter(ageList!!,requireContext())
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.calculate_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId)
        {
            R.id.your_profile->{
                Toast.makeText(requireContext(),"This will be Implemented",Toast.LENGTH_SHORT).show()
            }
        }
     return true
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
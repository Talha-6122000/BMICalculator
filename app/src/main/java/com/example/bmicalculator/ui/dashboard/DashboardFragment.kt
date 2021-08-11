package com.example.bmicalculator.ui.dashboard

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bmicalculator.R
import com.example.bmicalculator.databinding.FragmentDashboardBinding
import lecho.lib.hellocharts.model.PieChartData
import lecho.lib.hellocharts.model.SliceValue


class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val pieData = ArrayList<SliceValue>()
        pieData.add(SliceValue(15F, Color.BLUE))
        pieData.add(SliceValue(25F, Color.GRAY))
        pieData.add(SliceValue(10F, Color.RED))
        pieData.add(SliceValue(60F, Color.MAGENTA))
        val pieChartData = PieChartData(pieData)
        binding.chart.pieChartData=pieChartData
        setHasOptionsMenu(true)
        return root

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.bmi_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.recent->
            {
                Toast.makeText(requireContext(),"This show the recent calculation of BMI",Toast.LENGTH_SHORT).show()
            }

        }
       return true
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
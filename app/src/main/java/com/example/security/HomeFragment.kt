package com.example.security

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


// Steps for recycler View :
//       i)  made recycler view tag
//       ii) made 1 item that represents every items
//       iii) make adapter class :- write all classes, make viewholderclass()
//       iv) now declare list members ( make data class)
//       v) insert data in data class
//       vi) find recycler view, set layout, set adapter
//                                                      --- that's it....
class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ListMembers = listOf<memberModel>(
            memberModel("Temp"),
            memberModel("temp2"),


        )

        val adapter = memberAdapter(ListMembers)

        val recycler = requireView().findViewById<RecyclerView>(R.id.Recycler_member)
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
    }

    companion object {

        @JvmStatic
        fun newInstance() =  HomeFragment()
    }
}
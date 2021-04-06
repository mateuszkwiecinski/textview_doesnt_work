package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class MainFragment : Fragment(R.layout.fragment_with_button) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnNext).setOnClickListener {
            findNavController().navigate("https://example.com/path/second-id/specificFlow".toUri())
        }
    }
}

class InvalidFragment : Fragment(R.layout.fragment_message) {

    private val args by navArgs<InvalidFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.txtTitle).text = "(Invalid) objectId=${args.objectId}"
    }
}

class ExpectedFragment : Fragment(R.layout.fragment_message) {

    private val args by navArgs<ExpectedFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.txtTitle).text = "(Expected) objectId=${args.objectId}"
    }
}

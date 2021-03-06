package com.example.soccerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.soccerquiz.databinding.FragmentWelcomeScreenBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeScreenFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentWelcomeScreenBinding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_welcome_screen, container, false)

        binding.letsPlayButton.setOnClickListener { view: View ->
            Navigation.findNavController(view)
                .navigate(R.id.action_welcomeScreenFragment_to_quizFragment)
        }

        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"

        return binding.root
    }


}
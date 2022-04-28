package com.nightlyexamples.fragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
/**
 *
 *  Step 4 - This class must extend Fragment() class
 *                  override onCreateView
 *
 *  Step 5- Create an xml layout file to contain the fragment
 *                  We name ours "fragment_example_view"
 *                  Choose 'fragment' as root element.
 *                  In the onCreateView set the container.
 *
 *
 *
 *
 *
 * */
class FragmentExampleController : Fragment() {
    // Step 4 - CTRL + O
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(
            inflater,
            container,
            savedInstanceState
        )
    }
}
package com.namma.raste.ui.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.namma.raste.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragmentToCameraFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_cameraFragment)

    public fun actionHomeFragmentToTrackerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_trackerFragment)

    public fun actionHomeFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_loginFragment)

    public fun actionHomeFragmentToProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment)
  }
}

package com.namma.raste.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.namma.raste.R

public class ProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionProfileFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_loginFragment)
  }
}

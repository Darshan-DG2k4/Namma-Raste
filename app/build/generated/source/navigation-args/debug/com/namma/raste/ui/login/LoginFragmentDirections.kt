package com.namma.raste.ui.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.namma.raste.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_homeFragment)
  }
}

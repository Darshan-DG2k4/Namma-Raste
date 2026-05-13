package com.namma.raste.ui.preview

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PreviewFragmentArgs(
  public val photoPath: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("photoPath", this.photoPath)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("photoPath", this.photoPath)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PreviewFragmentArgs {
      bundle.setClassLoader(PreviewFragmentArgs::class.java.classLoader)
      val __photoPath : String?
      if (bundle.containsKey("photoPath")) {
        __photoPath = bundle.getString("photoPath")
        if (__photoPath == null) {
          throw IllegalArgumentException("Argument \"photoPath\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"photoPath\" is missing and does not have an android:defaultValue")
      }
      return PreviewFragmentArgs(__photoPath)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PreviewFragmentArgs {
      val __photoPath : String?
      if (savedStateHandle.contains("photoPath")) {
        __photoPath = savedStateHandle["photoPath"]
        if (__photoPath == null) {
          throw IllegalArgumentException("Argument \"photoPath\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"photoPath\" is missing and does not have an android:defaultValue")
      }
      return PreviewFragmentArgs(__photoPath)
    }
  }
}

package com.namma.raste.ui.camera

import android.os.Bundle
import androidx.navigation.NavDirections
import com.namma.raste.R
import kotlin.Int
import kotlin.String

public class CameraFragmentDirections private constructor() {
  private data class ActionCameraFragmentToPreviewFragment(
    public val photoPath: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_cameraFragment_to_previewFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("photoPath", this.photoPath)
        return result
      }
  }

  public companion object {
    public fun actionCameraFragmentToPreviewFragment(photoPath: String): NavDirections =
        ActionCameraFragmentToPreviewFragment(photoPath)
  }
}

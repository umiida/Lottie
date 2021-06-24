package uz.tatunf.programming.ui.detail

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

data class DetailFragmentArgs(
  val pos: Int = 0
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("pos", this.pos)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __pos : Int
      if (bundle.containsKey("pos")) {
        __pos = bundle.getInt("pos")
      } else {
        __pos = 0
      }
      return DetailFragmentArgs(__pos)
    }
  }
}

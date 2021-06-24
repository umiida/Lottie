package uz.tatunf.programming.ui.detail

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import uz.tatunf.programming.R

class DetailFragmentDirections private constructor() {
  private data class ActionDetailFragmentToFragmentWebView(
    val pos: Int = 0
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_detailFragment_to_fragmentWebView

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("pos", this.pos)
      return result
    }
  }

  companion object {
    fun actionDetailFragmentToFragmentWebView(pos: Int = 0): NavDirections =
        ActionDetailFragmentToFragmentWebView(pos)
  }
}

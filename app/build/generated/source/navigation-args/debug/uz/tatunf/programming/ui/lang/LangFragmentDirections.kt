package uz.tatunf.programming.ui.lang

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import uz.tatunf.programming.R

class LangFragmentDirections private constructor() {
  private data class ActionLangFragmentToDetailFragment(
    val pos: Int = 0
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_langFragment_to_detailFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("pos", this.pos)
      return result
    }
  }

  companion object {
    fun actionLangFragmentToDetailFragment(pos: Int = 0): NavDirections =
        ActionLangFragmentToDetailFragment(pos)
  }
}

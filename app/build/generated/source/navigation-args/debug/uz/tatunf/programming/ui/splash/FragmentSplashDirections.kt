package uz.tatunf.programming.ui.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.tatunf.programming.R

class FragmentSplashDirections private constructor() {
  companion object {
    fun actionFragmentSplashToLangFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fragmentSplash_to_langFragment)
  }
}

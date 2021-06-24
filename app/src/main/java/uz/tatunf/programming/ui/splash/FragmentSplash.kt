package uz.tatunf.programming.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import uz.tatunf.programming.R
import uz.tatunf.programming.databinding.FragmentSplashBinding

class FragmentSplash: Fragment(R.layout.fragment_splash){
    private lateinit var binding: FragmentSplashBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)
        navController = Navigation.findNavController(view)
        binding.apply {
            splash.setMinAndMaxFrame(0, 357)
            splash.playAnimation()
        }
        Handler(Looper.getMainLooper()).postDelayed({
            val action = FragmentSplashDirections.actionFragmentSplashToLangFragment()
            navController.navigate(action)
        }, 4000)
    }
}
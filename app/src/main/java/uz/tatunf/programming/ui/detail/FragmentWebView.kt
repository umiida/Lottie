package uz.tatunf.programming.ui.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import uz.tatunf.programming.R
import uz.tatunf.programming.databinding.WebViewBinding

class FragmentWebView : Fragment(R.layout.web_view) {
    private lateinit var binding: WebViewBinding
    private val args: FragmentWebViewArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = WebViewBinding.bind(view)
        binding.apply {
            when (args.pos) {
                1 -> {
                    webView.loadUrl("https://www.java.com")
                }
                2 -> {
                    webView.loadUrl("https://kotlinlang.org")
                }
                3 -> {
                    webView.loadUrl("https://www.w3schools.com/CPP/default.asp")
                }
                4 -> {
                    webView.loadUrl("https://www.w3schools.com/js/")
                }
                5 -> {
                    webView.loadUrl("https://www.typescriptlang.org/")
                }
                6 -> {
                    webView.loadUrl("https://www.w3schools.com/css/")
                }
                7 -> {
                    webView.loadUrl("https://www.python.org/")
                }
                8 -> {
                    webView.loadUrl("https://www.php.net/")
                }
                9 -> {
                    webView.loadUrl("https://www.w3schools.com/cs/index.php")
                }
            }
        }
    }
}
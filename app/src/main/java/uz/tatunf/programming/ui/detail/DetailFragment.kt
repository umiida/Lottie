package uz.tatunf.programming.ui.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import org.koin.android.viewmodel.ext.android.viewModel
import uz.tatunf.programming.R
import uz.tatunf.programming.databinding.ActionBarDetailBinding
import uz.tatunf.programming.databinding.FragmentDetailBinding
import java.util.Observer

class DetailFragment : Fragment(R.layout.fragment_detail) {
    private lateinit var binding: FragmentDetailBinding
    private lateinit var actBinding: ActionBarDetailBinding
    lateinit var navController: NavController
    private val viewModel: DetailViewModel by viewModel()
    var pos = 0
    val args: DetailFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)
        actBinding = ActionBarDetailBinding.bind(view)
        navController = Navigation.findNavController(view)
        pos = args.pos
        viewModel.getInfo(pos)
        when (pos) {
            1 -> {
                binding.lanDetail.setAnimation("programming.json")
            }
            2 -> {
                binding.lanDetail.setAnimation("kotlin_android.json")
            }
            3 -> {
                binding.lanDetail.setAnimation("programming.json")
            }
            4 -> {
                binding.lanDetail.setAnimation("php.json")
            }
            5 -> {
                binding.lanDetail.setAnimation("python.json")
            }
            6 ->{
                binding.lanDetail.setAnimation("programming.json")
            }
            7 ->{
                binding.lanDetail.setAnimation("python.json")
            }
            else -> {
                binding.lanDetail.setAnimation("php.json")
            }
        }
        viewModel.info.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            binding.tvInfo.text = it.desc
            actBinding.actionBarTitle.text = it.name
        })
        actBinding.apply {
            webView.text = "Learn"
            btnHome.setOnClickListener {
                navController.popBackStack()
            }
            webView.setOnClickListener{
                val action = DetailFragmentDirections.actionDetailFragmentToFragmentWebView(pos)
                navController.navigate(action)
            }
        }

    }
}
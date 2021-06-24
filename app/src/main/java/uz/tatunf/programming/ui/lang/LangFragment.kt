package uz.tatunf.programming.ui.lang

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import org.koin.android.viewmodel.ext.android.viewModel
import uz.tatunf.programming.R
import uz.tatunf.programming.core.BaseFragment
import uz.tatunf.programming.databinding.FragmentLangBinding

class LangFragment: BaseFragment(R.layout.fragment_lang) {
    private val adapter = LangAdapter()
    private val viewModel: LangViewModel by viewModel()
    private lateinit var binding: FragmentLangBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding = FragmentLangBinding.bind(view)
        binding.apply {
            recyclerView.adapter = adapter
            lavLang.setMinAndMaxFrame(0, 350)
            lavLang.playAnimation()
        }
        adapter.setOnItemClickListener {
            val action = LangFragmentDirections.actionLangFragmentToDetailFragment(it)
            navController.navigate(action)
        }

        viewModel.getThemes()
        viewModel.themeList.observe(
            viewLifecycleOwner, Observer {
                adapter.models = it
            }
        )
    }
}
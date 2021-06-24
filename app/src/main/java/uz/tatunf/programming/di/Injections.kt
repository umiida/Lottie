package uz.tatunf.programming.di

import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import uz.tatunf.programming.data.LangDatabase
import uz.tatunf.programming.ui.detail.DetailViewModel
import uz.tatunf.programming.ui.lang.LangViewModel

val dataModule = module{
    single{
        Room.databaseBuilder(androidContext(),
        LangDatabase::class.java,
        "pr_lang.db")
            .createFromAsset("pr_lang.db")
            .build()
    }
    single{get<LangDatabase>().langDao()}
}

val viewModelModule = module{
    viewModel { LangViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}

val adapterModule = module{

}
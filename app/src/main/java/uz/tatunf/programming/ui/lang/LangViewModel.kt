package uz.tatunf.programming.ui.lang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import uz.tatunf.programming.data.LangDao
import uz.tatunf.programming.data.model.Languages
import kotlin.coroutines.CoroutineContext

class LangViewModel(private val langDao: LangDao): ViewModel(), CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private val _languagesList: MutableLiveData<List<Languages>> = MutableLiveData()
    val themeList: LiveData<List<Languages>>
        get() = _languagesList

    fun getThemes(){
        launch{
            getThemesListAsync()
        }
    }
    private suspend fun getThemesListAsync(){
        withContext(Dispatchers.IO){
            _languagesList.postValue(langDao.getAllThemes())
        }
    }
}
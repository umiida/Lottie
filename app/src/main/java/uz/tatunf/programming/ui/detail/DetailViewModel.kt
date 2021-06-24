package uz.tatunf.programming.ui.detail

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

class DetailViewModel (private val langDao: LangDao): ViewModel(), CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private val _info: MutableLiveData<Languages> = MutableLiveData()
    val info: LiveData<Languages>
        get() = _info

    fun getInfo(pos: Int){
        launch{
            getInfoAsync(pos)
        }
    }
    private suspend fun getInfoAsync(pos: Int){
        withContext(Dispatchers.IO){
            _info.postValue(langDao.getInfo(pos))
        }
    }
}
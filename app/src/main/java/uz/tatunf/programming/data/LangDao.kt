package uz.tatunf.programming.data

import androidx.room.Dao
import androidx.room.Query
import uz.tatunf.programming.data.model.Languages

@Dao
interface LangDao {

    @Query("SELECT * FROM lang")
    fun getAllThemes(): List<Languages>

    @Query("SELECT * FROM lang WHERE id=:pos")
    fun getInfo(pos: Int): Languages
}
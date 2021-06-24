package uz.tatunf.programming.data

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.tatunf.programming.data.model.Languages

@Database(entities = [Languages::class], version = 1, exportSchema = false)
abstract class LangDatabase : RoomDatabase(){
    abstract fun langDao(): LangDao
}
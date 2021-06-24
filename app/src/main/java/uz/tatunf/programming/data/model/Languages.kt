package uz.tatunf.programming.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lang")
data class Languages(

    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: Int,
    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "desc")
    var desc: String
)
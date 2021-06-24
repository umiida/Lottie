package uz.tatunf.programming.data;

import java.lang.System;

@androidx.room.Database(entities = {uz.tatunf.programming.data.model.Languages.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Luz/tatunf/programming/data/LangDatabase;", "Landroidx/room/RoomDatabase;", "()V", "langDao", "Luz/tatunf/programming/data/LangDao;", "app_debug"})
public abstract class LangDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract uz.tatunf.programming.data.LangDao langDao();
    
    public LangDatabase() {
        super();
    }
}
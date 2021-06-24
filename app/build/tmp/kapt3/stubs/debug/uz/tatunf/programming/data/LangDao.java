package uz.tatunf.programming.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Luz/tatunf/programming/data/LangDao;", "", "getAllThemes", "", "Luz/tatunf/programming/data/model/Languages;", "getInfo", "pos", "", "app_debug"})
public abstract interface LangDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM lang")
    public abstract java.util.List<uz.tatunf.programming.data.model.Languages> getAllThemes();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM lang WHERE id=:pos")
    public abstract uz.tatunf.programming.data.model.Languages getInfo(int pos);
}
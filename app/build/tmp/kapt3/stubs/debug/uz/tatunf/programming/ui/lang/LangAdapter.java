package uz.tatunf.programming.ui.lang;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J)\u0010\u0013\u001a\u00020\u000b2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Luz/tatunf/programming/ui/lang/LangAdapter;", "Luz/tatunf/programming/core/BaseAdapter;", "Luz/tatunf/programming/data/model/Languages;", "Luz/tatunf/programming/ui/lang/LangAdapter$ThemesViewHolder;", "()V", "onItemClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pos", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "ThemesViewHolder", "app_debug"})
public final class LangAdapter extends uz.tatunf.programming.core.BaseAdapter<uz.tatunf.programming.data.model.Languages, uz.tatunf.programming.ui.lang.LangAdapter.ThemesViewHolder> {
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick;
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public uz.tatunf.programming.ui.lang.LangAdapter.ThemesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    uz.tatunf.programming.ui.lang.LangAdapter.ThemesViewHolder holder, int position) {
    }
    
    public LangAdapter() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luz/tatunf/programming/ui/lang/LangAdapter$ThemesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/tatunf/programming/databinding/ItemThemesBinding;", "(Luz/tatunf/programming/ui/lang/LangAdapter;Luz/tatunf/programming/databinding/ItemThemesBinding;)V", "populateModel", "", "model", "Luz/tatunf/programming/data/model/Languages;", "app_debug"})
    public final class ThemesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final uz.tatunf.programming.databinding.ItemThemesBinding binding = null;
        
        public final void populateModel(@org.jetbrains.annotations.NotNull()
        uz.tatunf.programming.data.model.Languages model) {
        }
        
        public ThemesViewHolder(@org.jetbrains.annotations.NotNull()
        uz.tatunf.programming.databinding.ItemThemesBinding binding) {
            super(null);
        }
    }
}
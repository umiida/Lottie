package uz.tatunf.programming.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Luz/tatunf/programming/core/BaseAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "itemResId", "", "(I)V", "value", "", "models", "getModels", "()Ljava/util/List;", "setModels", "(Ljava/util/List;)V", "getItemCount", "update", "", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends T> models;
    private final int itemResId = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getModels() {
        return null;
    }
    
    public final void setModels(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> value) {
    }
    
    public final void update() {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public BaseAdapter(int itemResId) {
        super();
    }
}
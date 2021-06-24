package uz.tatunf.programming.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Luz/tatunf/programming/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "langDao", "Luz/tatunf/programming/data/LangDao;", "(Luz/tatunf/programming/data/LangDao;)V", "_info", "Landroidx/lifecycle/MutableLiveData;", "Luz/tatunf/programming/data/model/Languages;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "info", "Landroidx/lifecycle/LiveData;", "getInfo", "()Landroidx/lifecycle/LiveData;", "", "pos", "", "getInfoAsync", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel implements kotlinx.coroutines.CoroutineScope {
    private final androidx.lifecycle.MutableLiveData<uz.tatunf.programming.data.model.Languages> _info = null;
    private final uz.tatunf.programming.data.LangDao langDao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<uz.tatunf.programming.data.model.Languages> getInfo() {
        return null;
    }
    
    public final void getInfo(int pos) {
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    uz.tatunf.programming.data.LangDao langDao) {
        super();
    }
}
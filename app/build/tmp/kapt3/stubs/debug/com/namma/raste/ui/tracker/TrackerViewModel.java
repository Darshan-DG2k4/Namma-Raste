package com.namma.raste.ui.tracker;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/namma/raste/ui/tracker/TrackerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_report", "Landroidx/lifecycle/MutableLiveData;", "Lcom/namma/raste/data/model/Report;", "report", "Landroidx/lifecycle/LiveData;", "getReport", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/namma/raste/data/repository/ReportRepository;", "searchTicket", "", "ticketId", "", "app_debug"})
public final class TrackerViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.namma.raste.data.repository.ReportRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.namma.raste.data.model.Report> _report = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.namma.raste.data.model.Report> report = null;
    
    public TrackerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.namma.raste.data.model.Report> getReport() {
        return null;
    }
    
    public final void searchTicket(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId) {
    }
}
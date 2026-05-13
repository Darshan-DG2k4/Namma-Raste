package com.namma.raste.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/namma/raste/ui/home/HomeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_activeFilter", "Landroidx/lifecycle/MutableLiveData;", "", "activeFilter", "Landroidx/lifecycle/LiveData;", "getActiveFilter", "()Landroidx/lifecycle/LiveData;", "allReports", "", "Lcom/namma/raste/data/model/Report;", "getAllReports", "repository", "Lcom/namma/raste/data/repository/ReportRepository;", "getFilteredReports", "reports", "filter", "markAsResolved", "", "ticketId", "setFilter", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.namma.raste.data.repository.ReportRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.namma.raste.data.model.Report>> allReports = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _activeFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> activeFilter = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.namma.raste.data.model.Report>> getAllReports() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getActiveFilter() {
        return null;
    }
    
    public final void setFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.namma.raste.data.model.Report> getFilteredReports(@org.jetbrains.annotations.NotNull()
    java.util.List<com.namma.raste.data.model.Report> reports, @org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
        return null;
    }
    
    public final void markAsResolved(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId) {
    }
}
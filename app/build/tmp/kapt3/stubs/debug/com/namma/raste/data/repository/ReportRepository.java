package com.namma.raste.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/namma/raste/data/repository/ReportRepository;", "", "dao", "Lcom/namma/raste/data/db/ReportDao;", "(Lcom/namma/raste/data/db/ReportDao;)V", "allReports", "Landroidx/lifecycle/LiveData;", "", "Lcom/namma/raste/data/model/Report;", "getAllReports", "()Landroidx/lifecycle/LiveData;", "getReportByTicketId", "ticketId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReportCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertReport", "", "report", "(Lcom/namma/raste/data/model/Report;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsResolved", "app_debug"})
public final class ReportRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.namma.raste.data.db.ReportDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.namma.raste.data.model.Report>> allReports = null;
    
    public ReportRepository(@org.jetbrains.annotations.NotNull()
    com.namma.raste.data.db.ReportDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.namma.raste.data.model.Report>> getAllReports() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertReport(@org.jetbrains.annotations.NotNull()
    com.namma.raste.data.model.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getReportByTicketId(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.namma.raste.data.model.Report> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getReportCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object markAsResolved(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}
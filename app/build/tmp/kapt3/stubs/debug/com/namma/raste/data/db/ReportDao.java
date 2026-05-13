package com.namma.raste.data.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/namma/raste/data/db/ReportDao;", "", "getAllReports", "Landroidx/lifecycle/LiveData;", "", "Lcom/namma/raste/data/model/Report;", "getReportByTicketId", "ticketId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReportCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertReport", "", "report", "(Lcom/namma/raste/data/model/Report;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsResolved", "app_debug"})
@androidx.room.Dao()
public abstract interface ReportDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertReport(@org.jetbrains.annotations.NotNull()
    com.namma.raste.data.model.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM reports ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.namma.raste.data.model.Report>> getAllReports();
    
    @androidx.room.Query(value = "SELECT * FROM reports WHERE ticketId = :ticketId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReportByTicketId(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.namma.raste.data.model.Report> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM reports")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReportCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "UPDATE reports SET status = \'RESOLVED\' WHERE ticketId = :ticketId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markAsResolved(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}
package com.namma.raste.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J4\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\b0\u0010J\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/namma/raste/utils/FirestoreHelper;", "", "()V", "COLLECTION", "", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "deleteReport", "", "ticketId", "saveReport", "report", "Lcom/namma/raste/data/model/Report;", "onSuccess", "Lkotlin/Function0;", "onFailure", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "updateStatus", "status", "app_debug"})
public final class FirestoreHelper {
    @org.jetbrains.annotations.NotNull()
    private static final com.google.firebase.firestore.FirebaseFirestore db = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COLLECTION = "reports";
    @org.jetbrains.annotations.NotNull()
    public static final com.namma.raste.utils.FirestoreHelper INSTANCE = null;
    
    private FirestoreHelper() {
        super();
    }
    
    public final void saveReport(@org.jetbrains.annotations.NotNull()
    com.namma.raste.data.model.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> onFailure) {
    }
    
    public final void deleteReport(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId) {
    }
    
    public final void updateStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
}
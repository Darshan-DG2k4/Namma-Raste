package com.namma.raste.ui.preview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\u001a\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0012H\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lcom/namma/raste/ui/preview/PreviewFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/namma/raste/databinding/FragmentPreviewBinding;", "args", "Lcom/namma/raste/ui/preview/PreviewFragmentArgs;", "getArgs", "()Lcom/namma/raste/ui/preview/PreviewFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/namma/raste/databinding/FragmentPreviewBinding;", "capturedLat", "", "capturedLng", "selectedSeverity", "", "selectedType", "viewModel", "Lcom/namma/raste/ui/preview/PreviewViewModel;", "getViewModel", "()Lcom/namma/raste/ui/preview/PreviewViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchLocation", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setIssueType", "type", "showSuccessDialog", "ticketId", "app_debug"})
public final class PreviewFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.namma.raste.databinding.FragmentPreviewBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedType = "POTHOLE";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedSeverity = "MEDIUM";
    private double capturedLat = 0.0;
    private double capturedLng = 0.0;
    
    public PreviewFragment() {
        super();
    }
    
    private final com.namma.raste.databinding.FragmentPreviewBinding getBinding() {
        return null;
    }
    
    private final com.namma.raste.ui.preview.PreviewViewModel getViewModel() {
        return null;
    }
    
    private final com.namma.raste.ui.preview.PreviewFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchLocation() {
    }
    
    private final void showSuccessDialog(java.lang.String ticketId) {
    }
    
    private final void setIssueType(java.lang.String type) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}
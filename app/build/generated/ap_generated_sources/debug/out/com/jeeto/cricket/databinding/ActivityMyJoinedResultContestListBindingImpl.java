package com.jeeto.cricket.databinding;
import com.jeeto.cricket.R;
import com.jeeto.cricket.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMyJoinedResultContestListBindingImpl extends ActivityMyJoinedResultContestListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"activity_mainheader", "layout_vs_back"},
            new int[] {1, 2},
            new int[] {com.jeeto.cricket.R.layout.activity_mainheader,
                com.jeeto.cricket.R.layout.layout_vs_back});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipeRefreshLayout, 3);
        sViewsWithIds.put(R.id.Rv_MyJoinedContestList, 4);
        sViewsWithIds.put(R.id.tv_NoDataAvailable, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMyJoinedResultContestListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMyJoinedResultContestListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.jeeto.cricket.databinding.ActivityMainheaderBinding) bindings[1]
            , (com.jeeto.cricket.databinding.LayoutVsBackBinding) bindings[2]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        setContainedBinding(this.head);
        setContainedBinding(this.inclVsBck);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        head.invalidateAll();
        inclVsBck.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (head.hasPendingBindings()) {
            return true;
        }
        if (inclVsBck.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        head.setLifecycleOwner(lifecycleOwner);
        inclVsBck.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInclVsBck((com.jeeto.cricket.databinding.LayoutVsBackBinding) object, fieldId);
            case 1 :
                return onChangeHead((com.jeeto.cricket.databinding.ActivityMainheaderBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclVsBck(com.jeeto.cricket.databinding.LayoutVsBackBinding InclVsBck, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHead(com.jeeto.cricket.databinding.ActivityMainheaderBinding Head, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(head);
        executeBindingsOn(inclVsBck);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): inclVsBck
        flag 1 (0x2L): head
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
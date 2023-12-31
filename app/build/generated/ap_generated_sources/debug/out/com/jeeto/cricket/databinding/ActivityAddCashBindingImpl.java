package com.jeeto.cricket.databinding;
import com.jeeto.cricket.R;
import com.jeeto.cricket.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddCashBindingImpl extends ActivityAddCashBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(0, 
            new String[] {"activity_mainheader"},
            new int[] {1},
            new int[] {com.jeeto.cricket.R.layout.activity_mainheader});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.RR_AddCash, 2);
        sViewsWithIds.put(R.id.tv_AmountToAdd, 3);
        sViewsWithIds.put(R.id.input_Cash, 4);
        sViewsWithIds.put(R.id.et_AddCashEnterAmount, 5);
        sViewsWithIds.put(R.id.LL_Amount, 6);
        sViewsWithIds.put(R.id.tv_OneHundred, 7);
        sViewsWithIds.put(R.id.tv_TwoHundred, 8);
        sViewsWithIds.put(R.id.tv_FiveHundred, 9);
        sViewsWithIds.put(R.id.tv_AddCash, 10);
        sViewsWithIds.put(R.id.LL_AddCashOffer, 11);
        sViewsWithIds.put(R.id.RV_AddCashOffer, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAddCashBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityAddCashBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.EditText) bindings[5]
            , (com.jeeto.cricket.databinding.ActivityMainheaderBinding) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            );
        setContainedBinding(this.head);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        head.invalidateAll();
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
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHead((com.jeeto.cricket.databinding.ActivityMainheaderBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHead(com.jeeto.cricket.databinding.ActivityMainheaderBinding Head, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): head
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
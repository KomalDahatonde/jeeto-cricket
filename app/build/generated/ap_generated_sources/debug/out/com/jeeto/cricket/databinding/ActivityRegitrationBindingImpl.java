package com.jeeto.cricket.databinding;
import com.jeeto.cricket.R;
import com.jeeto.cricket.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegitrationBindingImpl extends ActivityRegitrationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(0, 
            new String[] {"activity_mainheader"},
            new int[] {1},
            new int[] {com.jeeto.cricket.R.layout.activity_mainheader});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fb_login_button, 2);
        sViewsWithIds.put(R.id.btn_sign_in, 3);
        sViewsWithIds.put(R.id.tv_SignInText, 4);
        sViewsWithIds.put(R.id.input_RegRefCode, 5);
        sViewsWithIds.put(R.id.et_ReferralCode, 6);
        sViewsWithIds.put(R.id.input_RegEmail, 7);
        sViewsWithIds.put(R.id.et_Email, 8);
        sViewsWithIds.put(R.id.input_RegPassword, 9);
        sViewsWithIds.put(R.id.et_Password, 10);
        sViewsWithIds.put(R.id.tv_TearmsandConditions, 11);
        sViewsWithIds.put(R.id.tv_RegNext, 12);
        sViewsWithIds.put(R.id.LL_EnterCode, 13);
        sViewsWithIds.put(R.id.LL_FaceGoogle, 14);
        sViewsWithIds.put(R.id.RL_FBLogin, 15);
        sViewsWithIds.put(R.id.im_fbicon, 16);
        sViewsWithIds.put(R.id.RL_GmailLogin, 17);
        sViewsWithIds.put(R.id.im_goggleicon, 18);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegitrationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityRegitrationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.jeeto.cricket.databinding.ActivityMainheaderBinding) bindings[1]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.RelativeLayout) bindings[0]
            , (com.google.android.gms.common.SignInButton) bindings[3]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (com.facebook.login.widget.LoginButton) bindings[2]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            );
        setContainedBinding(this.Head);
        this.RLSignup.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        Head.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (Head.hasPendingBindings()) {
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
        Head.setLifecycleOwner(lifecycleOwner);
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
        executeBindingsOn(Head);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): Head
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
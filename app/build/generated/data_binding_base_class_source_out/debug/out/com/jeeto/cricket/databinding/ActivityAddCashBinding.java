// Generated by data binding compiler. Do not edit!
package com.jeeto.cricket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.jeeto.cricket.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAddCashBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout LLAddCashOffer;

  @NonNull
  public final LinearLayout LLAmount;

  @NonNull
  public final RelativeLayout RRAddCash;

  @NonNull
  public final RecyclerView RVAddCashOffer;

  @NonNull
  public final EditText etAddCashEnterAmount;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final TextInputLayout inputCash;

  @NonNull
  public final TextView tvAddCash;

  @NonNull
  public final TextView tvAmountToAdd;

  @NonNull
  public final TextView tvFiveHundred;

  @NonNull
  public final TextView tvOneHundred;

  @NonNull
  public final TextView tvTwoHundred;

  protected ActivityAddCashBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout LLAddCashOffer, LinearLayout LLAmount, RelativeLayout RRAddCash,
      RecyclerView RVAddCashOffer, EditText etAddCashEnterAmount, ActivityMainheaderBinding head,
      TextInputLayout inputCash, TextView tvAddCash, TextView tvAmountToAdd, TextView tvFiveHundred,
      TextView tvOneHundred, TextView tvTwoHundred) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LLAddCashOffer = LLAddCashOffer;
    this.LLAmount = LLAmount;
    this.RRAddCash = RRAddCash;
    this.RVAddCashOffer = RVAddCashOffer;
    this.etAddCashEnterAmount = etAddCashEnterAmount;
    this.head = head;
    this.inputCash = inputCash;
    this.tvAddCash = tvAddCash;
    this.tvAmountToAdd = tvAmountToAdd;
    this.tvFiveHundred = tvFiveHundred;
    this.tvOneHundred = tvOneHundred;
    this.tvTwoHundred = tvTwoHundred;
  }

  @NonNull
  public static ActivityAddCashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_add_cash, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddCashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAddCashBinding>inflateInternal(inflater, R.layout.activity_add_cash, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddCashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_add_cash, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddCashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAddCashBinding>inflateInternal(inflater, R.layout.activity_add_cash, null, false, component);
  }

  public static ActivityAddCashBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityAddCashBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAddCashBinding)bind(component, view, R.layout.activity_add_cash);
  }
}

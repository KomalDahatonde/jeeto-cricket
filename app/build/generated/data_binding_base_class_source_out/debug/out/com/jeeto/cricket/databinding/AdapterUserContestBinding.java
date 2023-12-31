// Generated by data binding compiler. Do not edit!
package com.jeeto.cricket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jeeto.cricket.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterUserContestBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout LLAdawinnersList;

  @NonNull
  public final LinearLayout LLItem;

  @NonNull
  public final TextView tvAdaWinnersCount;

  protected AdapterUserContestBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout LLAdawinnersList, LinearLayout LLItem, TextView tvAdaWinnersCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LLAdawinnersList = LLAdawinnersList;
    this.LLItem = LLItem;
    this.tvAdaWinnersCount = tvAdaWinnersCount;
  }

  @NonNull
  public static AdapterUserContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_user_contest, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterUserContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterUserContestBinding>inflateInternal(inflater, R.layout.adapter_user_contest, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterUserContestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_user_contest, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterUserContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterUserContestBinding>inflateInternal(inflater, R.layout.adapter_user_contest, null, false, component);
  }

  public static AdapterUserContestBinding bind(@NonNull View view) {
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
  public static AdapterUserContestBinding bind(@NonNull View view, @Nullable Object component) {
    return (AdapterUserContestBinding)bind(component, view, R.layout.adapter_user_contest);
  }
}

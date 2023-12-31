// Generated by data binding compiler. Do not edit!
package com.jeeto.cricket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.jeeto.cricket.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityGlobalRankBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView RVGlobalRankList;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final TextView tvNoDataAvailable;

  protected ActivityGlobalRankBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView RVGlobalRankList, ActivityMainheaderBinding head,
      SwipeRefreshLayout swipeRefreshLayout, TextView tvNoDataAvailable) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RVGlobalRankList = RVGlobalRankList;
    this.head = head;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.tvNoDataAvailable = tvNoDataAvailable;
  }

  @NonNull
  public static ActivityGlobalRankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_global_rank, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityGlobalRankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityGlobalRankBinding>inflateInternal(inflater, R.layout.activity_global_rank, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityGlobalRankBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_global_rank, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityGlobalRankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityGlobalRankBinding>inflateInternal(inflater, R.layout.activity_global_rank, null, false, component);
  }

  public static ActivityGlobalRankBinding bind(@NonNull View view) {
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
  public static ActivityGlobalRankBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityGlobalRankBinding)bind(component, view, R.layout.activity_global_rank);
  }
}

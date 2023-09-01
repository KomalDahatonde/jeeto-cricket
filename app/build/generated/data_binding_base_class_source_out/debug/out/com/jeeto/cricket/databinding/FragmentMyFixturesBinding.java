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

public abstract class FragmentMyFixturesBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView RvMyFixtures;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final TextView tvNoDataAvailable;

  protected FragmentMyFixturesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView RvMyFixtures, SwipeRefreshLayout swipeRefreshLayout,
      TextView tvNoDataAvailable) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RvMyFixtures = RvMyFixtures;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.tvNoDataAvailable = tvNoDataAvailable;
  }

  @NonNull
  public static FragmentMyFixturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_my_fixtures, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMyFixturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMyFixturesBinding>inflateInternal(inflater, R.layout.fragment_my_fixtures, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMyFixturesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_my_fixtures, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMyFixturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMyFixturesBinding>inflateInternal(inflater, R.layout.fragment_my_fixtures, null, false, component);
  }

  public static FragmentMyFixturesBinding bind(@NonNull View view) {
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
  public static FragmentMyFixturesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMyFixturesBinding)bind(component, view, R.layout.fragment_my_fixtures);
  }
}
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

public abstract class ActivityMyJoinedContestListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView RvMyJoinedContestList;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final LayoutVsBackBinding inclVsBck;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final TextView tvNoDataAvailable;

  protected ActivityMyJoinedContestListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView RvMyJoinedContestList, ActivityMainheaderBinding head,
      LayoutVsBackBinding inclVsBck, SwipeRefreshLayout swipeRefreshLayout,
      TextView tvNoDataAvailable) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RvMyJoinedContestList = RvMyJoinedContestList;
    this.head = head;
    this.inclVsBck = inclVsBck;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.tvNoDataAvailable = tvNoDataAvailable;
  }

  @NonNull
  public static ActivityMyJoinedContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_my_joined_contest_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMyJoinedContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMyJoinedContestListBinding>inflateInternal(inflater, R.layout.activity_my_joined_contest_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMyJoinedContestListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_my_joined_contest_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMyJoinedContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMyJoinedContestListBinding>inflateInternal(inflater, R.layout.activity_my_joined_contest_list, null, false, component);
  }

  public static ActivityMyJoinedContestListBinding bind(@NonNull View view) {
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
  public static ActivityMyJoinedContestListBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityMyJoinedContestListBinding)bind(component, view, R.layout.activity_my_joined_contest_list);
  }
}

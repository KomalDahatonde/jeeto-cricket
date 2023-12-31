// Generated by data binding compiler. Do not edit!
package com.jeeto.cricket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
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

public abstract class ActivityContestListBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout RLBottomMyTeam;

  @NonNull
  public final RelativeLayout RLCreateContest;

  @NonNull
  public final RecyclerView RvContestList;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final LayoutVsBackBinding inclVsBck;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final TextView tvCreateContest;

  @NonNull
  public final TextView tvEnterContestCode;

  @NonNull
  public final TextView tvMyTeam;

  @NonNull
  public final TextView tvNoDataAvailable;

  protected ActivityContestListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout RLBottomMyTeam, RelativeLayout RLCreateContest, RecyclerView RvContestList,
      ActivityMainheaderBinding head, LayoutVsBackBinding inclVsBck,
      SwipeRefreshLayout swipeRefreshLayout, TextView tvCreateContest, TextView tvEnterContestCode,
      TextView tvMyTeam, TextView tvNoDataAvailable) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RLBottomMyTeam = RLBottomMyTeam;
    this.RLCreateContest = RLCreateContest;
    this.RvContestList = RvContestList;
    this.head = head;
    this.inclVsBck = inclVsBck;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.tvCreateContest = tvCreateContest;
    this.tvEnterContestCode = tvEnterContestCode;
    this.tvMyTeam = tvMyTeam;
    this.tvNoDataAvailable = tvNoDataAvailable;
  }

  @NonNull
  public static ActivityContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_contest_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityContestListBinding>inflateInternal(inflater, R.layout.activity_contest_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityContestListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_contest_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityContestListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityContestListBinding>inflateInternal(inflater, R.layout.activity_contest_list, null, false, component);
  }

  public static ActivityContestListBinding bind(@NonNull View view) {
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
  public static ActivityContestListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityContestListBinding)bind(component, view, R.layout.activity_contest_list);
  }
}

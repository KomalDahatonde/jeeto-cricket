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

public abstract class ActivityInviteInContestBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout LLInviteFriendsCode;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final TextView tvInviteFriend;

  @NonNull
  public final TextView tvUniqueCode;

  protected ActivityInviteInContestBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LinearLayout LLInviteFriendsCode, ActivityMainheaderBinding head,
      TextView tvInviteFriend, TextView tvUniqueCode) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LLInviteFriendsCode = LLInviteFriendsCode;
    this.head = head;
    this.tvInviteFriend = tvInviteFriend;
    this.tvUniqueCode = tvUniqueCode;
  }

  @NonNull
  public static ActivityInviteInContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_invite_in_contest, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityInviteInContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityInviteInContestBinding>inflateInternal(inflater, R.layout.activity_invite_in_contest, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityInviteInContestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_invite_in_contest, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityInviteInContestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityInviteInContestBinding>inflateInternal(inflater, R.layout.activity_invite_in_contest, null, false, component);
  }

  public static ActivityInviteInContestBinding bind(@NonNull View view) {
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
  public static ActivityInviteInContestBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityInviteInContestBinding)bind(component, view, R.layout.activity_invite_in_contest);
  }
}

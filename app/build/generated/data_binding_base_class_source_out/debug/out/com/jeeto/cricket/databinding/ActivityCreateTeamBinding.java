// Generated by data binding compiler. Do not edit!
package com.jeeto.cricket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jeeto.cricket.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCreateTeamBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout LLCreditLeft;

  @NonNull
  public final LinearLayout LLPlayerListHead;

  @NonNull
  public final LinearLayout LLSelectRole;

  @NonNull
  public final LinearLayout LLTeamOnePlayer;

  @NonNull
  public final LinearLayout LLTeamTwoPlayer;

  @NonNull
  public final LinearLayout LLTotalPlayer;

  @NonNull
  public final RelativeLayout RLBottomfooter;

  @NonNull
  public final RelativeLayout RLCreateTeamFooter;

  @NonNull
  public final RecyclerView RvPlayerList;

  @NonNull
  public final View V1;

  @NonNull
  public final ActivityMainheaderBinding head;

  @NonNull
  public final CircleImageView imARIcon;

  @NonNull
  public final CircleImageView imBATIcon;

  @NonNull
  public final CircleImageView imBOWLIcon;

  @NonNull
  public final CircleImageView imWKIcon;

  @NonNull
  public final LayoutVsBackBinding inclVsBck;

  @NonNull
  public final TextView tvAR;

  @NonNull
  public final TextView tvARCount;

  @NonNull
  public final TextView tvBAT;

  @NonNull
  public final TextView tvBATCount;

  @NonNull
  public final TextView tvBOWL;

  @NonNull
  public final TextView tvBOWLCount;

  @NonNull
  public final TextView tvTeamNext;

  @NonNull
  public final TextView tvTeamOneName;

  @NonNull
  public final TextView tvTeamOneSize;

  @NonNull
  public final TextView tvTeamPreview;

  @NonNull
  public final TextView tvTeamTwoName;

  @NonNull
  public final TextView tvTeamTwoSize;

  @NonNull
  public final TextView tvTotalCredit;

  @NonNull
  public final TextView tvTotalSelectedPlayer;

  @NonNull
  public final TextView tvWK;

  @NonNull
  public final TextView tvWKCount;

  protected ActivityCreateTeamBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout LLCreditLeft, LinearLayout LLPlayerListHead, LinearLayout LLSelectRole,
      LinearLayout LLTeamOnePlayer, LinearLayout LLTeamTwoPlayer, LinearLayout LLTotalPlayer,
      RelativeLayout RLBottomfooter, RelativeLayout RLCreateTeamFooter, RecyclerView RvPlayerList,
      View V1, ActivityMainheaderBinding head, CircleImageView imARIcon, CircleImageView imBATIcon,
      CircleImageView imBOWLIcon, CircleImageView imWKIcon, LayoutVsBackBinding inclVsBck,
      TextView tvAR, TextView tvARCount, TextView tvBAT, TextView tvBATCount, TextView tvBOWL,
      TextView tvBOWLCount, TextView tvTeamNext, TextView tvTeamOneName, TextView tvTeamOneSize,
      TextView tvTeamPreview, TextView tvTeamTwoName, TextView tvTeamTwoSize,
      TextView tvTotalCredit, TextView tvTotalSelectedPlayer, TextView tvWK, TextView tvWKCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LLCreditLeft = LLCreditLeft;
    this.LLPlayerListHead = LLPlayerListHead;
    this.LLSelectRole = LLSelectRole;
    this.LLTeamOnePlayer = LLTeamOnePlayer;
    this.LLTeamTwoPlayer = LLTeamTwoPlayer;
    this.LLTotalPlayer = LLTotalPlayer;
    this.RLBottomfooter = RLBottomfooter;
    this.RLCreateTeamFooter = RLCreateTeamFooter;
    this.RvPlayerList = RvPlayerList;
    this.V1 = V1;
    this.head = head;
    this.imARIcon = imARIcon;
    this.imBATIcon = imBATIcon;
    this.imBOWLIcon = imBOWLIcon;
    this.imWKIcon = imWKIcon;
    this.inclVsBck = inclVsBck;
    this.tvAR = tvAR;
    this.tvARCount = tvARCount;
    this.tvBAT = tvBAT;
    this.tvBATCount = tvBATCount;
    this.tvBOWL = tvBOWL;
    this.tvBOWLCount = tvBOWLCount;
    this.tvTeamNext = tvTeamNext;
    this.tvTeamOneName = tvTeamOneName;
    this.tvTeamOneSize = tvTeamOneSize;
    this.tvTeamPreview = tvTeamPreview;
    this.tvTeamTwoName = tvTeamTwoName;
    this.tvTeamTwoSize = tvTeamTwoSize;
    this.tvTotalCredit = tvTotalCredit;
    this.tvTotalSelectedPlayer = tvTotalSelectedPlayer;
    this.tvWK = tvWK;
    this.tvWKCount = tvWKCount;
  }

  @NonNull
  public static ActivityCreateTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_create_team, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCreateTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCreateTeamBinding>inflateInternal(inflater, R.layout.activity_create_team, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCreateTeamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_create_team, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCreateTeamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCreateTeamBinding>inflateInternal(inflater, R.layout.activity_create_team, null, false, component);
  }

  public static ActivityCreateTeamBinding bind(@NonNull View view) {
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
  public static ActivityCreateTeamBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCreateTeamBinding)bind(component, view, R.layout.activity_create_team);
  }
}

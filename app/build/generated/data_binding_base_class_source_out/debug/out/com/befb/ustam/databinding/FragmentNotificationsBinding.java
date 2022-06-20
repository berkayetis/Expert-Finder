// Generated by view binder compiler. Do not edit!
package com.befb.ustam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.befb.ustam.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNotificationsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AutoCompleteTextView autoCompleteTxt1;

  @NonNull
  public final Button button3;

  @NonNull
  public final RecyclerView recyclerSelectedResults;

  @NonNull
  public final Spinner spinner2;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView5;

  private FragmentNotificationsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AutoCompleteTextView autoCompleteTxt1, @NonNull Button button3,
      @NonNull RecyclerView recyclerSelectedResults, @NonNull Spinner spinner2,
      @NonNull TextInputLayout textInputLayout3, @NonNull TextView textView3,
      @NonNull TextView textView5) {
    this.rootView = rootView;
    this.autoCompleteTxt1 = autoCompleteTxt1;
    this.button3 = button3;
    this.recyclerSelectedResults = recyclerSelectedResults;
    this.spinner2 = spinner2;
    this.textInputLayout3 = textInputLayout3;
    this.textView3 = textView3;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_notifications, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNotificationsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.autoComplete_txt1;
      AutoCompleteTextView autoCompleteTxt1 = ViewBindings.findChildViewById(rootView, id);
      if (autoCompleteTxt1 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.recyclerSelectedResults;
      RecyclerView recyclerSelectedResults = ViewBindings.findChildViewById(rootView, id);
      if (recyclerSelectedResults == null) {
        break missingId;
      }

      id = R.id.spinner2;
      Spinner spinner2 = ViewBindings.findChildViewById(rootView, id);
      if (spinner2 == null) {
        break missingId;
      }

      id = R.id.textInputLayout3;
      TextInputLayout textInputLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout3 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new FragmentNotificationsBinding((ConstraintLayout) rootView, autoCompleteTxt1,
          button3, recyclerSelectedResults, spinner2, textInputLayout3, textView3, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
// Generated by view binder compiler. Do not edit!
package com.example.intent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.intent.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText email;

  @NonNull
  public final Button login;

  @NonNull
  public final Button openWebsite;

  @NonNull
  public final EditText password;

  @NonNull
  public final Button thirdScreen;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull EditText email,
      @NonNull Button login, @NonNull Button openWebsite, @NonNull EditText password,
      @NonNull Button thirdScreen) {
    this.rootView = rootView;
    this.email = email;
    this.login = login;
    this.openWebsite = openWebsite;
    this.password = password;
    this.thirdScreen = thirdScreen;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.openWebsite;
      Button openWebsite = ViewBindings.findChildViewById(rootView, id);
      if (openWebsite == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.thirdScreen;
      Button thirdScreen = ViewBindings.findChildViewById(rootView, id);
      if (thirdScreen == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, email, login, openWebsite,
          password, thirdScreen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

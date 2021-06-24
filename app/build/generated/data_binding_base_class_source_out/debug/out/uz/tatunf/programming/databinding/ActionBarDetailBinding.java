// Generated by view binder compiler. Do not edit!
package uz.tatunf.programming.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.tatunf.programming.R;

public final class ActionBarDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView actionBarTitle;

  @NonNull
  public final ImageView btnHome;

  @NonNull
  public final TextView webView;

  private ActionBarDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView actionBarTitle, @NonNull ImageView btnHome, @NonNull TextView webView) {
    this.rootView = rootView;
    this.actionBarTitle = actionBarTitle;
    this.btnHome = btnHome;
    this.webView = webView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActionBarDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActionBarDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.action_bar_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActionBarDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionBarTitle;
      TextView actionBarTitle = rootView.findViewById(id);
      if (actionBarTitle == null) {
        break missingId;
      }

      id = R.id.btnHome;
      ImageView btnHome = rootView.findViewById(id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.webView;
      TextView webView = rootView.findViewById(id);
      if (webView == null) {
        break missingId;
      }

      return new ActionBarDetailBinding((ConstraintLayout) rootView, actionBarTitle, btnHome,
          webView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

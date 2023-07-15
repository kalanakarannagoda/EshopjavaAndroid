// Generated by view binder compiler. Do not edit!
package com.jiat.eshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiat.eshop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProductItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView productItemImage;

  @NonNull
  public final TextView productItemName;

  @NonNull
  public final TextView productItemPrice;

  private ProductItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView productItemImage,
      @NonNull TextView productItemName, @NonNull TextView productItemPrice) {
    this.rootView = rootView;
    this.productItemImage = productItemImage;
    this.productItemName = productItemName;
    this.productItemPrice = productItemPrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProductItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProductItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.product_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProductItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.product_item_image;
      ImageView productItemImage = ViewBindings.findChildViewById(rootView, id);
      if (productItemImage == null) {
        break missingId;
      }

      id = R.id.product_item_name;
      TextView productItemName = ViewBindings.findChildViewById(rootView, id);
      if (productItemName == null) {
        break missingId;
      }

      id = R.id.product_item_price;
      TextView productItemPrice = ViewBindings.findChildViewById(rootView, id);
      if (productItemPrice == null) {
        break missingId;
      }

      return new ProductItemBinding((LinearLayout) rootView, productItemImage, productItemName,
          productItemPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

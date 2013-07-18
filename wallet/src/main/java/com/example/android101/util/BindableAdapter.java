package com.example.android101.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/** An implementation of {@link BaseAdapter} which uses the new/bind pattern for its views. */
public abstract class BindableAdapter<T> extends BaseAdapter {
  private final Context context;
  private final LayoutInflater inflater;

  protected BindableAdapter(Context context) {
    this.context = context;
    this.inflater = LayoutInflater.from(context);
  }

  protected Context getContext() {
    return context;
  }

  @Override public final View getView(int position, View view, ViewGroup container) {
    if (view == null) {
      view = newView(inflater, position, container);
      if (view == null) {
        throw new IllegalStateException("View must not be null.");
      }
    }
    bindView(view, position, getItem(position));
    return view;
  }

  @Override public abstract T getItem(int position);

  /** Create a new instance of a view for the specified {@code position}. */
  public abstract View newView(LayoutInflater inflater, int position, ViewGroup container);

  /** Bind the data for the specified {@code position} to the {@code view}. */
  public abstract void bindView(View view, int position, T item);
}

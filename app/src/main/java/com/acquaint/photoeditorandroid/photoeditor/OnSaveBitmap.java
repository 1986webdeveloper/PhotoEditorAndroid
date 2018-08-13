package com.acquaint.photoeditorandroid.photoeditor;

import android.graphics.Bitmap;


@SuppressWarnings("ALL")
public interface OnSaveBitmap {
    void onBitmapReady(Bitmap saveBitmap);

    void onFailure(Exception e);
}

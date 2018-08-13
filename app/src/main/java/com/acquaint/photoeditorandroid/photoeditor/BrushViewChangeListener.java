package com.acquaint.photoeditorandroid.photoeditor;





@SuppressWarnings("ALL")
interface BrushViewChangeListener {
    void onViewAdd(BrushDrawingView brushDrawingView);

    void onViewRemoved(BrushDrawingView brushDrawingView);

    void onStartDrawing();

    void onStopDrawing();
}

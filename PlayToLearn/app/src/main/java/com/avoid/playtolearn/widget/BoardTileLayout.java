package com.avoid.playtolearn.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

import com.avoid.playtolearn.R;
import com.avoid.playtolearn.common.Global;
import com.avoid.playtolearn.common.Session;
import com.avoid.playtolearn.listener.BoardDragListener;

public class BoardTileLayout extends FrameLayout {
    private int row;
    private int column;

    public BoardTileLayout(Context context) {
        super(context);
        this.setOnDragListener(new BoardDragListener());
        applyCustomDesign(context);
    }

    public BoardTileLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnDragListener(new BoardDragListener());
        applyCustomDesign(context);
    }

    public BoardTileLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOnDragListener(new BoardDragListener());
        applyCustomDesign(context);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void applyCustomDesign(Context context) {
        setBackgroundResource(R.drawable.board_tile_background);

        int effectiveWidth = (int) (Session.SCREEN_WIDTH * 0.95);

//        int size_px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50,
//                context.getResources().getDisplayMetrics());
        int size_px = (int) (effectiveWidth / (Global.COLUMN_COUNT + 0.5));

        //        int margin_px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 3,
//                context.getResources().getDisplayMetrics());
        int margin_px = (effectiveWidth - (size_px * Global.COLUMN_COUNT)) / (Global.COLUMN_COUNT * 2);

        LayoutParams params = new LayoutParams(size_px, size_px);
        params.setMargins(margin_px, margin_px, margin_px, margin_px);
        this.setLayoutParams(params);
    }
}
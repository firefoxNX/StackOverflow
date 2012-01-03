package com.stackoverflow;

import android.content.Context;
import com.google.android.maps.MapView;

/**
 * Created by IntelliJ IDEA.
 * User: vineetb
 * Date: 1/2/12
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomMapView extends MapView {
    public CustomMapView(Context context, String s) {
        super(context, s);
    }

    protected final void onDrawCustom(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

}

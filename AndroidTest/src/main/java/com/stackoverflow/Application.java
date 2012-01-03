package com.stackoverflow;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

import java.lang.reflect.Field;


public class Application extends MapActivity {

    private static final int latitudeE6 = 37985339;
    private static final int longitudeE6 = 23716735;


	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MapView mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        Class c = mapView.getClass();
        Field logoField = null;
        try{
            Field[] fields = c.getFields();
            logoField = c.getField("googleLogo");
            logoField.setAccessible(true);
            BitmapDrawable logoBitmap = new BitmapDrawable();
            logoField.set(mapView, logoBitmap);
//            logoField.get(logoBitmap) ;
        } catch (NoSuchFieldException nsfe){

        }  catch (IllegalAccessException iae){

        }

        GeoPoint point = new GeoPoint(latitudeE6, longitudeE6);
        MapController mapController = mapView.getController();
        mapController.animateTo(point);
        mapController.setZoom(6);
    }

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
 
}

package com.testrn;

import android.Manifest;
import android.graphics.Color;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.DrawStatusChangedEvent;
import com.esri.arcgisruntime.mapping.view.DrawStatusChangedListener;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import java.util.Map;

public class RNMapView extends SimpleViewManager<MapView> {
    private String TAG = "RNAGis";
    private MapView mMapView = null;
    private ArcGISMap mMap = null;
    private String mMapId = null;

    @NonNull
    @Override
    public String getName() {
        return "MapView";
    }

    @NonNull
    @Override
    protected MapView createViewInstance(@NonNull ThemedReactContext reactContext) {
        Log.i("RNAGIS", String.format("RNMapView.createViewInstance"));
        mMapView = new MapView(reactContext.getBaseContext());
        ArcGISMap mMap = new ArcGISMap(Basemap.Type.TOPOGRAPHIC, 34.056295, -117.195800, 16);
        mMapView.setMap(mMap);
        return mMapView;
    }

}

package com.testrn;
import android.Manifest;
import android.util.Log;

import androidx.annotation.NonNull;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNMapView extends SimpleViewManager<MapView> {
    private MapView mMapView = null;
    private ArcGISMap mMap = null;
    private String mMapId = null;
    private static String[] permissions = new String[]{
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
    };

    @NonNull
    @Override
    public String getName() {
        return "MapView";
    }

//    @ReactProp(name = "mapId")
//    public void setMapId(MapView mapView, String mapId) {
//    }

    @NonNull
    @Override
    protected MapView createViewInstance(@NonNull ThemedReactContext reactContext) {
        Log.i("RNAGIS", String.format("RNMapView.createViewInstance"));
        mMapView = new MapView(reactContext);
        mMap = new ArcGISMap(Basemap.Type.TOPOGRAPHIC, 34.056295, -117.195800, 16);
        mMapView.setMap(mMap);
//        Button button = new Button(reactContext);
//        button.setText("测试按钮");
        return mMapView;
    }

    @Override
    public void onDropViewInstance(@NonNull MapView view) {
        Log.i("RNAGIS", "RNMapView.onDropViewInstance");
        super.onDropViewInstance(view);
    }

}

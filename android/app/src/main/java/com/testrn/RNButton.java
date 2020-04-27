package com.testrn;
import android.Manifest;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNButton extends SimpleViewManager<Button> {
    private String mMapId = null;
    private static String[] permissions = new String[]{
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
    };

    @NonNull
    @Override
    public String getName() {
        return "RNButton";
    }

//    @ReactProp(name = "mapId")
//    public void setMapId(MapView mapView, String mapId) {
//    }

    @NonNull
    @Override
    protected Button createViewInstance(@NonNull ThemedReactContext reactContext) {
        Log.i("RNAGIS", String.format("RNMapView.createViewInstance"));
        Button button = new Button(reactContext);
        button.setText("测试按钮");
        return button;
    }

    @Override
    public void onDropViewInstance(@NonNull Button view) {
        Log.i("RNAGIS", "RNMapView.onDropViewInstance");
        super.onDropViewInstance(view);
    }

}

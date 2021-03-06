package com.example.patry.testgooglemapsandroid;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in krakow
        //LatLng krakow = new LatLng(50.064624, 19.945312);
        //Marker krakowListner = mMap.addMarker(new MarkerOptions().position(krakow).title("Stan jakosci powietrza - Krakow"));
        MarkerLocation.createLocation(googleMap);
        LatLngBounds POLAND = new LatLngBounds(new LatLng(49, 14.27) , new LatLng(54, 24.08));
        //move camera to POLAND
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(POLAND.getCenter(),5.70F));
        mMap.setMinZoomPreference(5.70f);
        mMap.setMaxZoomPreference(10.0f);
    }

}

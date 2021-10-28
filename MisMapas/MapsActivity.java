package com.publicicat.mismapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.publicicat.mismapas.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    String var, markerTitle;
    double lat, lng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        Bundle i = getIntent().getExtras();
        if ( i != null) {
            var = i.getString("key");
            switch (var) {
                case "Michigan":
                    lat = 42.798222;
                    lng = -84.540371;
                    markerTitle = "Michigan";
                    break;
                case "Castle":
                    lat = 41.555106;
                    lng = 1.669704;
                    markerTitle = "Pobla's Castle";
                    break;
                case "Boat":
                    lat = 39.553703;
                    lng = 2.630145;
                    markerTitle = "Palma de Mallorca";
                    break;
                case "Iceland":
                    lat = 64.111412;
                    lng = -21.894773;
                    markerTitle = "Iceland";
                    break;
            }

        }

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

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        LatLng dot = new LatLng(lat,lng);
        mMap.addMarker(new MarkerOptions().position(dot).title(markerTitle));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dot));
    }

}
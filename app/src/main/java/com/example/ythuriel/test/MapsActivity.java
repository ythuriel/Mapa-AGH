package com.example.ythuriel.test;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener{

    private GoogleMap mMap;
    private Marker B2m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //to jest wszystko domyslnie tego nie tykac
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

        mMap.getUiSettings().setMapToolbarEnabled(false); //wylaczenie odnosnikow do aplikacji map google
        mMap.getUiSettings().setZoomControlsEnabled(true);  //wlaczenie przyciskow do zmieniania przyblizenia
        mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this,R.raw.pois_style));  //ten plik "pois_style" to plik stylu mowiacy zeby nie wyswietlac miejsc zainteresowania (sami wiemy lepiej co nas interesuje niz google)

        // Add a marker in Sydney and move the camera
        LatLng AGH = new LatLng(50.067, 19.914);    //prawie to co domyslnie tylko ze na agh przenosimy nie sydney
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(AGH,(float)16));  //a tu przesuwa kamere i przybliza troche


        B2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.066261,19.918879)).title("B2"));//tu trza dodac markery do wszystkich budynkow ktore nas obchodza

        Polygon AGH_T = googleMap.addPolygon(new PolygonOptions().clickable(true).add(new LatLng(50.063904, 19.923582),new LatLng(50.067424, 19.903177),new LatLng(50.070055, 19.903992),new LatLng(50.068896, 19.911477),new LatLng(50.067650, 19.914509),new LatLng(50.067591, 19.918087),new LatLng(50.065897, 19.924365)));
        AGH_T.setTag("Teren AGH");


        mMap.setOnMarkerClickListener(this);    //to bedzie do obslugi klikniecia w ktorys z naszych markerow
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        {
            //tu bedzie wyswietlanie mapy budynku
            if (marker.equals(B2m)){
                System.out.println("klikniecie");
                startActivity(new Intent(getApplicationContext(),Floor_View.class));
            }
        }
        return false;
    }

}

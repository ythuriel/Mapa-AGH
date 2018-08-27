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
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener,GoogleMap.OnInfoWindowClickListener{

    private GoogleMap mMap;
    private Marker B2m,D17m,A0m,A1m,A2m,A3m,A4m,B1m,B3m,B4m,B5m,B6m,B7m,B8m,C1m,C2m,C3m,C4m,C5m,C6m,D1m,U2m,U1m,D4m,D5m,D6m,D7m,D8m,D9m,D10m;
    private Marker D11m,D12m,D14m,D13m,D15m,D16m,D18m,HA1m,HA2m,HB1B2m,HB3B4m,HB6m,HD8m,PA0A1m,PA1A2m,PA1C1m,PA3A4m,PA4C4m,PB1B2m,PB2B3m;
    private Marker PB3B4m,S1m,S2m,U3m,U5m,U6m,U7m,U8m,U9m,U10m,U11m,U12m,Z1m,Z2m,Z11m,Z13m,Z14m,Z15m,Z16m,Z17m,Z18m,DSAm,DS1m,DS2m,DS3m;
    private Marker DS3m,DS4m,DS5m,DS6m,DS7m,DS8m,DS9m,DS10m,DS11m,DS12m,DS13m,DS14m,DS15m,DS16m,DS17m,DS18m,DS19m,P1m;
        
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


        B2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.066261,19.918879)).title("B2").snippet("WIMiR"));//tu trza dodac markery do wszystkich budynkow ktore nas obchodza
        D17m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.068049, 19.912669)).title("D17").snippet("WIEiT"));
        //A
        A0m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("A0").snippet("Gmach Glowny A-0"));
        A1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065120, 19.922520)).title("A1").snippet("Pawilon A1"));
        A2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065249, 19.921876)).title("A2").snippet("Pawilon A2"));
        A3m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065317, 19.920921)).title("A3").snippet("Pawilon A3"));
        A4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065522, 19.920034)).title("A4").snippet("Pawilon A4"));
        //B
        B1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065828, 19.919374)).title("B1").snippet("Pawilon B1"));
        B3m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.066116, 19.918173)).title("B3").snippet("Pawilon B3"));
        B4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.066256, 19.917578)).title("B4").snippet("Pawilon B4"));
        B5m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.067122, 19.917115)).title("B5").snippet("Pawilon B5"));
        B6m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.066280, 19.916502)).title("B6").snippet("Pawilon B6"));
        B7m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.067209, 19.916496)).title("B7").snippet("Pawilon B7"));
        B8m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065900, 19.916818)).title("B8").snippet("Pawilon B8"));
        //C
        C1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065281, 19.922860)).title("C1").snippet("Pawilon C1"));
        C2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065943, 19.922688)).title("C2").snippet("Pawilon C2"));
        C3m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.066174, 19.921906)).title("C3").snippet("Pawilon C3"));
        C4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.065679, 19.920129)).title("C4").snippet("Pawilon C4"));
        C5m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.066573, 19.921131)).title("C5").snippet("Pawilon C5"));
        C6m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.066357, 19.920530)).title("C6").snippet("Pawilon C6"));
        //D
        D1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064835, 19.919494)).title("D1").snippet("Pawilon Wibroakustyki"));
        //progress
        D4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D4").snippet("Gmach Glowny A-0"));
        D5m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D5").snippet("Pawilon Telekomunikacji"));
        D6m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D6").snippet("Pawilon Telekomunikacji"));
        D7m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D7").snippet("Zębiec Geologii"));
        D8m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D8").snippet("Pawilon Odlewnictwa"));
        D9m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D9").snippet("Zębiec Kawiory 40"));
        D10m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D10").snippet("Pawilon Fizyki"));
        D11m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D11").snippet("Pawilon Kawiory 26"));
        D12m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D12").snippet("Dobudówka do Pawilonu Kawiory 40"));
        D13m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D13").snippet("Lipsk"));
        D14m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D14").snippet("Pawilon Zarządzania"));
        D15m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D15").snippet("Cyfronet"));
        D16m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D16").snippet("ACMiN"));
        D18m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("D18").snippet("Hala maszyn Cyfronetu"));
        //U
        U1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U1").snippet("Biblioteka Glowna"));
        U2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U2").snippet("Centrum Dydaktyki"));
        //Hale
        HA1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("HA1").snippet("Hala A1"));
        HA2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("HA2").snippet("Hala A2"));
        HB1B2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("HB1B2").snippet("Hala B1/B2"));
        HB3B4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("HB3B4").snippet("Hala B3/B4"));
        HB6m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("HB6").snippet("Hala B6"));
        HD8m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("HD8").snippet("Hala Odlewnictwa"));
        //przewiązki
        PA0A1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("PA0A1").snippet("Przewiązka"));
        PA1A2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("PA1A2").snippet("Przewiązka"));
        PA1C1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("PA1C1").snippet("Przewiązka"));
        PA3A4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("PA3A4").snippet("Przewiązka"));
        PA4C4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("PA4C4").snippet("Przewiązka"));
        //łączniki
        PB1B2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("PB1B2").snippet("Łącznik"));
        PB2B3m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("PB2B3").snippet("Łącznik"));
        PB3B4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("PB3B4").snippet("Łącznik"));
        //Budynki inne
        S1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("S1").snippet("Mensa Stuencka"));
        S2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("S2").snippet("Budynek 'Krakusa'"));
        U3m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U3").snippet("Przychodnia Akademicka"));
        U5m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U5").snippet("Laboratorium WFiIS"));
        U6m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U6").snippet("Barak Reymonta 21a"));
        U7m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U7").snippet("Klub Studio"));
        U8m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U8").snippet("Sklep"));
        U9m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U9").snippet("Administracja MS"));
        U10m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U10").snippet("Przychodnia Scanmed"));
        U11m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U11").snippet("Basen"));
        U12m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("U12").snippet("Hala Piastowska"));
        Z1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("Z1").snippet("Garaże A3/A4"));
        Z2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("Z2").snippet("Czarnowiejska 50b"));
        Z11m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("Z11").snippet("Magazyn chemiczny, laboratorium"));
        Z13m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("Z13").snippet("Studio Muzyczne Kotłownia"));
        Z14m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("Z14").snippet("Magazyn MS"));
        Z15m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("Z15").snippet("Barak MS"));
        Z16m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("Z16").snippet("Garaże na Gramatyka"));
        Z18m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("Z18").snippet("Stacja trafo przy Cyfronecie"));
        //DS
        DSAm = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Alfa").snippet("Alfa"));
        DS1m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Olimp").snippet("Alfa"));
        DS2m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Babilon").snippet("Alfa"));
        DS3m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Akropol").snippet("Alfa"));
        DS4m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Filutek").snippet("Alfa"));
        DS5m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Strumyk").snippet("Alfa"));
        DS6m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Bratek").snippet("Alfa"));
        DS7m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Zaścianek").snippet("Alfa"));
        DS8m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Stokrotka").snippet("Alfa"));
        DS9m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Omega").snippet("Alfa"));
        DS10m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Hajduczek").snippet("Alfa"));
        DS11m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Bonus").snippet("Alfa"));
        DS12m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Promyk").snippet("Alfa"));
        DS13m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Straszny Dwór").snippet("Alfa"));
        DS14m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Kapitol").snippet("Alfa"));
        DS15m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Maraton").snippet("Alfa"));
        DS16m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Itaka").snippet("Alfa"));
        DS17m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS Arkadia").snippet("Alfa"));
        DS18m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS-18").snippet("DS-18"));
        DS19m = mMap.addMarker(new MarkerOptions().position(new LatLng(50.064530, 19.923460)).title("DS-19").snippet("DS-19"));
        
                           
                
        
        Polygon AGH_T = googleMap.addPolygon(new PolygonOptions().clickable(true).add(new LatLng(50.063904, 19.923582),new LatLng(50.067424, 19.903177),new LatLng(50.070055, 19.903992),new LatLng(50.068896, 19.911477),new LatLng(50.067650, 19.914509),new LatLng(50.067591, 19.918087),new LatLng(50.065897, 19.924365)));
        AGH_T.setTag("Teren AGH");


        mMap.setOnMarkerClickListener(this);    //to bedzie do obslugi klikniecia w ktorys z naszych markerow
        mMap.setOnInfoWindowClickListener(this);    //i obsluga klikniecia w dymek nad nim
    }

    @Override
    public boolean onMarkerClick(Marker marker) {   //to tylko po to zeby obsluzyc klikniecia ale return false sprawia ze uzywane sa domyslne funkcje
        return false;
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        //if (marker.equals(B2m)) {
            Intent i = new Intent(getApplicationContext(),Floor_View.class);
            i.putExtra("budynek",marker.getTitle());    //przekazywanie do przegladarki planow jaki budynek ma byc przegladany
            startActivity(i);
    }
}

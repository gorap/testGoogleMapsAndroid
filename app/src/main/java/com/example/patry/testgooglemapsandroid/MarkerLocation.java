package com.example.patry.testgooglemapsandroid;

import java.util.HashMap;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
/**
 * Created by patry on 18.11.2017.
 */
//TODO utworzenie klasy ktora w konstruktorze bedzie towrzyc wszystkie markery i pozycje, ma ona udostepnia Mape z pozycja i odpowiedajacym im markerem


public class MarkerLocation {
    public HashMap<LatLng, Marker> Location;

    public static HashMap createLocation(GoogleMap mMap){
        HashMap<LatLng, Marker> Location = new HashMap<LatLng, Marker>();

        //Krakow
        LatLng krakow = new LatLng(50.064624, 19.945312);
        Marker krakowListner = mMap.addMarker(new MarkerOptions().position(krakow).title("Stan jakosci powietrza - Krakow"));
        Location.put(krakow,krakowListner);

        //Rzeszow
        LatLng rzeszow = new LatLng(50.04132, 21.99901);
        Marker rzeszowListner = mMap.addMarker(new MarkerOptions().position(rzeszow).title("Stan jakosci powietrza - Rzeszow"));
        Location.put(rzeszow,rzeszowListner);

        //Katowice
        LatLng katowice = new LatLng(50.25841, 19.02754);
        Marker katowiceListner = mMap.addMarker(new MarkerOptions().position(katowice).title("Stan jakosci powietrza - Katowice"));
        Location.put(katowice,katowiceListner);

        //Wroclaw
        LatLng wroclaw = new LatLng(51.1, 17.03333);
        Marker wroclawListner = mMap.addMarker(new MarkerOptions().position(wroclaw).title("Stan jakosci powietrza - Wroclaw"));
        Location.put(wroclaw,wroclawListner);

        //Poznan
        LatLng poznan = new LatLng(52.40692, 16.92993);
        Marker poznanListner = mMap.addMarker(new MarkerOptions().position(poznan).title("Stan jakosci powietrza - Poznan"));
        Location.put(poznan,poznanListner);

        //Szczecin
        LatLng szczecin = new LatLng(53.42894, 14.55302);
        Marker szczecinListner = mMap.addMarker(new MarkerOptions().position(szczecin).title("Stan jakosci powietrza - Szczecin"));
        Location.put(szczecin,szczecinListner);

        //Bydgoszcz
        LatLng bydgoszcz = new LatLng( 53.1235, 18.00762);
        Marker bydgoszczListner = mMap.addMarker(new MarkerOptions().position(bydgoszcz).title("Stan jakosci powietrza - Bydgoszcz"));
        Location.put(bydgoszcz,bydgoszczListner);

        //Gdansk
        LatLng gdansk = new LatLng( 54.35205, 18.64637);
        Marker gdanskListner = mMap.addMarker(new MarkerOptions().position(gdansk).title("Stan jakosci powietrza - Gdansk"));
        Location.put(gdansk,gdanskListner);

        //Lodz
        LatLng lodz = new LatLng(51.75, 19.46667);
        Marker lodzListner = mMap.addMarker(new MarkerOptions().position(lodz).title("Stan jakosci powietrza - Lodz"));
        Location.put(lodz,lodzListner);

        //Kielce
        LatLng kielce = new LatLng(50.87033,  20.62752);
        Marker kielceListner = mMap.addMarker(new MarkerOptions().position(kielce).title("Stan jakosci powietrza - Kielce"));
        Location.put(kielce,kielceListner);

        //Lublin
        LatLng lublin = new LatLng( 51.25, 22.56667);
        Marker lublinListner = mMap.addMarker(new MarkerOptions().position(kielce).title("Stan jakosci powietrza - Lublin"));
        Location.put(lublin,lublinListner);

        //Bialystok
        LatLng bialystok = new LatLng(53.13333, 23.16433);
        Marker bialystokListner = mMap.addMarker(new MarkerOptions().position(bialystok).title("Stan jakosci powietrza - Bialystok"));
        Location.put(bialystok,bialystokListner);

        //Olsztyn
        LatLng olsztyn = new LatLng(53.77995, 20.49416);
        Marker olsztynkListner = mMap.addMarker(new MarkerOptions().position(bialystok).title("Stan jakosci powietrza - Olsztyn"));
        Location.put(olsztyn,olsztynkListner);

        //Warszawa
        LatLng warszawa = new LatLng(52.22977, 21.01178);
        Marker warszawakListner = mMap.addMarker(new MarkerOptions().position(warszawa).title("Stan jakosci powietrza - Warszawa"));
        Location.put(warszawa,warszawakListner);
        return Location;
    }
}

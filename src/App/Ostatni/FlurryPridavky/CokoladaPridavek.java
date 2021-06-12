package App.Ostatni.FlurryPridavky;

import App.Ostatni.OstatniDecorator;

import App.Produkt;

public class CokoladaPridavek extends OstatniDecorator {
    Produkt aktualni;
   
    public CokoladaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Čokoládová poleva";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}
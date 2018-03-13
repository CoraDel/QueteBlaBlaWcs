package fr.wcs.blablawcs;

/**
 * Created by wilder on 12/03/18.
 */

public class VehiculeBoat extends VehiculeAbstract {


    int hours;


    public VehiculeBoat(String model, String brand, int hours) {
        this.setBrand(brand);
        this.setModel(model);
        this.hours = hours;
    }


    @Override
    public String getDescription() {
        return getModel()+ " " +getBrand() +  " "+ hours;
    }
}


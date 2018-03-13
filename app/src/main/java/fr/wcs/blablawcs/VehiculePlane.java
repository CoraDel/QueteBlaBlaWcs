package fr.wcs.blablawcs;

/**
 * Created by wilder on 13/03/18.
 */

public class VehiculePlane extends VehiculeAbstract {

    int speed;


    public VehiculePlane(String model, String brand,int speed) {
        this.setBrand(brand);
        this.setModel(model);
        this.speed = speed;
    }


    @Override
    public String getDescription() {
        return getModel() + " " + getBrand() + " " + speed;
    }
}


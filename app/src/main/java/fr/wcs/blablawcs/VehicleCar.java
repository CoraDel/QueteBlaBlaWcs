package fr.wcs.blablawcs;

/**
 * Created by wilder on 12/03/18.
 */

public class VehicleCar extends VehiculeAbstract {
    int kilometers;

    public VehicleCar(String model,String brand, int kilometers)
    {
        this.setBrand(brand);
        this.setModel(model);
        this.kilometers = kilometers;
    }

    @Override
    public String getDescription() {
        return getBrand()+" "+ getModel()+" "+ kilometers;
    }
}

package com.eight.P15_builderPattern.builders;

import com.eight.P15_builderPattern.cars.CarType;
import com.eight.P15_builderPattern.components.Engine;
import com.eight.P15_builderPattern.components.GPSNavigator;
import com.eight.P15_builderPattern.components.Transmission;
import com.eight.P15_builderPattern.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

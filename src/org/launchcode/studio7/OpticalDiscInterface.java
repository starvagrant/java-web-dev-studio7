package org.launchcode.studio7;

import java.io.ByteArrayOutputStream;
import java.util.Map;

public interface OpticalDiscInterface {
    static double diskThicknessInMillimeters = 1.2;

    void spinDisk();
    void stopDisk();
    ByteArrayOutputStream getData();
    void writeData(ByteArrayOutputStream data);
    Map<String, String> getInfo();

}
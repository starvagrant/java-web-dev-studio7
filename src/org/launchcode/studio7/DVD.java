package org.launchcode.studio7;

import java.io.ByteArrayOutputStream;
import java.util.Map;

public class DVD extends OpticalDisk implements OpticalDiscInterface {

    protected double capacity = 4700.0; // MB ;
    protected double dataTransferRate = 11.0; // MB / sec;
    protected double pitLength = .4; // Microns
    protected int spinRate = 52;
    protected boolean isSpinning = false;
    protected Map<String, String> initialInfo;
    protected ByteArrayOutputStream data;

    public DVD(Map<String, String> initialInfo) {
        super();
        this.initialInfo = initialInfo;
    }

    public Map<String, String> getInfo(){
        return this.initialInfo;
    }

    public ByteArrayOutputStream getData() {
        return this.data;
    }

    public void writeData(ByteArrayOutputStream output) {
        this.data = output;
    }
}

package org.launchcode.studio7;

import java.io.ByteArrayOutputStream;
import java.util.Map;

public class CD extends OpticalDisk implements OpticalDiscInterface {
    protected double capacity = 700.0; // MB
    protected double dataTransferRate = 1.5; // MB / sec;
    protected double pitLength = .83; // Microns
    protected int spinRate = 52;
    protected boolean isSpinning = false;
    protected Map<String, String> initialInfo;
    protected ByteArrayOutputStream data;

    public CD(Map<String, String> initialInfo) {
        super();
        this.initialInfo = initialInfo;
    }

    @Override
    public ByteArrayOutputStream getData() {
        return this.data;
    }

    @Override
    public void writeData(ByteArrayOutputStream data) {
        this.data = data;
    }

    @Override
    public Map<String, String> getInfo() {
        return this.initialInfo;
    }
}

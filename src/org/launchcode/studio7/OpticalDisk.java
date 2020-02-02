package org.launchcode.studio7;

import java.io.ByteArrayOutputStream;
import java.util.Map;

abstract public class OpticalDisk {
    protected double capacity;
    protected double dataTransferRate;
    protected double pitLength;
    protected int spinRate;
    protected boolean isSpinning = false;
    protected Map<String, String> initialInfo;
    protected ByteArrayOutputStream data;

    protected OpticalDisk() {}

    public void spinDisk() {
        this.isSpinning = true;
    }

    public void stopDisk() {
        this.isSpinning = false;
    }

    public boolean getIsSpinning() {
        return this.isSpinning;
    }


}

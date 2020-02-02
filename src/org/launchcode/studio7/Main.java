package org.launchcode.studio7;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        Map<String, String> cdInfo = new HashMap<>();
        cdInfo.put("Album", "Anthems to the Welkin at Dusk");
        cdInfo.put("Band", "Emperor");
        CD cd = new CD(cdInfo);

        Map<String, String> dvdInfo = new HashMap<>();
        dvdInfo.put("Title", "Star Wars");
        dvdInfo.put("Year", "1977");
        DVD dvd = new DVD(dvdInfo);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(cd.getInfo().equals(cdInfo));
        System.out.println(dvd.getInfo().equals(dvdInfo));

        cd.spinDisk();
        System.out.println(cd.getIsSpinning());
        cd.stopDisk();
        System.out.println(!cd.getIsSpinning());

        dvd.spinDisk();
        System.out.println(dvd.getIsSpinning());
        dvd.stopDisk();
        System.out.println(!dvd.getIsSpinning());

        byte[] bytes = "Music".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.writeBytes(bytes);
        cd.writeData(baos);
        System.out.println(cd.getData().toString().equals("Music"));

        byte[] dvdBytes = "DVD".getBytes();
        baos = new ByteArrayOutputStream();
        baos.writeBytes(dvdBytes);
        dvd.writeData(baos);
        System.out.println(dvd.getData().toString().equals("DVD"));
    }
}

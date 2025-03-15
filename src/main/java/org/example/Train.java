package org.example;

public class Train {
    String name;
    Integer carriageCout;
    String tripName;

    public Train(String name, Integer carriageCout, String tripName){
        this.name = name;
        this.carriageCout = carriageCout;
        this.tripName = tripName;
    }

    public void changeName(String newData){
        this.name = newData;
    }

    public void changeCarriageCout(Integer newData){
        this.carriageCout = newData;
    }

    public void changeTripNaem(String newData){
        this.tripName = newData;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\tname: \"" + name + "\",\n" +
                "\tcarriageCout: " + carriageCout + ",\n" +
                "\ttripName: \"№" + tripName + "\"\n" +
                '}';
    }
}

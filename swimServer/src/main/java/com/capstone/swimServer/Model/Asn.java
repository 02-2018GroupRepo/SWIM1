package com.capstone.swimServer.Model;

public class Asn {
    int asn;
    String vendorId;
    String expectedArrivalDate;
    String expectedArrivalTime;
    Serial[] serials;
    int dockDoor;


    public Asn() {
    }

    public Asn(int asn, String vendorId, String expectedArrivalDate, String expectedArrivalTime, Serial[] serials, int dockDoor) {
        this.asn = asn;
        this.vendorId = vendorId;
        this.expectedArrivalDate = expectedArrivalDate;
        this.expectedArrivalTime = expectedArrivalTime;
        this.serials = serials;
        this.dockDoor = dockDoor;
    }

    public String getExpectedArrivalDate() {
        return expectedArrivalDate;
    }

    public void setExpectedArrivalDate(String expectedArrivalDate) {
        this.expectedArrivalDate = expectedArrivalDate;
    }

    public String getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public void setExpectedArrivalTime(String expectedArrivalTime) {
        this.expectedArrivalTime = expectedArrivalTime;
    }

    public Serial[] getSerials() {
        return serials;
    }

    public void setSerials(Serial[] serials) {
        this.serials = serials;
    }

    public int getAsn() {
        return asn;
    }

    public void setAsn(int asn) {
        this.asn = asn;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public int getDockDoor() {
        return dockDoor;
    }

    public void setDockDoor(int dockDoor) {
        this.dockDoor = dockDoor;
    }

}

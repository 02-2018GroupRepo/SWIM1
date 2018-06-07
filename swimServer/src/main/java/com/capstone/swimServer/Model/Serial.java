package com.capstone.swimServer.Model;

public class Serial {
    int serial;
    String status;


    public Serial() {
    }

    public Serial(int serial, String status) {
        this.serial = serial;
        this.status = status;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

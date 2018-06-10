package com.capstone.swimServer.Service;

import com.capstone.swimServer.Dao.AsnDao;
import com.capstone.swimServer.Model.Asn;
import com.capstone.swimServer.Model.Serial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AsnService {
    @Autowired
    AsnDao asnDao;

    public void insertAsnSerial(Asn asn){
        asnDao.insertAsn(asn);
        insertSerials(asn);
    }

    public void insertSerials(Asn asn){
        for(Serial nameSerial:asn.getSerials()){
            asnDao.insertSerial(asn.getAsn(), nameSerial.getSerial());
        }
    }

    public void updateASN(Asn asn){
        if(asn.getDockDoor() != 0) {
            asnDao.updateDockDoor(asn.getDockDoor(), asn.getAsn());
        }
        updateSerials(asn);
    }

    public void updateSerials(Asn asn){
        int statusCount = 0;
        String first = asn.getSerials()[0].getStatus();
        for(int i = 0; i < asn.getSerials().length; i++){
            asnDao.updateSerial(asn.getSerials()[i].getStatus(), asn.getSerials()[i].getSerial(), asn.getAsn());
            if(!asn.getSerials()[i].getStatus().equals(first)){
                statusCount += 1;
            }
        }
        if(statusCount == 0 && first.equals("RECEIVED") || first.equals("LOADED")){
            asnDao.updateAsnStatus(first, asn.getAsn());
        }
    }

}

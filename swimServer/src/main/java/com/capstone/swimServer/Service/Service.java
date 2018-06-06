package com.capstone.swimServer.Service;

import com.capstone.swimServer.Dao.AsnDao;
import com.capstone.swimServer.Model.Asn;
import com.capstone.swimServer.Model.Serial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
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

}

package com.capstone.swimServer.Controller;

import com.capstone.swimServer.Model.Asn;
import com.capstone.swimServer.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private Service service;

//    @RequestMapping("/")
//    public @ResponseBody Iterable<Asn> getAsn(){
//        return asnDao.getASN();
//    }

    @RequestMapping(value = "/receiveAsn", method= RequestMethod.POST)
    public void insertAsn(@RequestBody Asn asn) {
        service.insertAsnSerial(asn);
    }

}

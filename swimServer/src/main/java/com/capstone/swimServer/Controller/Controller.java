package com.capstone.swimServer.Controller;

import com.capstone.swimServer.Dao.AsnDao;
import com.capstone.swimServer.Model.Asn;
import com.capstone.swimServer.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;
    @Autowired
    private AsnDao asnDao;

//    @RequestMapping("/")
//    public @ResponseBody Iterable<Asn> getAsn(){
//        return asnDao.getASN();
//    }

    @RequestMapping(value = "/receiveAsn", method= RequestMethod.POST)
    public void insertAsn(@RequestBody Asn asn) {
        service.insertAsnSerial(asn);
    }

    @RequestMapping(value = "/getSerial", method= RequestMethod.POST)
    public @ResponseBody List getSerial(@RequestBody String str) {
        return asnDao.getSerial(str);
    }

}

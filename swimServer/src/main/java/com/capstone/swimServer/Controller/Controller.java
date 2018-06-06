package com.capstone.swimServer.Controller;

import com.capstone.swimServer.Dao.AsnDao;
import com.capstone.swimServer.Model.Asn;
import com.capstone.swimServer.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {
    @Autowired
    private Service service;
    private AsnDao asnDao;

//    @RequestMapping("/")
//    public @ResponseBody Iterable<Asn> getAsn(){
//        return asnDao.getASN();
//    }

    @RequestMapping(value = "/receiveAsn", method= RequestMethod.POST)
    public void insertAsn(@RequestBody Asn asn) {
        service.insertAsnSerial(asn);
    }

    @RequestMapping(value = "/serialTest", method= RequestMethod.POST)
    public List<Map<String, Object>> insertAsn(@RequestBody String str) {
        return asnDao.getSerial(str);

    }

}

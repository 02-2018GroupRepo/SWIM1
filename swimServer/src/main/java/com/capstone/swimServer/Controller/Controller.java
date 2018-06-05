package com.capstone.swimServer.Controller;

import com.capstone.swimServer.Dao.AsnDao;
import com.capstone.swimServer.Model.Asn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private AsnDao asnDao;

    @RequestMapping("/")
    public @ResponseBody Iterable<Asn> getAsn(){
        return asnDao.getASN();
    }
}

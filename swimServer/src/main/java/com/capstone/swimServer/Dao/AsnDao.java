package com.capstone.swimServer.Dao;

import com.capstone.swimServer.Model.Asn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AsnDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String getASNQuery= "SELECT * FROM warehouse";

    public List getASN(){
        List<Asn> AsnList = jdbcTemplate.query(getASNQuery, new BeanPropertyRowMapper<>(Asn.class));
        return AsnList;
    }
}

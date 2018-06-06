package com.capstone.swimServer.Dao;

import com.capstone.swimServer.Model.Asn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class AsnDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String getASNQuery= "SELECT * FROM warehouse WHERE asn = ?";
    private final String insertAsn= "INSERT INTO warehouse VALUES(?,?,?,?,?,?)";
    private final String insertSerial= "INSERT INTO itemizedAsn VALUES(?,?,?)";
    private final String getSerialQuery = "SELECT serial FROM itemizedAsn WHERE = ";

//    private final String updateDockDoorQuery = "UPDATE warehouse SET dockDoor = ? WHERE asn = ?";

//    public List getASN(){
//        List<Asn> AsnList = jdbcTemplate.query(getASNQuery, new BeanPropertyRowMapper<>(Asn.class));
//        return AsnList;
//    }

    public void insertAsn(Asn asn){
        jdbcTemplate.update(insertAsn, asn.getAsn(), asn.getVendorId(), asn.getExpectedArrivalDate(), asn.getExpectedArrivalTime(), "IN TRANSIT", null);
    }

    public void insertSerial(int asn, int serial){
        jdbcTemplate.update(insertSerial, asn, serial, null);
    }

    //Find a better way than this to avoid potential injection
    public Asn getAsn(String asn){
        Asn asnList = jdbcTemplate.queryForObject(getASNQuery, new Object[] {asn}, Asn.class);
        return asnList;
    }

    public List<Map<String, Object>> getSerial(String asn){
        List<Map<String, Object>> serials = jdbcTemplate.queryForList(getSerialQuery, asn);
        return serials;
    }

}

package com.capstone.swimServer.Dao;

import com.capstone.swimServer.Model.DockDoor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DockDoorDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String getDockDoor = "SELECT * FROM dockDoor";
    private final String deleteDockDoor = "DELETE FROM dockDoor WHERE dockDoorNumber = ?";
    private final String addDockDoor = "INSERT INTO dockDoor VALUES (?)";

    public List<DockDoor> getDockDoor(){
        List<DockDoor> dockDoorList = jdbcTemplate.query(getDockDoor, new BeanPropertyRowMapper(DockDoor.class));
        return dockDoorList;
    }

    public void deleteDockDoor(int dockDoorNumber){
        jdbcTemplate.update(deleteDockDoor, dockDoorNumber);
    }

    public void addDockDoor(int dockDoorNumber){
        jdbcTemplate.update(addDockDoor, dockDoorNumber);
    }

}

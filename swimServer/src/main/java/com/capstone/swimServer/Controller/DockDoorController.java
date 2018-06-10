package com.capstone.swimServer.Controller;

import com.capstone.swimServer.Dao.DockDoorDao;
import com.capstone.swimServer.Model.DockDoor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DockDoorController {

    @Autowired
    DockDoorDao dao;

    @CrossOrigin
    @RequestMapping(value = "/getDockDoor", method = RequestMethod.GET)
    public List<DockDoor> getDockDoor(){
        return dao.getDockDoor();
    }

    @CrossOrigin
    @RequestMapping(value = "/deleteDockDoor", method = RequestMethod.POST)
    public void deleteDockDoor(@RequestBody DockDoor dockDoorNumber){
        dao.deleteDockDoor(dockDoorNumber.getDockDoorNumber());
    }

    @CrossOrigin
    @RequestMapping(value = "/addDockDoor", method = RequestMethod.POST)
    public void addDockDoor(@RequestBody DockDoor dockDoorNumber){
        dao.addDockDoor(dockDoorNumber.getDockDoorNumber());
    }
}

package com.crud.crudop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/ships")
public class crudcontroller {   
    
    @Autowired
    private ShipRepository shipRepository;

    //test
    @GetMapping("/test")
    public String test(){
        return "This Port works !";
    }

    @PostMapping
    public Ship creatShip(@RequestBody Ship ship){
        return shipRepository.save(ship);
    }

    //to get all the ships.
    @GetMapping
    public List<Ship> getShip(){
        return shipRepository.findAll();
    }
    
    //to get the ship by ID.
    @GetMapping("/{id}")
    public Optional<Ship> getShipById(@PathVariable Long id){
        return shipRepository.findById(id);
    }   

    //to  update the ship by ID.
    @PutMapping("/{id}")
    public Ship updateShip(@PathVariable Long id, @RequestBody Ship shipDetails){
        Ship ship = shipRepository.findById(id).orElseThrow(() -> new RuntimeException("Ship not found with id: "+id));
        ship.setShip(shipDetails.getShip());
        ship.setMovie(shipDetails.getMovie());
        return shipRepository.save(ship);
    }

    //to delete the ship by a given id.
    @DeleteMapping()
    public String deleteShip(@RequestParam Long id){
        if (shipRepository.existsById(id)){
            shipRepository.deleteById(id);
            return "Ship deleted successfully";
        }else{
            return "Ship not found with id: "+id;
        }
    }
}
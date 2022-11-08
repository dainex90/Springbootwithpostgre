package com.example.demo.spaceship;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/spaceship")
public class SpaceShipController
{
    private final SpaceShipService service;


@Autowired
public SpaceShipController(SpaceShipService service) {
    super();
    this.service = service;
}

@GetMapping
public List<Spaceship> getShips()
{
    return service.getShips();
}

@PostMapping
public void registerNewShip(@RequestBody Spaceship ship)
{
    service.addNewShip(ship);
}

@PutMapping(path = "{id}")
public void updateShip(@PathVariable("id") Long id, @RequestParam(required = false) String modelName,
                       @RequestParam(required = false) String description,
                       @RequestParam(required = false)Integer capacity)
{
    service.updateShip(id, modelName, description, capacity);
}


}
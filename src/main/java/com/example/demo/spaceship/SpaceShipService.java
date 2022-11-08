package com.example.demo.spaceship;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SpaceShipService 
{

    private final SpaceShipRepository repo;
    @Autowired
    public SpaceShipService(SpaceShipRepository repo)
    {
        this.repo = repo;
    }


    public List<Spaceship> getShips() {
        // call a repository for CRUD's
        return repo.findAll();
    }

    public void addNewShip(Spaceship ship) 
    {
        repo.save(ship);
    }

    @Transactional
    public void updateShip(Long id, String modelName, String description, Integer capacity)
    {
         Spaceship ship = repo.findById(id).orElseThrow(() -> new IllegalStateException(
                 ("There is not a spaceship stored with id " + id)));

        if (modelName != null && modelName.length() > 0 && !Objects.equals(ship.getModelName(), modelName))
        {
            ship.setModelName(modelName);
        }

        if(description != null && description.length() > 0 && !Objects.equals(ship.getDescription(), description))
        {
            ship.setDescription(description);
        }

        if(capacity > 0 && !Objects.equals(ship.getCapacity(), capacity))
        {
            ship.setCapacity(capacity);
        }
    }

}

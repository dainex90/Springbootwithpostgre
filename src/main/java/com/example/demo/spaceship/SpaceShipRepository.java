package com.example.demo.spaceship;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceShipRepository extends JpaRepository<Spaceship, Long>
{
    Optional<Spaceship> findShipByDescription(String desc);
}
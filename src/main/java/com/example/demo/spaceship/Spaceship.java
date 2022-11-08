package com.example.demo.spaceship;

import com.sun.istack.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table
public class Spaceship 
{
    @Id
    @SequenceGenerator(
        name = "ship-sequence",
        sequenceName = "ship_sequence",
        allocationSize = 1
    )

    @GeneratedValue (
        strategy = GenerationType.SEQUENCE,
        generator = "ship_sequence"
    )
    private Long id;
    @NotNull
    private String modelName;
    private String description;
    @NotNull
    private LocalDate manufacturerDate;
    @NotNull
    private Double maxSpeed;
    @NotNull
    private Integer capacity;

    public Spaceship() {
    }

    // WITH ID !
    public Spaceship(Long id, String modelName, String description, LocalDate manufacturerDate, Double maxSpeed,
                    Integer capacity)
    {
        super();

        this.id = id;
        this.modelName = modelName;
        this.description = description;
        this.manufacturerDate = manufacturerDate;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    // WITHOUT ID
    public Spaceship(String modelName, String description, LocalDate manufacturerDate, Double maxSpeed,
                    Integer capacity)
    {
        this.modelName = modelName;
        this.description = description;
        this.manufacturerDate = manufacturerDate;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;       
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName the modelName to set
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return LocalDate return the manufacturerDate
     */
    public LocalDate getManufacturerDate() {
        return manufacturerDate;
    }

    /**
     * @param manufacturerDate the manufacturerDate to set
     */
    public void setManufacturerDate(LocalDate manufacturerDate) {
        this.manufacturerDate = manufacturerDate;
    }

    /**
     * @return Double return the maxSpeed
     */
    public Double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @param maxSpeed the maxSpeed to set
     */
    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return Integer return the capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String toString()
    {
        return "Student{"+
                "id=" + id +
                ", modelName='" + modelName +'\'' +
                ", description='" + description +'\'' +
                ", manufacturerDate='" + manufacturerDate +'\'' +
                ", maxSpeed='" + maxSpeed +'\'' +
                ", capacity='" + capacity +'\'' + '}';
    }

}

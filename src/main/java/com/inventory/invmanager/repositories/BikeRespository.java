package com.inventory.invmanager.repositories;

import com.inventory.invmanager.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRespository extends JpaRepository<Bike,Long> {

}

package com.locationweb11.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locationweb11.entities.Location;

@Repository
public interface Location11Repository extends JpaRepository<Location, Long> {

}

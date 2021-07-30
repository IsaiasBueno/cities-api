package com.isaiasbueno.citiesapi.countries.entities.repositories;

import com.isaiasbueno.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
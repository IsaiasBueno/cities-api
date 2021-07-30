package com.isaiasbueno.citiesapi.states.repositories;

import com.isaiasbueno.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

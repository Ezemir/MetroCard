package br.uece.eesdevops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uece.eesdevops.entity.Travel;

public interface TravelRepository extends JpaRepository<Travel, Long>{

}

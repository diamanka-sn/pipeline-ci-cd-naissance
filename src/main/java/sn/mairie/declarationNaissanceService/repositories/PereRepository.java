package sn.mairie.declarationNaissanceService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.declarationNaissanceService.entities.Pere;


public interface PereRepository extends JpaRepository<Pere, Long> {
	
}

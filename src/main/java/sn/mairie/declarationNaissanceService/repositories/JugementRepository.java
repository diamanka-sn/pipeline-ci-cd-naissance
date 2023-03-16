package sn.mairie.declarationNaissanceService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.declarationNaissanceService.entities.Jugement;


public interface JugementRepository extends JpaRepository<Jugement, Long>{

}

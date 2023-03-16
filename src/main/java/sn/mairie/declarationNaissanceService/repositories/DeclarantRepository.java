package sn.mairie.declarationNaissanceService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.declarationNaissanceService.entities.Declarant;



public interface DeclarantRepository extends JpaRepository<Declarant, Long> {

}

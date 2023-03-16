package sn.mairie.declarationNaissanceService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.declarationNaissanceService.entities.DeclarationNaissance;


public interface DeclarationNaissanceRepository extends JpaRepository<DeclarationNaissance, Long> {

}

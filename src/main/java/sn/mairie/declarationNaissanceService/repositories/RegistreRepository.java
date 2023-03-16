package sn.mairie.declarationNaissanceService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.declarationNaissanceService.entities.Registre;


public interface RegistreRepository extends JpaRepository<Registre, Long> {

}

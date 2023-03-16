package sn.mairie.declarationNaissanceService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.declarationNaissanceService.entities.Temoin;


public interface TemoinRepository extends JpaRepository<Temoin, Long> {

}

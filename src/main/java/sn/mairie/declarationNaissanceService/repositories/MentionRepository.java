package sn.mairie.declarationNaissanceService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.declarationNaissanceService.entities.Mention;


public interface MentionRepository extends JpaRepository<Mention, Long> {

}

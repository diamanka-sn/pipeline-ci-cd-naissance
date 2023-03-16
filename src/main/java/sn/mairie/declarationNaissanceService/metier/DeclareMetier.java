package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.Declare;
import sn.mairie.declarationNaissanceService.repositories.DeclareRepository;
import sn.mairie.declarationNaissanceService.repositories.TemoinRepository;

@Service
@Data
public class DeclareMetier implements IDeclareMetier{
	@Autowired
	DeclareRepository declareRepository;

	@Override
	public Declare save(Declare declare) {
		// TODO Auto-generated method stub
		return declareRepository.save(declare);
	}

	@Override
	public List<Declare> list() {
		// TODO Auto-generated method stub
		return declareRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		declareRepository.deleteById(id);
		return "Suppression réussie";
	}

	@Override
	public Declare search(Long id) {
		// TODO Auto-generated method stub
		return declareRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Declare declare) {
		// TODO Auto-generated method stub
		Declare baby = declareRepository.findById(id).get();
		
		if(baby != null) {
			if(declare.getNom() != null) baby.setNom(declare.getNom());
			if(declare.getPrenom() != null) baby.setPrenom(declare.getPrenom());
			if(declare.getSexe() != null) baby.setSexe(declare.getSexe());
			if(declare.getDateNaissance() != null) baby.setDateNaissance(declare.getDateNaissance());
			if(declare.getLieuNaissance() != null) baby.setLieuNaissance(declare.getLieuNaissance());
			
			declareRepository.save(baby);
			return "Modification reussie";
		}
		
		return "Déclaré introuvable";
	}
	
	
}

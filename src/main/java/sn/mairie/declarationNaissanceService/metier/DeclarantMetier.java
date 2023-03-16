package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.Declarant;
import sn.mairie.declarationNaissanceService.repositories.DeclarantRepository;
import sn.mairie.declarationNaissanceService.repositories.DeclareRepository;

@Service
@Data
public class DeclarantMetier implements IDeclarantMetier{

	@Autowired
	DeclarantRepository declarantRepository;
	
	@Override
	public Declarant save(Declarant declarant) {
		// TODO Auto-generated method stub
		return declarantRepository.save(declarant);
	}

	@Override
	public List<Declarant> list() {
		// TODO Auto-generated method stub
		return declarantRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		declarantRepository.deleteById(id);
		return "Suppression réussie";
	}

	@Override
	public Declarant search(Long id) {
		// TODO Auto-generated method stub
		return declarantRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Declarant declarant) {
		// TODO Auto-generated method stub
		Declarant existe = declarantRepository.findById(id).get();
		
		if(existe != null) {
			if(declarant.getNom() != null) existe.setNom(declarant.getNom());
			if(declarant.getPrenom() != null) existe.setPrenom(declarant.getPrenom());
			if(declarant.getTypePiece() != null) existe.setTypePiece(declarant.getTypePiece());
			if(declarant.getNumeroPiece() != null) existe.setNumeroPiece(declarant.getNumeroPiece());
			if(declarant.getProfession() != null) existe.setProfession(declarant.getProfession());
			if(declarant.getAdresse() != null) existe.setAdresse(declarant.getAdresse());
			if(declarant.getDateNaissance() != null) existe.setDateNaissance(declarant.getDateNaissance());
			if(declarant.getLieuNaissance() != null) existe.setLieuNaissance(declarant.getLieuNaissance());
			
			declarantRepository.save(existe);
			return "Modification reussie";
		}
		
		return "Déclarant introuvable";
	}

}

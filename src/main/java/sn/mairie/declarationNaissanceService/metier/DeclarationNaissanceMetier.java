package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.DeclarationNaissance;
import sn.mairie.declarationNaissanceService.repositories.CentreRepository;
import sn.mairie.declarationNaissanceService.repositories.DeclarationNaissanceRepository;


@Service
@Data
public class DeclarationNaissanceMetier implements IDeclarationNaissanceMetier{
	@Autowired
	DeclarationNaissanceRepository declarationNaissanceRepository;

	@Override
	public DeclarationNaissance save(DeclarationNaissance declarationNaissance) {
		// TODO Auto-generated method stub
		return declarationNaissanceRepository.save(declarationNaissance);
	}

	@Override
	public List<DeclarationNaissance> list() {
		// TODO Auto-generated method stub
		return declarationNaissanceRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		declarationNaissanceRepository.deleteById(id);
		return "Suppression reussie";
	}

	@Override
	public DeclarationNaissance search(Long id) {
		// TODO Auto-generated method stub
		return declarationNaissanceRepository.findById(id).get();
	}

	@Override
	public String update(Long id, DeclarationNaissance declarationNaissance) {
		// TODO Auto-generated method stub
		DeclarationNaissance existe = declarationNaissanceRepository.findById(id).get();
		if(existe != null) {
			if(declarationNaissance.getCentre() != null) existe.setCentre(declarationNaissance.getCentre());
			if(declarationNaissance.getDate() != null) existe.setDate(declarationNaissance.getDate());
			if(declarationNaissance.getDateModification() != null) existe.setDateModification(declarationNaissance.getDateModification());
			if(declarationNaissance.getDeclarant() != null) existe.setDeclarant(declarationNaissance.getDeclarant());
			if(declarationNaissance.getDeclaration() != null) existe.setDeclaration(declarationNaissance.getDeclaration());
			if(declarationNaissance.getDeclare() != null) existe.setDeclare(declarationNaissance.getDeclare());
			if(declarationNaissance.getFormationSanitaire() != null) existe.setFormationSanitaire(declarationNaissance.getFormationSanitaire());
			if(declarationNaissance.getJugement() != null) existe.setJugement(declarationNaissance.getJugement());
			if(declarationNaissance.getMere() != null) existe.setMere(declarationNaissance.getMere());
			if(declarationNaissance.getPere() != null) existe.setPere(declarationNaissance.getPere());
			if(declarationNaissance.getReference() != null) existe.setReference(declarationNaissance.getReference());
			if(declarationNaissance.getRegistre() != null) existe.setRegistre(declarationNaissance.getRegistre());
			if(declarationNaissance.getScanAt() != null) existe.setScanAt(declarationNaissance.getScanAt());
			
			declarationNaissanceRepository.save(existe);
			return "Modification effectuée";
		}
		return "Modification bloquée";
	}

}

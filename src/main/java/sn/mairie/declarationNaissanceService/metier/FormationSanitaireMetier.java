package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.FormationSanitaire;
import sn.mairie.declarationNaissanceService.repositories.FormationSanitaireRepository;
import sn.mairie.declarationNaissanceService.web.FormationSanitaireController;

@Service
@Data
public class FormationSanitaireMetier implements IFormationSanitaireMetier{
	
	FormationSanitaireRepository formationSanitaireRepository;
	
	@Override
	public FormationSanitaire save(FormationSanitaire formationSanitaire) {
		// TODO Auto-generated method stub
		return formationSanitaireRepository.save(formationSanitaire);
	}

	@Override
	public List<FormationSanitaire> list() {
		// TODO Auto-generated method stub
		return formationSanitaireRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		formationSanitaireRepository.deleteById(id);
		return "Suppression reussie";
	}

	@Override
	public FormationSanitaire search(Long id) {
		// TODO Auto-generated method stub
		return formationSanitaireRepository.findById(id).get();
	}

	@Override
	public String update(Long id, FormationSanitaire formationSanitaire) {
		// TODO Auto-generated method stub
		FormationSanitaire existe = formationSanitaireRepository.findById(id).get();
		
		if(existe != null) {
			if(formationSanitaire.getCode() != null) existe.setCode(formationSanitaire.getCode());
			if(formationSanitaire.getLibele() != null) existe.setLibele(formationSanitaire.getLibele());
			if(formationSanitaire.getType() != null) existe.setType(formationSanitaire.getType());
			
			formationSanitaireRepository.save(existe);
			return "Modification reussi";
		}
		return "Modification bloquée";
	}

}

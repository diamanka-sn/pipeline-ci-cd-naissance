package sn.mairie.declarationNaissanceService.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.FormationSanitaire;
import sn.mairie.declarationNaissanceService.metier.CentreMetier;
import sn.mairie.declarationNaissanceService.metier.IFormationSanitaireMetier;
import sn.mairie.declarationNaissanceService.repositories.CentreRepository;

@RestController
@RequestMapping("/formationitaires" )
public class FormationSanitaireController {
	@Autowired
	IFormationSanitaireMetier formationSanitaireMetier;
	
	@PostMapping("/create")
	public FormationSanitaire save(@RequestBody FormationSanitaire formationSanitaire) {
		return formationSanitaireMetier.save(formationSanitaire);
	}
	@GetMapping("/read")
	public List<FormationSanitaire> list() {
		return formationSanitaireMetier.list();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return formationSanitaireMetier.remove(id);
	}
	@GetMapping("/search/{id}")
	public FormationSanitaire search(@PathVariable Long id) {
		return formationSanitaireMetier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id,@RequestBody FormationSanitaire formationSanitaire) {
		return formationSanitaireMetier.update(id, formationSanitaire);
	}
}

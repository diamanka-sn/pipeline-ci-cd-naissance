package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.FormationSanitaire;


public interface IFormationSanitaireMetier {
	
	public List<FormationSanitaire> list();
	
	public String remove(Long id);
	
	public FormationSanitaire search(Long id);
	
	public String update(Long id,FormationSanitaire formationSanitaire);

	public FormationSanitaire save(FormationSanitaire formationSanitaire);
}

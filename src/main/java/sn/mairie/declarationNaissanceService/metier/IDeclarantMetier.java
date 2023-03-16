package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Declarant;


public interface IDeclarantMetier {
	public Declarant save(Declarant declarant);
	
	public List<Declarant> list();
	
	public String remove(Long id);
	
	public Declarant search(Long id);
	
	public String update(Long id,Declarant declarant);
}

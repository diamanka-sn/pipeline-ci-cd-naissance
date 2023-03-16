package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Centre;


public interface ICentreMetier {
	
	public Centre save(Centre centre);
	
	public List<Centre> list();
	
	public String remove(Long id);
	
	public Centre search(Long id);
	
	public String update(Long id,Centre centre);
}

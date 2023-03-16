package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Pere;


public interface IPereMetier {
	public Pere savePere(Pere p);
	
	public List<Pere> listPeres();
	
	public String remove(Long id);
	
	public Pere search(Long id);
	
	public String update(Long id,Pere pere);
	
}

package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Declare;


public interface IDeclareMetier {
	
	public Declare save(Declare declare);
	
	public List<Declare> list();
	
	public String remove(Long id);
	
	public Declare search(Long id);
	
	public String update(Long id,Declare declare);
}

package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Temoin;



public interface ITemoinMetier {
	
	public Temoin save(Temoin m);
	
	public List<Temoin> list();
	
	public String remove(Long id);
	
	public Temoin search(Long id);
	
	public String update(Long id,Temoin mere);
}

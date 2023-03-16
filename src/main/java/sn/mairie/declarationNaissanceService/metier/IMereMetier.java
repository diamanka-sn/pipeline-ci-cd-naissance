package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.Mere;

public interface IMereMetier {

    public Mere saveMere(Mere m);
	
	public List<Mere> listMeres();
	
	public String remove(Long id);
	
	public Mere search(Long id);
	
	public String update(Long id,Mere mere);
}

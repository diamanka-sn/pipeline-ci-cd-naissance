package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import sn.mairie.declarationNaissanceService.entities.DeclarationNaissance;


public interface IDeclarationNaissanceMetier {
	public DeclarationNaissance save(DeclarationNaissance declarationNaissance);
	
	public List<DeclarationNaissance> list();
	
	public String remove(Long id);
	
	public DeclarationNaissance search(Long id);
	
	public String update(Long id,DeclarationNaissance declarationNaissance);
}

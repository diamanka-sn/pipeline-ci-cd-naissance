package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.Temoin;
import sn.mairie.declarationNaissanceService.repositories.MereRepository;
import sn.mairie.declarationNaissanceService.repositories.TemoinRepository;

@Service
@Data

public class TemoinMetier implements ITemoinMetier{
	
	@Autowired
	TemoinRepository temoinRepository;

	@Override
	public Temoin save(Temoin t) {
		// TODO Auto-generated method stub
		return temoinRepository.save(t);
	}

	@Override
	public List<Temoin> list() {
		// TODO Auto-generated method stub
		return temoinRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		temoinRepository.deleteById(id);
		return "supression reussie";
	}

	@Override
	public Temoin search(Long id) {
		// TODO Auto-generated method stub
		return temoinRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Temoin t) {
		// TODO Auto-generated method stub
		Temoin temoin = temoinRepository.findById(id).get();
		if(temoin != null) {
			if(t.getNom() != null) temoin.setNom(t.getNom());
			if(t.getPrenom() != null) temoin.setPrenom(t.getPrenom());
			if(t.getProfession() != null) temoin.setProfession(t.getProfession());
			if(t.getDomicile() != null) temoin.setDomicile(t.getDomicile());;
			if(t.getTypePiece() != null) temoin.setTypePiece(t.getTypePiece());
			if(t.getNumeroPiece() != null) temoin.setNumeroPiece(t.getNumeroPiece());
			if(t.getDateNaissance() != null) temoin.setDateNaissance(t.getDateNaissance());
			if(t.getLieuNaissance() != null) temoin.setLieuNaissance(t.getLieuNaissance());
			
			temoinRepository.save(temoin);
			
			return "Modification reussie";
		}
		else {
			return "Pere introuvable";
		}
	}

}

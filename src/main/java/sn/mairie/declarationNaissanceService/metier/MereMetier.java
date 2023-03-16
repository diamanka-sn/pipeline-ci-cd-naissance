package sn.mairie.declarationNaissanceService.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import sn.mairie.declarationNaissanceService.entities.Mere;
import sn.mairie.declarationNaissanceService.repositories.MereRepository;


@Service
@Data 
public class MereMetier implements IMereMetier {

	@Autowired
	MereRepository mereRepository;
	
	@Override
	public Mere saveMere(Mere m) {
		return mereRepository.save(m);
	}

	@Override
	public List<Mere> listMeres() {
		// TODO Auto-generated method stub
		return mereRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		mereRepository.deleteById(id);
		return "mere supprimée";
	}

	@Override
	public Mere search(Long id) {
		// TODO Auto-generated method stub
		return mereRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Mere mere) {
		Mere mum = mereRepository.findById(id).get();
		
		if(mum != null) {
			if(mere.getNom() != null) mum.setNom(mere.getNom());
			if(mere.getPrenom() != null) mum.setPrenom(mere.getPrenom());
			if(mere.getProfession() != null) mum.setProfession(mere.getProfession());
			if(mere.getAdresse() != null) mum.setAdresse(mere.getAdresse());
			if(mere.getTypePiece() != null) mum.setTypePiece(mere.getTypePiece());
			if(mere.getNumeroPiece() != null) mum.setNumeroPiece(mere.getNumeroPiece());
			if(mere.getDateNaiss() != null) mum.setDateNaiss(mere.getDateNaiss());
			if(mere.getLieuNaiss() != null) mum.setLieuNaiss(mere.getLieuNaiss());
			
			mereRepository.save(mum);
			
			return "Modification reussie";
		}
		else {
			return "Pere introuvable";
		}
	}
	

}

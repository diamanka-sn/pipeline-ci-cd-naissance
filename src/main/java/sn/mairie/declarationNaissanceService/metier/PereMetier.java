package sn.mairie.declarationNaissanceService.metier;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NoArgsConstructor;
import sn.mairie.declarationNaissanceService.entities.Pere;
import sn.mairie.declarationNaissanceService.repositories.PereRepository;




@Service
@Data 
public class PereMetier implements IPereMetier{

	@Autowired
	private PereRepository pereRepository;
	
	@Override
	public Pere savePere(Pere p) {
		// TODO Auto-generated method stub
		return pereRepository.save(p);
	}
	
	public List<Pere> listPeres(){
		return pereRepository.findAll();
	}
	
	

	@Override
	public String remove(Long id) {
		pereRepository.deleteById(id);
		return "Pere supprimé";
	}

	@Override
	public Pere search(Long id) {
		return pereRepository.findById(id).get();
	}


	@Override
	public String update(Long id, Pere pere) {
		
		Pere dad = pereRepository.findById(id).get();
		
		if(dad != null) {
			if(pere.getNom() != null) dad.setNom(pere.getNom());
			if(pere.getPrenom() != null) dad.setPrenom(pere.getPrenom());
			if(pere.getProfession() != null) dad.setProfession(pere.getProfession());
			if(pere.getAdresse() != null) dad.setAdresse(pere.getAdresse());
			if(pere.getTypePiece() != null) dad.setTypePiece(pere.getTypePiece());
			if(pere.getNumeroPiece() != null) dad.setNumeroPiece(pere.getNumeroPiece());
			if(pere.getDateNaiss() != null) dad.setDateNaiss(pere.getDateNaiss());
			if(pere.getLieuNaiss() != null) dad.setLieuNaiss(pere.getLieuNaiss());
			pereRepository.save(dad);
			
			return "Modification reussie";
		}
		else {
			return "Pere introuvable";
		}
	}

}

package sn.mairie.declarationNaissanceService;

import java.sql.Time;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import sn.mairie.declarationNaissanceService.entities.Declarant;
import sn.mairie.declarationNaissanceService.entities.Declare;
import sn.mairie.declarationNaissanceService.entities.Mere;
import sn.mairie.declarationNaissanceService.entities.Pere;
import sn.mairie.declarationNaissanceService.entities.Temoin;
import sn.mairie.declarationNaissanceService.repositories.DeclarantRepository;
import sn.mairie.declarationNaissanceService.repositories.DeclareRepository;
import sn.mairie.declarationNaissanceService.repositories.MereRepository;
import sn.mairie.declarationNaissanceService.repositories.PereRepository;
import sn.mairie.declarationNaissanceService.repositories.TemoinRepository;




@SpringBootApplication 
@ComponentScan(basePackages = "sn.mairie.declarationNaissanceService.entities, "+"sn.mairie.declarationNaissanceService.metier, "+"sn.mairie.declarationNaissanceService.repositories, "+"sn.mairie.declarationNaissanceService.web ")
public class MicroServiceDeclarationNaissanceApplication implements CommandLineRunner{
	
	@Autowired
	private PereRepository pereRepository;
	@Autowired
	private MereRepository mereRepository;
	@Autowired
	private TemoinRepository temoinRepositrory;
	@Autowired
	private DeclarantRepository declarantRepository;
	@Autowired
	private DeclareRepository declareRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceDeclarationNaissanceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Pere pere=pereRepository.save(new Pere(null,"Niang","Yero","20170777","Ingenieur","Goumel",new Date(),"Kolda"));
//		Pere pere1=pereRepository.save(new Pere(null,"SAGNA","Moussa","20170777","Ingenieur","Goumel",new Date(),"Kolda"));
//		
//		Mere mere=mereRepository.save(new Mere(null,"Niang","LOBE","20170777","Ingenieur","Goumel",new Date(),"Kolda"));
//		Mere mere1=mereRepository.save(new Mere(null,"THIAM","Maty","20170777","Ingenieur","Goumel",new Date(),"Kolda"));
////		
//		Temoin temoin = temoinRepositrory.save(new Temoin(null, "Toure", "Saliou", "3452862917", "Ingenieur", "Lyndiane"));
//		Temoin temoin1 = temoinRepositrory.save(new Temoin(null, "Diallo", "Moussa", "672538228", "Ingenieur", "Kenia"));
//	
//		Declarant declarant = declarantRepository.save(new Declarant(null, "Balde", "Mody", "4256835382", "Oncle", "Diabir"));
//		Declarant declarant1 = declarantRepository.save(new Declarant(null, "SAGNA", "Moussa", "4272965242", "Pere", "Kandialang"));
//		 
//		Declare declare = declareRepository.save(new Declare(null, "Mouhamad", new Date(), new Time(22, 45, 0), "Ziguinchor", "Masculin"));
//		Declare declare1 = declareRepository.save(new Declare(null, "Allou", new Date(), new Time(14, 00, 0), "Mbour", "Masculin"));
	}
	
	
}

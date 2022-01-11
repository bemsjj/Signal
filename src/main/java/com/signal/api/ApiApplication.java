package com.signal.api;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.signal.api.repositories.RegionRepository;
import com.signal.api.model.RegionModel;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {
	
	@Autowired
	RegionRepository regionRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		RegionModel d = new RegionModel("Diana",-13.2043844,49.1111434);
		RegionModel diana = regionRepository.findByNomRegion("Diana");
		if(diana == null) {
			regionRepository.save(d);
			System.out.println("Diana saved");
		}
		
		RegionModel s = new RegionModel("Sava",-14.2938722,49.7734024);
		RegionModel Sava = (RegionModel) regionRepository.findByNomRegion("Sava");
		if(Sava == null) {
			regionRepository.save(s);
		}
		
		RegionModel i = new RegionModel("Itasy",-19.0535322,46.9922011);
		RegionModel Itasy = (RegionModel) regionRepository.findByNomRegion("Itasy");
		if(Itasy == null) {
			regionRepository.save(i);
		}
		
		RegionModel an = new RegionModel("Analamanga",-18.6000004,47.5131002);
		RegionModel Analamanga = regionRepository.findByNomRegion("Analamanga");
		if(Analamanga == null) {
			regionRepository.save(an);
		}
		
		RegionModel vak = new RegionModel("Vakinankaratra",-19.7113095,46.8355481);
		RegionModel Vakinankaratra = regionRepository.findByNomRegion("Vakinankaratra");
		if(Vakinankaratra == null) {
			regionRepository.save(vak);
		}
		
		RegionModel b = new RegionModel("Bongolava",-18.5916863,46.3078167);
		RegionModel Bongolava = regionRepository.findByNomRegion("Bongolava");
		if(Bongolava == null) {
			regionRepository.save(b);
		}
		
		RegionModel sof = new RegionModel("Sofia",-15.2538402,48.2562163);
		RegionModel Sofia = regionRepository.findByNomRegion("Sofia");
		if(Sofia == null) {
			regionRepository.save(sof);
		}
		
		RegionModel boe = new RegionModel("Boeny",-16.2349278,46.1292672);
		RegionModel Boeny = regionRepository.findByNomRegion("Diana");
		if(Boeny == null) {
			regionRepository.save(boe);
		}
		
		RegionModel bets = new RegionModel("Betsiboka",-17.095744,47.2600709);
		RegionModel Betsiboka = regionRepository.findByNomRegion("Betsiboka");
		if(Betsiboka == null) {
			regionRepository.save(bets);
		}
		
		RegionModel mel = new RegionModel("Melaky",-17.7541481,44.9790052);
		RegionModel Melaky = regionRepository.findByNomRegion("Melaky");
		if(Melaky == null) {
			regionRepository.save(mel);
		}
		
		RegionModel al = new RegionModel("Alaotra-Mangoro",-18.0186831,48.3549363);
		RegionModel Alaotra_Mangoro = regionRepository.findByNomRegion("Alaotra-Mangoro");
		if(Alaotra_Mangoro == null) {
			regionRepository.save(al);
		}
		
		RegionModel ants = new RegionModel("Antsinanana",-18.9771559,48.8742141);
		RegionModel Antsinanana = regionRepository.findByNomRegion("Antsinanana");
		if(Antsinanana == null) {
			regionRepository.save(ants);
		}
		
		
		RegionModel anal = new RegionModel("Analanjirofo",-16.317265,49.491491);
		RegionModel Analanjirofo = regionRepository.findByNomRegion("Analanjirofo");
		if(Analanjirofo == null) {
			regionRepository.save(anal);
		}
		
		RegionModel am = new RegionModel("Amoron'i Mania",-20.4591292,46.7263922);
		RegionModel Amoron_i_Mania = regionRepository.findByNomRegion("Amoron'i Mania");
		if(Amoron_i_Mania == null) {
			regionRepository.save(am);
		}
		
		RegionModel hau = new RegionModel("Haute Matsiatra",-21.4690638,46.4663496);
		RegionModel Haute_Matsiatra = regionRepository.findByNomRegion("Haute Matsiatra");
		if(Haute_Matsiatra == null) {
			regionRepository.save(hau);
		}
		
		RegionModel vatF = new RegionModel("Vatovavy Fitovinany",-21.2660334,47.8637087);
		RegionModel Vatovavy_Fitovinany = regionRepository.findByNomRegion("Vatovavy Fitovinany");
		if(Vatovavy_Fitovinany == null) {
			regionRepository.save(vatF);
		}
		
		RegionModel AtsA = new RegionModel("Atsimo-Atsinanana",-23.2235237,47.2835176);
		RegionModel Atsimo_Atsinanana = regionRepository.findByNomRegion("Atsimo-Atsinanana");
		if(Atsimo_Atsinanana == null) {
			regionRepository.save(AtsA);
		}
		
		RegionModel ih = new RegionModel("Ihorombe",-22.6327896,46.0995658);
		RegionModel Ihorombe = regionRepository.findByNomRegion("Ihorombe");
		if(Ihorombe == null) {
			regionRepository.save(ih);
		}
		
		RegionModel men = new RegionModel("Menambe",-20.0355933,45.1084888);
		RegionModel Menambe = regionRepository.findByNomRegion("Menambe");
		if(Menambe == null) {
			regionRepository.save(men);
		}
		
		RegionModel AtsAn = new RegionModel("Atsimo-Andrefana",-23.0907053,44.4013326);
		RegionModel Atsimo_Andrefana = regionRepository.findByNomRegion("Atsimo-Andrefana");
		if(Atsimo_Andrefana == null) {
			regionRepository.save(AtsAn);
		}
		
		RegionModel Andr = new RegionModel("Androy",-24.6805968,45.5243806);
		RegionModel Androy = regionRepository.findByNomRegion("Androy");
		if(Androy == null) {
			regionRepository.save(Andr);
		}
		
		RegionModel Ans = new RegionModel("Anosy",-24.0624748,46.2617665);
		RegionModel Anosy = regionRepository.findByNomRegion("Anosy");
		if(Anosy == null) {
			regionRepository.save(Ans);
		}
		
	}

}

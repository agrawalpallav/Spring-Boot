package com.org.springJPA003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springJPA003.repo.MobileRepo;
import com.org.springJPA003.repo.SimRepo;

@RestController
public class MobileController {
	@Autowired
	MobileRepo mobileRepo;
	
	@Autowired
	SimRepo simRepo;
	
	@PostMapping("/mobile")
	public String saveMobileAndSim(@RequestBody Mobile m) {
		simRepo.saveAll(m.getSims());
		mobileRepo.save(m);
		return "sccucess";
	}
}

package com.org.springJPA003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springJPA003.repo.CmRepo;
import com.org.springJPA003.repo.StateRepo;

@RestController
public class StateAndCmController {
	@Autowired
	CmRepo cmRepo;
	
	@Autowired
	StateRepo stateRepo;
	
	@PostMapping("/state")
	public String saveStateAndCm(@RequestBody State s) {
		cmRepo.save(s.getCm());
		stateRepo.save(s);
		return "sccucess";
	}
	

}

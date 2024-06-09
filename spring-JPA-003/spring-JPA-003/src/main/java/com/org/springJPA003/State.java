package com.org.springJPA003;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
	@Id
	private int sid;
	private String sname;
	private String capital;
	@OneToOne(cascade = CascadeType.ALL)
	private CM cm;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public CM getCm() {
		return cm;
	}

	public void setCm(CM cm) {
		this.cm = cm;
	}
	
	
}

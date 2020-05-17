package com.restapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@Column(length =30)
	private String name;
	private String team;
	private String dob;
	private Integer noOf4;
	private Integer noOf6;
	private Integer others;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Integer getNoOf4() {
		return noOf4;
	}
	public void setNoOf4(Integer noOf4) {
		this.noOf4 = noOf4;
	}
	public Integer getNoOf6() {
		return noOf6;
	}
	public void setNoOf6(Integer noOf6) {
		this.noOf6 = noOf6;
	}
	public Integer getOthers() {
		return others;
	}
	public void setOthers(Integer others) {
		this.others = others;
	}
	public Player() {
		
	}
	public Player(String name, String team, String dob, Integer noOf4, Integer noOf6, Integer others) {
		super();
		this.name = name;
		this.team = team;
		this.dob = dob;
		this.noOf4 = noOf4;
		this.noOf6 = noOf6;
		this.others = others;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", team=" + team + ", dob=" + dob + ", noOf4=" + noOf4 + ", noOf6=" + noOf6
				+ ", others=" + others + "]";
	}
	
	

}

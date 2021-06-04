package com.devsuperior.dsClient.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dsClient.entities.Client;

public class ClientDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;	
	private String Name;
	private String Cpf;
	private Double Income;
	private Instant BirthDate;
	private Integer Children;
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String cpf, Double income, Instant birthDate, Integer children) {
		this.id = id;
		Name = name;
		Cpf = cpf;
		Income = income;
		BirthDate = birthDate;
		Children = children;
	}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		Name = entity.getName();
		Cpf = entity.getCpf();
		Income = entity.getIncome();
		BirthDate = entity.getBirthDate();
		Children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public Double getIncome() {
		return Income;
	}

	public void setIncome(Double income) {
		Income = income;
	}

	public Instant getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Instant birthDate) {
		BirthDate = birthDate;
	}

	public Integer getChildren() {
		return Children;
	}

	public void setChildren(Integer children) {
		Children = children;
	}

}

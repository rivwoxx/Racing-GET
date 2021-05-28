package com.rivwox.racing.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "monaco")
public class MonacoGPWinners {

	@Id
	@Column(name = "year")
	private Long year;

	@Column(name = "driver")
	private String driver;

	@Column(name = "team")
	private String team;
}

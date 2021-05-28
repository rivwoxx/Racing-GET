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
@Table(name = "indy500")
public class Indy500Winners {
	@Id
	@Column(name = "year")
	private Long year;

	@Column(name = "driver")
	private String driver;

	@Column(name = "team")
	private String team;

	@Column(name = "chasis")
	private String chasis;

	@Column(name = "engine")
	private String engine;

	@Column(name = "laps")
	private Long laps;

	@Column(name = "miles")
	private Long miles;

	@Column(name = "avespeed")
	private String avespeed;

	@Column(name = "carnum")
	private Long carnum;
}

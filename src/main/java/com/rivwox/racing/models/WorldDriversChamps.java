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
@Table(name = "wdc")
public class WorldDriversChamps {
	@Id
	@Column(name = "year")
	private Long year;

	@Column(name = "driver")
	private String driver;

	@Column(name = "age")
	private Long age;

	@Column(name = "chasis")
	private String chasis;

	@Column(name = "engine")
	private String engine;

	@Column(name = "poles")
	private Long poles;

	@Column(name = "wins")
	private Long wins;

	@Column(name = "podiums")
	private Long podiums;

	@Column(name = "flaps")
	private Long flaps;

	@Column(name = "points")
	private Float points;

	@Column(name = "country")
	private String country;
}

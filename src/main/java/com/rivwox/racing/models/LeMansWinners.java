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
@Table(name = "lemans")
public class LeMansWinners {
	@Id
	@Column(name = "year")
	private Long year;

	@Column(name = "drivers")
	private String drivers;

	@Column(name = "team")
	private String team;

	@Column(name = "car")
	private String car;

	@Column(name = "laps")
	private Long laps;

	@Column(name = "distance")
	private String distance;
}

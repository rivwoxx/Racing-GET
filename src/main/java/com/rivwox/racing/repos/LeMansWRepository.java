package com.rivwox.racing.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rivwox.racing.models.LeMansWinners;


public interface LeMansWRepository extends CrudRepository<LeMansWinners, Long>{
	public List<Object[]> getbyYear(Long year);
	public List<Object[]> lemansWinsFull();
}

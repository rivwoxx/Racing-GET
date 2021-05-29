package com.rivwox.racing.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rivwox.racing.models.WorldConstructorsChamps;

@Repository
public interface WCCRepository extends CrudRepository<WorldConstructorsChamps, Long> {
	public List<Object[]> getbyYear(Long year);
	public List<Object[]> getbyChasisEngine(String chasis, String engine);
	public List<Object[]> getbyChasisEngineWins(String chasis, String engine, Long wins);
	public List<Object[]> getWCCFull();
}
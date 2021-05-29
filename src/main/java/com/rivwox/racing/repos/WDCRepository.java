package com.rivwox.racing.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rivwox.racing.models.WorldDriversChamps;

@Repository
public interface WDCRepository extends CrudRepository<WorldDriversChamps,Long>{
	
	public List<Object[]> getbyYear(Long year);
	public List<Object[]> getChampsbyCountry(String country);
	public List<Object[]> getChampsbyContructorChasiscombList(String chasis, String engine);
	public List<Object[]> getChampsbyDriver(String driver);
	public List<Object[]> getChampsFull();
}

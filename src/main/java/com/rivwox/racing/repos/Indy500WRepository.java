package com.rivwox.racing.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rivwox.racing.models.Indy500Winners;

public interface Indy500WRepository extends CrudRepository<Indy500Winners,Long>{
	public List<Object[]> getbyYear(Long year);
	public List<Object[]> getbyDriver(String driver);
	public List<Object[]> getbyChasisEngine(String chasis, String engine);
	public List<Object[]> getbymiles(Long miles);
	public List<Object[]> indyWinsFull();
	
}

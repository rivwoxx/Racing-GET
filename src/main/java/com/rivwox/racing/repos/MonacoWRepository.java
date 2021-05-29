package com.rivwox.racing.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rivwox.racing.models.MonacoGPWinners;


@Repository
public interface MonacoWRepository extends CrudRepository<MonacoGPWinners,Long>{
	public List<Object[]> getbyYear(Long year);
}

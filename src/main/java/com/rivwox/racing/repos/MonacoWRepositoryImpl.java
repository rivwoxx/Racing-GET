package com.rivwox.racing.repos;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.rivwox.racing.models.MonacoGPWinners;

public class MonacoWRepositoryImpl implements MonacoWRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public <S extends MonacoGPWinners> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MonacoGPWinners> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MonacoGPWinners> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<MonacoGPWinners> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<MonacoGPWinners> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MonacoGPWinners entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends MonacoGPWinners> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object[]> getbyYear(Long year) {
		Query qy = em.createNativeQuery("SELECT * FROM monaco WHERE year=?");
		qy.setParameter(1, year);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getMonacoFull() {
		Query qy = em.createNativeQuery("SELECT * FROM monaco");
		List<Object[]> list = qy.getResultList();
		return list;
	}

}

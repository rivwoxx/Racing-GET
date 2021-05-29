package com.rivwox.racing.repos;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.rivwox.racing.models.LeMansWinners;

public class LeMansWRepositoryImpl implements LeMansWRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public <S extends LeMansWinners> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends LeMansWinners> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<LeMansWinners> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<LeMansWinners> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<LeMansWinners> findAllById(Iterable<Long> ids) {
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
	public void delete(LeMansWinners entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends LeMansWinners> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Object[]> getbyYear(Long year) {
		Query qy = em.createNativeQuery("SELECT * FROM lemans WHERE year=?");
		qy.setParameter(1, year);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> lemansWinsFull() {
		Query qy = em.createNativeQuery("SELECT * FROM lemans");
		List<Object[]> list = qy.getResultList();
		return list;
	}

}

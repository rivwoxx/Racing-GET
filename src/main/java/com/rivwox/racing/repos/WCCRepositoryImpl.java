package com.rivwox.racing.repos;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.rivwox.racing.models.WorldConstructorsChamps;

public class WCCRepositoryImpl implements WCCRepository{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public <S extends WorldConstructorsChamps> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends WorldConstructorsChamps> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<WorldConstructorsChamps> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<WorldConstructorsChamps> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<WorldConstructorsChamps> findAllById(Iterable<Long> ids) {
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
	public void delete(WorldConstructorsChamps entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends WorldConstructorsChamps> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object[]> getbyYear(Long year) {
		Query qy = em.createNativeQuery("SELECT * FROM wcc WHERE year=?");
		qy.setParameter(1, year);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getbyChasisEngine(String chasis, String engine) {
		Query qy = em.createNativeQuery("SELECT * FROM wcc WHERE chasis=? AND engine=?");
		qy.setParameter(1, chasis);
		qy.setParameter(2, engine);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getbyChasisEngineWins(String chasis, String engine, Long wins) {
		Query qy = em.createNativeQuery("SELECT * FROM wcc WHERE chasis=? AND engine=? AND wins");
		qy.setParameter(1, chasis);
		qy.setParameter(2, engine);
		qy.setParameter(3, wins);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getWCCFull() {
		Query qy = em.createNativeQuery("SELECT * FROM wcc");
		List<Object[]> list = qy.getResultList();
		return list;
	}

}

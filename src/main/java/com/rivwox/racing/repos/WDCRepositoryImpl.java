package com.rivwox.racing.repos;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.rivwox.racing.models.WorldDriversChamps;

public class WDCRepositoryImpl implements WDCRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public <S extends WorldDriversChamps> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends WorldDriversChamps> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<WorldDriversChamps> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<WorldDriversChamps> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<WorldDriversChamps> findAllById(Iterable<Long> ids) {
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
	public void delete(WorldDriversChamps entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends WorldDriversChamps> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object[]> getbyYear(Long year) {
		Query qy = em.createNativeQuery("SELECT * FROM wdc WHERE year=?");
		qy.setParameter(1, year);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getChampsbyCountry(String country) {
		Query qy = em.createNativeQuery("SELECT * FROM wdc WHERE country=?");
		qy.setParameter(1, country);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getChampsbyContructorChasiscombList(String chasis, String engine) {
		Query qy = em.createNativeQuery("SELECT * FROM wdc WHERE chasis=? and engine=?");
		qy.setParameter(1, chasis);
		qy.setParameter(2, engine);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getChampsbyDriver(String driver) {
		Query qy = em.createNativeQuery("SELECT * FROM wdc WHERE driver=?");
		qy.setParameter(1, driver);
		List<Object[]> list = qy.getResultList();
		return list;
	}

}

package com.rivwox.racing.repos;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.rivwox.racing.models.Indy500Winners;

public class Indy500WRepositoryImpl implements Indy500WRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public <S extends Indy500Winners> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Indy500Winners> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Indy500Winners> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Indy500Winners> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Indy500Winners> findAllById(Iterable<Long> ids) {
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
	public void delete(Indy500Winners entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Indy500Winners> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object[]> getbyYear(Long year) {
		Query qy = em.createNativeQuery("SELECT * FROM indy500 WHERE year=?");
		qy.setParameter(1, year);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getbyDriver(String driver) {
		Query qy = em.createNativeQuery("SELECT * FROM indy500 WHERE driver=?");
		qy.setParameter(1, driver);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getbyChasisEngine(String chasis, String engine) {
		Query qy = em.createNativeQuery("SELECT * FROM indy500 WHERE chasis=? AND engine=?");
		qy.setParameter(1, chasis);
		qy.setParameter(2, engine);
		List<Object[]> list = qy.getResultList();
		return list;
	}

	@Override
	public List<Object[]> getbymiles(Long miles) {
		if (miles > 499) {
			Query qy = em.createNativeQuery("SELECT * FROM indy500 WHERE miles>?");
			qy.setParameter(1, miles);
			List<Object[]> list = qy.getResultList();
			return list;
		}else {
			Query qy = em.createNativeQuery("SELECT * FROM indy500 WHERE miles<?");
			qy.setParameter(1, miles);
			List<Object[]> list = qy.getResultList();
			return list;
		}
	}

	@Override
	public List<Object[]> indyWinsFull() {
		Query qy = em.createNativeQuery("SELECT * FROM indy500");
		List<Object[]> list = qy.getResultList();
		return list;
	}

}

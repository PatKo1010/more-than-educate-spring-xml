package web.reserv.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.reserv.dao.ReservDaoInterface;
import web.reserv.entity.ReservTimeBean;
import web.reserv.service.ReservServiceInterface;

@Service
@Transactional
public class ReservServiceImpl implements ReservServiceInterface {
	
	@Autowired
	private ReservDaoInterface dao;
	
	@Autowired
	private String s;
	
	
	@Override
	public ReservTimeBean select(Integer id) {
		System.out.println(s);
		return dao.select(id);
	}
	
}

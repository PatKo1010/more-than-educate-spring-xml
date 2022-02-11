package web.reserv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.reserv.entity.ReservTimeBean;
import web.reserv.service.ReservServiceInterface;

@RestController
@RequestMapping("reserv")
public class ReservController {
	@Autowired
	private ReservServiceInterface service;
	
	@GetMapping("selectById")
	public ReservTimeBean selectByID(Integer id) {
		return service.select(id);
	}
	
	@PostMapping("selectByPost")
	public ReservTimeBean selectBtPost (Integer id) {
		return service.select(id);
	}
}

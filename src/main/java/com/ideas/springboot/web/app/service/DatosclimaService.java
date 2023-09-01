package com.ideas.springboot.web.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas.springboot.web.app.service.dto.team.Datosclima;
import com.ideas.springboot.web.app.service.dto.team.DatosclimaRepository;
import com.ideas.springboot.web.app.service.dto.team.TeamResponse;





@Service
public class DatosclimaService {

	@Autowired
	private DatosclimaRepository datosclimaRepository;


	public Datosclima create (TeamResponse respuesta) {
		Datosclima datosClima = new Datosclima();
		datosClima.setName(respuesta.getLocation().getName());
		datosClima.setCountry(respuesta.getLocation().getCountry());
		datosClima.setRegion(respuesta.getLocation().getRegion());
		datosClima.setTemp_C(respuesta.getCurrent().getTemp_c());
		datosClima.setTemp_f(respuesta.getCurrent().getTemp_f());


		return datosclimaRepository.save(datosClima);
	}


}
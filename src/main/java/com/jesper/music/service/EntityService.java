package com.jesper.music.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EntityService {
	
	private static final Logger logger = LoggerFactory.getLogger(EntityService.class);
	
	@PersistenceContext
	EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}


}

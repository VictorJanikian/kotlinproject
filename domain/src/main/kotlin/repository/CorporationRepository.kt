package repository

import entity.Corporation

interface CorporationRepository{

	fun save(bean: Corporation): String
	
	fun update(value: Corporation): Boolean
	
	fun remove(corporationId: String): Boolean
	
	fun fetchById(corporationId: String): Corporation?
	
	fun fetchByDocuments(document: String): Corporation?
	}
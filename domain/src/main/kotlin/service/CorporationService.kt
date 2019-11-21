package service

import entity.Corporation
import repository.CorporationRepository

class CorporationService(val repository: CorporationRepository) {

    fun createCorporation(value: Corporation) {
        repository.save(value)
    }

    fun searchCorporationById(value: String) {
        repository.fetchById(value)
    }

    fun searchCorporationByDocument(value: String){
        repository.fetchByDocuments(value)
    }

    fun updateCorporation(value: Corporation) {
        val corporation = searchCorporationById(value.id)
        if (corporation != null) updateCorporation(value) else print("Can't perform this operation")
    }

    fun removeCorporation(value: String){
        removeCorporation(value)
    }

}
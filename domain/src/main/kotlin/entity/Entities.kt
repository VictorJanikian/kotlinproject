package entity

import java.util.*

data class Corporation(val id: String,
                       val name: String,
                       val document: String,
                       val contact: String
) {
    lateinit var email: String
    lateinit var phone: String
    var active: Boolean = false
    lateinit var createdAt: Date
    lateinit var updateAt: Date
}
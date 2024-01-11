package com.evdokimov.data.storage

import com.evdokimov.data.storage.models.User

interface UserStorage {
    fun save(user: User): Boolean
    fun get(): User
}
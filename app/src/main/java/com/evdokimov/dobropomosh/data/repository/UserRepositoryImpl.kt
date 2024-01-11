package com.evdokimov.data.repository

import com.evdokimov.data.storage.UserStorage
import com.evdokimov.data.storage.models.User
import com.evdokimov.domain.models.SaveParam
import com.evdokimov.domain.models.UserName
import com.evdokimov.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {
    override fun saveName(saveParam: SaveParam): Boolean {
        val user = User(firstName = saveParam.name, lastName = "")
        var result: Boolean = userStorage.save(user)
        return result
    }

    override fun getName(): UserName {
        val user: User = userStorage.get()
        return UserName(user.firstName, user.lastName)
    }

}
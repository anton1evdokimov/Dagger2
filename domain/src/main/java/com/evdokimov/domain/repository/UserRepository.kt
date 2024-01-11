package com.evdokimov.domain.repository

import com.evdokimov.domain.models.SaveParam
import com.evdokimov.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveParam): Boolean

    fun getName(): UserName
}
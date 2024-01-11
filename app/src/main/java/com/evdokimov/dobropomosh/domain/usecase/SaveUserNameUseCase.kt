package com.evdokimov.domain.usecase

import com.evdokimov.domain.models.SaveParam
import com.evdokimov.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {
    fun execute(saveParam: SaveParam): Boolean {
        return userRepository.saveName(saveParam)
    }
}
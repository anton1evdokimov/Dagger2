package com.evdokimov.domain.usecase

import com.evdokimov.domain.models.UserName
import com.evdokimov.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {
    fun execute(): UserName {
        return userRepository.getName()
    }
}
package com.evdokimov.dobropomosh.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.evdokimov.domain.usecase.GetUserNameUseCase
import com.evdokimov.domain.usecase.SaveUserNameUseCase

class MainViewModalFactory(
    private val getUserNameUseCase: GetUserNameUseCase,
    private val saveUserNameUseCase: SaveUserNameUseCase,
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModal(getUserNameUseCase, saveUserNameUseCase) as T
    }
}
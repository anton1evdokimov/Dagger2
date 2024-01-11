package com.evdokimov.dobropomosh.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evdokimov.domain.models.SaveParam
import com.evdokimov.domain.usecase.GetUserNameUseCase
import com.evdokimov.domain.usecase.SaveUserNameUseCase

class MainViewModal(private val getUserNameUseCase: GetUserNameUseCase, private val saveUserNameUseCase: SaveUserNameUseCase) : ViewModel() {

    private var _resultLive = MutableLiveData<String>()
    val resultLive: LiveData<String> = _resultLive

    init {
        Log.d("AAA", "init MainViewModal")
    }

    fun save(text: String) {
        _resultLive.value = text
        saveUserNameUseCase.execute(saveParam = com.evdokimov.domain.models.SaveParam(text))
    }

    fun load() {
        val user = getUserNameUseCase.execute()
        _resultLive.value = "${user.firstName} ${user.lastName}"
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("AAA", "init onCleared")
    }
}
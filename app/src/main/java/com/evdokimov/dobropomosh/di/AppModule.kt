package com.evdokimov.dobropomosh.di

import android.content.Context
import com.evdokimov.dobropomosh.presentation.MainViewModalFactory
import com.evdokimov.domain.usecase.GetUserNameUseCase
import com.evdokimov.domain.usecase.SaveUserNameUseCase
import dagger.Module
import dagger.Provides

@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideMainViewModalFactory(
        getUserNameUseCase: GetUserNameUseCase,
        saveUserNameUseCase: SaveUserNameUseCase,
    ): MainViewModalFactory {
        return MainViewModalFactory(getUserNameUseCase, saveUserNameUseCase)
    }
}
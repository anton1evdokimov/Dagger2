package com.evdokimov.dobropomosh.di

import android.content.Context
import com.evdokimov.data.repository.UserRepositoryImpl
import com.evdokimov.data.storage.UserStorage
import com.evdokimov.data.storage.sharedprefs.SharedPrefUserStorage
import com.evdokimov.domain.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule  {
    @Provides
    fun providerUserStorage(context: Context): UserStorage {
        return SharedPrefUserStorage(context = context)
    }

    @Provides
    fun providerUserRepository(userStorage: UserStorage):UserRepository {
        return UserRepositoryImpl(userStorage = userStorage)
    }
}
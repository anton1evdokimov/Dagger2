package com.evdokimov.dobropomosh.di

import com.evdokimov.dobropomosh.presentation.MainActivity
import dagger.Component

@Component(modules = [AppModule::class, DataModule::class, DomainModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}
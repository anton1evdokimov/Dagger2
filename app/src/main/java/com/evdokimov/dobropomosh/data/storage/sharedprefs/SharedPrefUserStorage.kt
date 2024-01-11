package com.evdokimov.data.storage.sharedprefs

import android.content.Context
import com.evdokimov.data.storage.UserStorage
import com.evdokimov.data.storage.models.User

const val SHARED_PREFS_NAME = "SHARED_PREFS_NAME"
const val FIRST_NAME_KEY = "FIRST_NAME_KEY"
const val LAST_NAME_KEY = "LAST_NAME_KEY"
const val DEFAULT_FIRST_NAME = "DEFAULT_FIRST_NAME"
const val DEFAULT_LAST_NAME = "DEFAULT_LAST_NAME"
class SharedPrefUserStorage(context: Context): UserStorage {

    private val sharedPref = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)
    override fun save(user: User): Boolean {
        sharedPref.edit().putString(FIRST_NAME_KEY, user.firstName)
//        sharedPref.edit().putString(LAST_NAME_KEY, "user.lastName")
        sharedPref.edit().putInt(LAST_NAME_KEY, 33)
        val res = sharedPref.edit().commit()
        return res
    }

    override fun get(): User {
        val iii = sharedPref.getInt(LAST_NAME_KEY, 50)
        val firstName = sharedPref.getString(FIRST_NAME_KEY, DEFAULT_FIRST_NAME) ?: DEFAULT_FIRST_NAME
        val lastName = sharedPref.getString(LAST_NAME_KEY, DEFAULT_LAST_NAME) ?: DEFAULT_LAST_NAME
        return User(firstName, lastName)
    }
}
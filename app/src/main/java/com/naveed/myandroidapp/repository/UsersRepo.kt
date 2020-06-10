package com.naveed.myandroidapp.repository


import com.naveed.myandroidapp.realm.RealmManager
import com.naveed.myandroidapp.model.User

class UsersRepo {

    private val realmManager = RealmManager()

    /**
     * Adds the User to Realm DB
     */
    fun createUser(model: User) {
        realmManager.add(model)
    }

    /**
     * Fetches Users from Realm DB
     */
    fun getUser(name:String, password:String): List<User> {
        return realmManager.findAll<User>(name, password)
    }

}
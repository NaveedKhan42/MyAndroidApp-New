package com.naveed.myandroidapp.realm

import android.app.Application
import android.util.Log
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Application class, to initialize the Realm db only once
 */
class RealmApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("App","OnCreate Called")
        initRealm()
    }

    /**
     * Creates Realm configuration and initializes it.     *
     */
    private fun initRealm(){
        Realm.init(this)
        val config = RealmConfiguration.Builder()
            .name("UsersDB")
            .schemaVersion(1)
            .deleteRealmIfMigrationNeeded()
            .build()

        Realm.setDefaultConfiguration(config)
    }
}
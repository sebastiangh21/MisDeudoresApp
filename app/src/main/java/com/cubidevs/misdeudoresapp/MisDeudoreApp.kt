package com.cubidevs.misdeudoresapp
import android.app.Application
import androidx.room.Room
import com.cubidevs.misdeudoresapp.data.local.DeudoresDatabase

class MisDeudoreApp: Application() {

    companion object{
         lateinit var  database: DeudoresDatabase
    }

    override fun onCreate() {
        super.onCreate()

        val database = Room.databaseBuilder(
            this,
            DeudoresDatabase::class.java,
            "deudor_db"
        ).allowMainThreadQueries()
            .build()
    }
}
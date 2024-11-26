package cl.bootcamp.ejercicioindividual1.room

import androidx.room.Database
import androidx.room.RoomDatabase
import cl.bootcamp.ejercicioindividual1.model.Contacts

@Database(entities = [Contacts::class], version = 1)
abstract class ContactsDatabase: RoomDatabase() {
    abstract fun contactsDao(): ContactsDataBaseDao
}
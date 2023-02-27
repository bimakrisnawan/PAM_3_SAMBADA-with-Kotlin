package edu.uksw.fti.pam.pamactivity.datastore
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class StoreLastName(private val context: Context) {

    // to make sure there is only one instance
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("LastName")
        val USER_LAST_NAME_KEY = stringPreferencesKey("user_last_name")
    }

    // to get the email
    val getLastName: Flow<String?> = context.dataStore.data
        .map { preferences ->
            preferences[USER_LAST_NAME_KEY] ?: ""
        }

    // to save the email
    suspend fun saveLastName(name: String) {
        context.dataStore.edit { preferences ->
            preferences[USER_LAST_NAME_KEY] = name
        }
    }
}
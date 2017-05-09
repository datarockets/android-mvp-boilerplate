package com.chyrta.boilerplate.data.local

import android.content.Context
import android.content.SharedPreferences
import com.chyrta.boilerplate.injection.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesHelper
@Inject constructor(@ApplicationContext val context: Context) {

    private val mPref: SharedPreferences

    init {
        mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun clear() {
        mPref.edit().clear().apply()
    }

    companion object {
        val PREF_FILE_NAME = "boilerplate_pref_file"
    }


}

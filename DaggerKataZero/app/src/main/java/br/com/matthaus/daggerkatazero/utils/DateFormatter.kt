package br.com.matthaus.daggerkatazero.utils

import android.content.Context
import android.text.format.DateFormat
import java.util.*
import javax.inject.Inject

class DateFormatter @Inject constructor(val context: Context) {

    private val dateFormatter = DateFormat.getDateFormat(context)

    fun parseToCalendar(date: String): Date {
        return dateFormatter.parse(date)
    }

}
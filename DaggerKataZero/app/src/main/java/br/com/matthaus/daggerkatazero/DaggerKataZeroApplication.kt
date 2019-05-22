package br.com.matthaus.daggerkatazero

import android.app.Application
import br.com.matthaus.daggerkatazero.di.AppComponent
import br.com.matthaus.daggerkatazero.di.DaggerAppComponent

class DaggerKataZeroApplication : Application() {

    var daggerAppComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        daggerAppComponent = DaggerAppComponent
            .builder()
            .application(this)
            .build()

    }
}
package br.com.matthaus.daggerkatazero.features.secondary_screen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.matthaus.daggerkatazero.DaggerKataZeroApplication
import br.com.matthaus.daggerkatazero.R
import br.com.matthaus.daggerkatazero.network.GithubAPI
import br.com.matthaus.daggerkatazero.utils.DateFormatter
import javax.inject.Inject

class SecondaryActivity : AppCompatActivity() {

    @Inject
    lateinit var api: GithubAPI

    @Inject
    lateinit var dateFormatter: DateFormatter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        injectDagger()
    }

    private fun injectDagger() {
        val application = (application as DaggerKataZeroApplication)
        if (application.daggerAppComponent != null) {
            application.daggerAppComponent!!.inject(this)
        }
    }
}

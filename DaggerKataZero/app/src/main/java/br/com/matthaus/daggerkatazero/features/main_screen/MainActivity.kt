package br.com.matthaus.daggerkatazero.features.main_screen

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.matthaus.daggerkatazero.DaggerKataZeroApplication
import br.com.matthaus.daggerkatazero.R
import br.com.matthaus.daggerkatazero.features.secondary_screen.SecondaryActivity
import br.com.matthaus.daggerkatazero.network.GithubAPI
import br.com.matthaus.daggerkatazero.utils.DateFormatter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var api: GithubAPI

    @Inject
    lateinit var dateFormatter: DateFormatter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDagger()

        button_continue.setOnClickListener {
            startActivity(Intent(this, SecondaryActivity::class.java))
        }

        api.getAllRepositories()
    }

    private fun injectDagger() {
        val application = (getApplication() as DaggerKataZeroApplication)
        if (application.daggerAppComponent != null) {
            application.daggerAppComponent!!.inject(this)
        }
    }
}

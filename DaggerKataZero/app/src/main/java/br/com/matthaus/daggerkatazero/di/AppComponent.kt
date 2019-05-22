package br.com.matthaus.daggerkatazero.di

import android.app.Application
import android.content.Context
import br.com.matthaus.daggerkatazero.features.main_screen.MainActivity
import br.com.matthaus.daggerkatazero.features.secondary_screen.SecondaryActivity
import br.com.matthaus.daggerkatazero.utils.DateFormatter
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = arrayOf(AppModule::class)
)
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(secondaryActivity: SecondaryActivity)

    fun inject(dateFormatter: DateFormatter)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Context) : Builder

        fun build(): AppComponent
    }

}
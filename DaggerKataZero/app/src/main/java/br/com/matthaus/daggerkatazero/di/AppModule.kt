package br.com.matthaus.daggerkatazero.di

import android.content.Context
import br.com.matthaus.daggerkatazero.network.GithubAPI
import br.com.matthaus.daggerkatazero.utils.DateFormatter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun providesGithubAPI(): GithubAPI {
        return GithubAPI()
    }

    @Provides
    @Singleton
    fun providesUtils(context: Context): DateFormatter {
        return DateFormatter(context)
    }

}
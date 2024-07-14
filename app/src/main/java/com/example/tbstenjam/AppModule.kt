package com.example.tbstenjam

import com.example.tbstenjam.core.data.tbsten.TBSTenRepository
import com.example.tbstenjam.core.data.tbsten.TBSTenRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun bindTBSTenRepository(
        impl: TBSTenRepositoryImpl,
    ): TBSTenRepository
}
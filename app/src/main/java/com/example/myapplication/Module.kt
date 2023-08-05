package com.example.myapplication

import com.example.domain.Domain1
import com.example.feature1.Domain1Impl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
interface Module {

    @Binds
    @ViewModelScoped
    fun bind(impl: Domain1Impl): Domain1
}
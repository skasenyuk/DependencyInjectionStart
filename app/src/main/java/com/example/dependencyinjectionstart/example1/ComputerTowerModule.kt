package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerTowerModule {

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }
    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }
    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }
}
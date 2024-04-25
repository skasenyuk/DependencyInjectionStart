package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component(modules = [ComputerModule::class, ComputerTowerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}
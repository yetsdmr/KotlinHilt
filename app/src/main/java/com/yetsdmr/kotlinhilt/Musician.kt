package com.yetsdmr.kotlinhilt

import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
@Singleton
class Musician
@Inject
constructor(instrument: Instrument, band : Band) {
    fun sing() {
        println("working")
    }
}
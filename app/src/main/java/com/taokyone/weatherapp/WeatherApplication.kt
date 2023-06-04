package com.taokyone.weatherapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


// Ties everything together in terms of dependency injection.

@HiltAndroidApp
class WeatherApplication : Application() {
}
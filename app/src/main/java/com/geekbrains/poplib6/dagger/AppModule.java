package com.geekbrains.poplib6.dagger;

import android.app.Application;

import com.geekbrains.poplib6.Green;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Application application;
    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Green provideGreen(){
        return new Green();
    }
}

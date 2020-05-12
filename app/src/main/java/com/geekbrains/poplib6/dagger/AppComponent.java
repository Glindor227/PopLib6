package com.geekbrains.poplib6.dagger;


import com.geekbrains.poplib6.MainActivity;
import com.geekbrains.poplib6.Red;
import com.geekbrains.poplib6.White;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(Red red);
    void inject(White white);
    void inject(MainActivity mainActivity);


}

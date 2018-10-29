package cheng.example.dagger2.mod_dagger2;

import cheng.example.dagger2.mod_dagger2.injects.DaggerMainAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


public class MainApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMainAppComponent.builder().application(this).build();
    }
}
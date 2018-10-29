package cheng.example.dagger2.mod_dagger2.injects;

import android.app.Application;

import javax.inject.Singleton;

import cheng.example.dagger2.mod_dagger2.MainApplication;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {MainActivityBindModule.class,MainAppModule.class,AndroidInjectionModule.class})
public interface MainAppComponent extends AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        MainAppComponent.Builder application(Application application);

        MainAppComponent build();
    }
}

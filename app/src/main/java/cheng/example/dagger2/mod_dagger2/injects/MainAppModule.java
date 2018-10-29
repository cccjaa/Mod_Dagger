package cheng.example.dagger2.mod_dagger2.injects;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainAppModule {
    @Binds
    abstract Context bindContext(Application application);
}

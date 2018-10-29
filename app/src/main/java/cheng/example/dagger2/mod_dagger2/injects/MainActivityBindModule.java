package cheng.example.dagger2.mod_dagger2.injects;

import cheng.example.dagger2.mod_dagger2.MainActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityBindModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

}

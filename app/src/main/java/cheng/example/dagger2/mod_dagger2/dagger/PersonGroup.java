package cheng.example.dagger2.mod_dagger2.dagger;

import dagger.Component;

@Component(modules = PersonModule.class)
public interface PersonGroup {
    Person maker();
}

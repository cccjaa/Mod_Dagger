package cheng.example.dagger2.mod_dagger2.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModule {
    @Provides
    static Header providerHeader() {
        return new Header();
    }

    @Provides
    static Body providerBody() {
        return new Body();
    }
}

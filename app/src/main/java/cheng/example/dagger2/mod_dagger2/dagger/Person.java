package cheng.example.dagger2.mod_dagger2.dagger;

import javax.inject.Inject;

public class Person {
    @Inject
    Body body;
    @Inject
    Header header;

    @Inject
    public Person() {

    }

    public void show(){
        body.show();
        header.show();
    }
}

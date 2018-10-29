package cheng.example.dagger2.mod_dagger2.injects;


import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Person {
    @Inject
    public Person(){

    }
    @Inject
    Body body;
    @Inject
    Header header;

    public void show(){
        body.show();
        header.show();
    }
}

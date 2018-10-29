package cheng.example.dagger2.mod_dagger2.injects;

import javax.inject.Inject;

public class Body {
    @Inject
    public Body() {

    }

    public void show(){
        System.out.println("I am body");
    }
}

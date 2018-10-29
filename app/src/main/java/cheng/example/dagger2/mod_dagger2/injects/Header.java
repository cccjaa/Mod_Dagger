package cheng.example.dagger2.mod_dagger2.injects;

import javax.inject.Inject;

public class Header {
    @Inject
    public Header(){

    }

    public void show(){
        System.out.println("I am Header");
    }
}

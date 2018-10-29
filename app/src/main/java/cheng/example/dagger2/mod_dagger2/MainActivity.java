package cheng.example.dagger2.mod_dagger2;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.DaggerActivity;


public class MainActivity extends DaggerActivity {

    @Inject
    cheng.example.dagger2.mod_dagger2.injects.Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        person.show();

    }
}

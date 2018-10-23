package cheng.example.dagger2.mod_dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import cheng.example.dagger2.mod_dagger2.dagger.DaggerPersonGroup;
import cheng.example.dagger2.mod_dagger2.dagger.Person;
import cheng.example.dagger2.mod_dagger2.dagger.PersonGroup;
import cheng.example.dagger2.mod_dagger2.dagger.PersonModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PersonGroup build = DaggerPersonGroup.builder().build();
        build.maker().show();
        setContentView(R.layout.activity_main);
    }
}

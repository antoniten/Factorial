package program.mycomparator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class Program extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
    }

    ArrayList<Person> person = new ArrayList<Person>();


		Collections.sort(person, Person.NAME_COMPARATOR);
		for(Person p:person)

}

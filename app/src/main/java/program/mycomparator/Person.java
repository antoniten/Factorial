package program.mycomparator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Comparator;

public class Person extends AppCompatActivity {

    private  String name;
    private  String surname;
    private  int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
    }

    public static Comparator<Person> NAME_COMPARATOR = new Comparator<Person>(){
        public int compare(Person o1, Person o2){
            double age1 = o1.getAge();
            double age2 = o2.getAge();

            if(age1 > age2) {
                return 1;
            }
            else if(age1 < age2) {
                return -1;
            }
            else {
                return 0;
            }
        }
    };

    public Person(int age, String name, String surname){
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
    public String toString(){
        return "Person(age = " + this.age+" , name="+
                this.name+" , surname="+
                this.surname+")";
    }
    public String getName(){
        return name;
    }
    public String getSurame(){
        return surname;
    }
    public int getAge(){
        return age;
    }


    String[] catnames = getResources().getStringArray(R.array.pupils);

}




package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeInfo> alEmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.ListViewEmployee);

        alEmployeeList = new ArrayList<>();

        EmployeeInfo item1 = new EmployeeInfo("John","Software Technical Leader", "3400.0");
        EmployeeInfo item2 = new EmployeeInfo("May", "Programmer", "2400.0");
        EmployeeInfo item3 = new EmployeeInfo("James", "Software Engineer", "2200.0");
        EmployeeInfo item4 = new EmployeeInfo("Arthur", "IT Consultant", "2300.0");
        EmployeeInfo item5 = new EmployeeInfo("Max", "Hacker", "2450.0");
        EmployeeInfo item6 = new EmployeeInfo("Jeremy", "IT Security Leader", "2600.0");
        EmployeeInfo item7 = new EmployeeInfo("Felix", "Developer", "3100.0");
        EmployeeInfo item8 = new EmployeeInfo("Dylan", "IT Security Employee", "3100.0");
        EmployeeInfo item9 = new EmployeeInfo("Derrick", "Software Developer", "3100.0");
        EmployeeInfo item10 = new EmployeeInfo("Jason", "IT Management", "3100.0");
        EmployeeInfo item11 = new EmployeeInfo("Chan", "IT Digital Media", "3100.0");
        EmployeeInfo item12 = new EmployeeInfo("Fernando", "Business Law", "3100.0");
        EmployeeInfo item13 = new EmployeeInfo("Johnny", "IT Engineer", "3100.0");
        EmployeeInfo item14 = new EmployeeInfo("English", "Apps Developer", "3100.0");



        alEmployeeList.add(item1);
        alEmployeeList.add(item2);
        alEmployeeList.add(item3);
        alEmployeeList.add(item4);
        alEmployeeList.add(item5);
        alEmployeeList.add(item6);
        alEmployeeList.add(item7);
        alEmployeeList.add(item8);
        alEmployeeList.add(item9);
        alEmployeeList.add(item10);
        alEmployeeList.add(item11);
        alEmployeeList.add(item12);
        alEmployeeList.add(item13);
        alEmployeeList.add(item14);

        caEmployee = new CustomAdapter(this, R.layout.employee_info2, alEmployeeList);
        lvEmployee.setAdapter(caEmployee);
    }
}

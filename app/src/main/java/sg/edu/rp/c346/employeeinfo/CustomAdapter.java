package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17001227 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<EmployeeInfo> employeeList;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<EmployeeInfo> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.employeeList = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvSalary = rowView.findViewById(R.id.tvSalary);

        EmployeeInfo currentItem = employeeList.get(position);
        tvName.setText(currentItem.getEmployeeName());
        tvTitle.setText(currentItem.getEmployeeTitle());
        tvSalary.setText(currentItem.getEmployeeSalary());

        return rowView;

    }


}

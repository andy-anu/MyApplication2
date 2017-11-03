package com.andy.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Anurag on 11/3/2017.
 */

public class BranchFragment extends Fragment {

    private AllListFrags allListFrags;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.branch_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView heading = (TextView) getActivity().findViewById(R.id.heading);
        allListFrags = (AllListFrags) getActivity();
        heading.setText(allListFrags.getBranch());

        ListView branch =(ListView) getActivity().findViewById(R.id.branch_list);
        branch.setAdapter(new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sem_name)));
        branch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(allListFrags, "Hey " + position, Toast.LENGTH_SHORT).show();


            }
        });
    }
    
}

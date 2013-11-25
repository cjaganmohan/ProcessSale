package com.example.processsale;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListItem extends Fragment {
	
	@Override
	
	 public View onCreateView(LayoutInflater inflater, ViewGroup container, 
		        Bundle savedInstanceState) {
		          View view = inflater.inflate(R.layout.item_list, 
		              container, false);
		          //textview = (TextView) view.findViewById(R.id.textView1);
		          return view;
		    }


}

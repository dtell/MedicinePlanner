package se.miun.medicineplanner;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class NewTreatment extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_treatment);
		
		Spinner unitSpinner = (Spinner) findViewById(R.id.spinner_units);

		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.units, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		unitSpinner.setAdapter(adapter);
		
		Spinner intervalsSpinner = (Spinner) findViewById(R.id.spinner_intervals);
		ArrayAdapter<CharSequence> intervalsAdapter = ArrayAdapter.createFromResource(this,
		        R.array.intervals, android.R.layout.simple_spinner_item);
		intervalsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		intervalsSpinner.setAdapter(intervalsAdapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_treatment, menu);
		return true;
	}
	
	public void scheduleTreatment(View view){
		Intent intent = new Intent(this, ScheduleTreatment.class);
		EditText amountField = (EditText) findViewById(R.id.edit_text_amount);
		Spinner unitSpinner = (Spinner) findViewById(R.id.spinner_units);
		 
		intent.putExtra("amount", amountField.getText().toString());
		intent.putExtra("unit", value)
	    startActivity(intent);	  
	}

}

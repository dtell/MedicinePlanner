package se.miun.medicineplanner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ScheduleTreatment extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schedule_treatment);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.schedule_treatment, menu);
		return true;
	}

}

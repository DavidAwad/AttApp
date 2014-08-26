package com.example.attapp2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		
	final Button button = (Button)findViewById(R.id.button1);
	final MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.beep); 
	final TextView myText= (TextView)findViewById(R.id.textResult);
	button.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			mp.start();
			myText.setText(R.string.warning);
		
		}
	  }) ;
	}			
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}

package com.example.ktoolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class MainActivity extends ActionBarActivity {

	@SuppressLint("ResourceAsColor")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		setSupportActionBar toolbar=new Toolbar(getParent());
//		getActionBar().
		Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
//		toolbar.setLogo(R.drawable.ic_launcher);
		toolbar.setTitleTextColor( R.color.background_material_dark);
//		toolbar.setTitleTextAppearance(context, resId);
		toolbar.setNavigationIcon(R.drawable.ic_launcher);
//		toolbar.set
//		toolbar.setSubtitle("dddddddddddddd");
		toolbar.getMeasuredWidth();
//		toolbar.setti
		View v=findViewById(R.id.action_bar
				);
//		new MenuBuilder(getApplicationContext()).
//		toolbar.setMenu(menu, outerPresenter);
	
//		v.setOnClickListener((v)->c);
		 
		setSupportActionBar(toolbar);
		toolbar.setMotionEventSplittingEnabled(true);
		toolbar.setMinimumHeight(getSupportActionBar().getHeight());
//		toolbar.setTitle(arg0);
		getSupportActionBar().setDisplayShowTitleEnabled(true);
		System.out.println(toolbar.getChildCount());
		int imagew=toolbar.getChildAt(0).getWidth();
		int titlew=toolbar.getChildAt(1).getWidth();
		Toolbar.LayoutParams layoutParams=(android.support.v7.widget.Toolbar.LayoutParams) toolbar.getChildAt(1).getLayoutParams();
		layoutParams.gravity=Gravity.CENTER;
//		toolbar.getChildAt(1).setLayoutParams(new LayoutParams(100, 80));
		System.out.println("imagew="+imagew );
		System.out.println("titlew="+titlew );
//	int idd= android.support.r
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
//		MenuBuilder menu1=new MenuBuilder(getApplicationContext());
//		menu1.
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
		// }
		return super.onOptionsItemSelected(item);
	}
}

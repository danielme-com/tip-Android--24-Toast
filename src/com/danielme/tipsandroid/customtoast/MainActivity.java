package com.danielme.tipsandroid.customtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.danieme.tipsandroid.customtoast.R;

/**
 * 
 * @author danielme.com
 *
 */
public class MainActivity extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void mostrarSimple(View button)
	{
		Toast.makeText(this, R.string.mensaje, Toast.LENGTH_SHORT).show();
	}
	
	public void mostrarPersonalizado(View button)
	{
		Toast toast = new Toast(this);
		//usamos cualquier layout como Toast
		View toast_layout = getLayoutInflater().inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.lytLayout));
		toast.setView(toast_layout);
		
		//se podría definir el texto en el layout si es invariable pero lo hacemos programáticamente como ejemplo
		//tenemos acceso a cualquier widget del layout del Toast
		TextView textView = (TextView) toast_layout.findViewById(R.id.toastMessage);
        textView.setText(R.string.mensaje);
		toast.setDuration(Toast.LENGTH_SHORT);		
		toast.show();
	}
}
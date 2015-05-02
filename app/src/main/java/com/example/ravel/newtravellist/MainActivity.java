package com.example.ravel.newtravellist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        final EditText editTextSenha = (EditText) findViewById(R.id.editTextSenha);
        final Button   buttonLogin   = (Button)   findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if("ravel".equals(editTextLogin.getText().toString()) && "123".equals(editTextSenha.getText().toString())){

                  startActivity(new Intent(MainActivity.this, ActivityPanel.class));

                }else{
                    String msgError = getString(R.string.erro_autenticacao);

                    Toast toast = Toast.makeText(MainActivity.this,msgError,Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
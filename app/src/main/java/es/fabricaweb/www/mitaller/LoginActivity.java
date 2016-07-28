package es.fabricaweb.www.mitaller;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import es.fabricaweb.www.mitaller.clases.JsonParseUsuario;
import es.fabricaweb.www.mitaller.clases.cUsuario;

public class LoginActivity extends AppCompatActivity {

    HttpURLConnection httpURLConnection;
    URL url;

    EditText etUsuario, etClave;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etClave = (EditText) findViewById(R.id.etClave);

        btnEntrar= (Button) findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = "61953498";
                String clave = "123456";

                login (usuario,clave);



            }
        });
    }

    private void login (final String usuario, final String clave) {


        AsyncTask<String,String,String> sync = new AsyncTask<String, String, String>() {

            String resultado;

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected String doInBackground(String... params) {

                try {
                    url = new URL("http://ws.fabricaweb.es/getByLoginUser.php");
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(1000);

                    int StatusCode = httpURLConnection.getResponseCode();

                    if (StatusCode!=200) {
                        resultado = "nada";

                    } else {
                        resultado = "si";
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();

                } finally {
                    httpURLConnection.disconnect();
                }

                return null;

            }
        }

    }


}

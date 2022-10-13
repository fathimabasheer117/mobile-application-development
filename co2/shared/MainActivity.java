import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.user);
        e2=findViewById(R.id.pass);
    }
    public void save(View view){
        String user=e1.getText().toString().trim();
        String pass=e2.getText().toString().trim();
        if(user.equals("")){
            Toast.makeText(this, "enter the username",Toast.LENGTH_SHORT).show();
        }
        else if(pass.equals("")){
            Toast.makeText(this, "enter the password",Toast.LENGTH_SHORT).show();
        }
        else {
            SharedPreferences sp = getSharedPreferences("Data", Context.MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putString("username", e1.getText().toString());
            ed.putString("password", e2.getText().toString());
            ed.commit();
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
        }

    }
    public void Next(View view) {

        Toast.makeText(this, "Second Page", Toast.LENGTH_SHORT).show();
        Intent in  = new Intent(this, MainActivity2.class);
        startActivity(in);
    }
}

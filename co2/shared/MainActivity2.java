import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    public static final String DEFAULT="No Value Entered";
    EditText u1,u2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        u1=(EditText) findViewById(R.id.usr);

        u2=(EditText) findViewById(R.id.pwd);
    }
    public void Register(View view){
        SharedPreferences sp=getSharedPreferences("Data", Context.MODE_PRIVATE);
        String usr=sp.getString("username",DEFAULT);
        String pwd=sp.getString("password",DEFAULT);
        if (usr.equals(DEFAULT) || pwd.equals(DEFAULT)) {
            Toast.makeText(this, "Data Not Found", Toast.LENGTH_SHORT).show();
        }
        else {
            u1.setText(usr);
           u2.setText(pwd);
            Toast.makeText(this, "Data Retrieved", Toast.LENGTH_SHORT).show();
        }
    }
    public void Prev(View view) {

        Toast.makeText(this, "First Page", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);

    }
}

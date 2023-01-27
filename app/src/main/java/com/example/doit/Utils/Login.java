
package com.example.doit.Utils;

        import static com.example.doit.R.*;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.doit.MainActivity;
        import com.example.doit.R;
        import com.google.android.material.button.MaterialButton;
        import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.ic_laucher_login);


        TextView username =(TextView) findViewById(id.username);
        TextView password =(TextView) findViewById(id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    //Toast.makeText(Login.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Toast.makeText(Login.this, "Login Successful ", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Login.this, MainActivity.class);
                    startActivity(i);
                }else
                    //incorrect
                    Toast.makeText(Login.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
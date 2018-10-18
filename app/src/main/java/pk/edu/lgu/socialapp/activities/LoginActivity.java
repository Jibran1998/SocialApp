package pk.edu.lgu.socialapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pk.edu.lgu.socialapp.R;

public class LoginActivity extends AppCompatActivity {
    private EditText email,password;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Sign In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        email=findViewById(R.id.signInEmail);
        password=findViewById(R.id.signInPassword);
        signInButton=findViewById(R.id.signInButton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emaill=email.getText().toString();
                String pswd=password.getText().toString();
                emaill.toLowerCase();
                if(TextUtils.isEmpty(emaill)||TextUtils.isEmpty(pswd))
                {
                    if(TextUtils.isEmpty(emaill))
                    {
                        email.setError("Please enter valid email");
                    }
                    if(TextUtils.isEmpty(pswd))
                    {
                        password.setError("Please enter password");
                    }
                }
                else
                {
                    Intent intent=new Intent(LoginActivity.this,DashboardActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}

package pk.edu.lgu.socialapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pk.edu.lgu.socialapp.R;

public class Registration extends AppCompatActivity {
    private EditText name,email,password,number;
    private Button signUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        name=findViewById(R.id.registerName);
        email=findViewById(R.id.registerEmail);
        password=findViewById(R.id.registerPassword);
        number=findViewById(R.id.registerNumber);
        signUpButton=findViewById(R.id.registerButton);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emaill=email.getText().toString();
                String pswd=password.getText().toString();
                String nme=name.getText().toString();
                String nmbr=number.getText().toString();
                emaill.toLowerCase();
                if(TextUtils.isEmpty(emaill)||TextUtils.isEmpty(pswd)||TextUtils.isEmpty(nme)||TextUtils.isEmpty(nmbr))
                {
                    if(TextUtils.isEmpty(emaill))
                    {
                        email.setError("Please enter Email Address");
                    }
                    if(TextUtils.isEmpty(pswd))
                    {
                        password.setError("Please enter Password");
                    }
                    if(TextUtils.isEmpty(nme))
                    {
                        name.setError("Please enter Name");
                    }
                    if(TextUtils.isEmpty(nmbr))
                    {
                        number.setError("Please enter Contact number");
                    }
                }
                else if(!emaill.contains("@lgu.edu.pk"))
                {
                    email.setError("Please enter valid LGU email");
                }
                else
                {
                    Intent intent=new Intent(Registration.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}

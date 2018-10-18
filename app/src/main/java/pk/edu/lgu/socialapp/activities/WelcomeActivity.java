package pk.edu.lgu.socialapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pk.edu.lgu.socialapp.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button signUpButton,signInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();
        signInButton=findViewById(R.id.welcomeSigninButton);
        signUpButton=findViewById(R.id.welcomeSignupButton);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WelcomeActivity.this,Registration.class);
                startActivity(intent);
            }
        });
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WelcomeActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}

package pk.edu.lgu.socialapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pk.edu.lgu.socialapp.R;

public class DashboardActivity extends AppCompatActivity {
    Button messages,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
       getSupportActionBar().hide();
       messages=findViewById(R.id.dashBoardMessages);
       logout=findViewById(R.id.dashboardLogout);

       messages.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(DashboardActivity.this,MainActivity.class);
               startActivity(intent);
           }
       });
        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DashboardActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}

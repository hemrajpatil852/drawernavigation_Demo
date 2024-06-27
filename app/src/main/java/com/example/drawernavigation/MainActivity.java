package com.example.drawernavigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.main);
        buttonDrawerToggle = findViewById(R.id.buttonDrawertoggle);
        navigationView= findViewById(R.id.navigationView);

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

        View headerWiew = navigationView.getHeaderView(0);
        ImageView userImage = headerWiew.findViewById(R.id.userImage);
        TextView  textUserName= headerWiew.findViewById(R.id.textUsername);

        textUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,textUserName.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if (itemId== R.id.navMenu){

                  Toast.makeText(MainActivity.this, "Menu Clicked", Toast.LENGTH_SHORT).show();
              }
                if (itemId== R.id.navCard){

                    Toast.makeText(MainActivity.this, "Card Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemId== R.id.navFavorite){

                    Toast.makeText(MainActivity.this, "Favorite Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemId== R.id.navOrder){

                    Toast.makeText(MainActivity.this, "ongoing order Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemId== R.id.navHistory){

                    Toast.makeText(MainActivity.this, "History Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemId== R.id.navFeedback){

                    Toast.makeText(MainActivity.this, "Feedback Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemId== R.id.navTerms){

                    Toast.makeText(MainActivity.this, "Terms and Condition Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemId== R.id.navContact){

                    Toast.makeText(MainActivity.this, "Contact Us Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemId== R.id.navShare){

                    Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.close();
                return false;
            }
        });
    }
}

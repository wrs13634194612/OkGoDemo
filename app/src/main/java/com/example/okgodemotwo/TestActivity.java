package com.example.okgodemotwo;



        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        Button btn_electricity_get = findViewById(R.id.btn_electricity_get);
        Button btn_electricity_update = findViewById(R.id.btn_electricity_update);
        Button btn_electricity_delete = findViewById(R.id.btn_electricity_delete);

        Button btn_warn_get = findViewById(R.id.btn_warn_get);
        Button btn_warn_update = findViewById(R.id.btn_warn_update);
        Button btn_warn_delete = findViewById(R.id.btn_warn_delete);

        Button btn_product_get = findViewById(R.id.btn_product_get);



        btn_electricity_get.setBackgroundColor(Color.RED);
        btn_electricity_update.setBackgroundColor(Color.GRAY);
        btn_electricity_delete.setBackgroundColor(Color.GREEN);


        btn_warn_get.setBackgroundColor(Color.YELLOW);
        btn_warn_update.setBackgroundColor(Color.BLUE);
        btn_warn_delete.setBackgroundColor(Color.MAGENTA);

        btn_product_get.setBackgroundColor(Color.RED);


        btn_electricity_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this, ElectricityGetActivity.class);
                startActivity(intent);
            }
        });

        btn_electricity_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this, ElectricityUpdateActivity.class);
                startActivity(intent);
            }
        });

        btn_electricity_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this, ElectricityDeleteActivity.class);
                startActivity(intent);
            }
        });


        btn_warn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this, WarnGetActivity.class);
                startActivity(intent);
            }
        });

        btn_warn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this, WarnUpdateActivity.class);
                startActivity(intent);
            }
        });

        btn_warn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this, WarnDeleteActivity.class);
                startActivity(intent);
            }
        });


        btn_product_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });
    }
}
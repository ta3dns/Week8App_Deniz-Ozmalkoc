package com.example.week8appdenizozmalkoc;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputFirstNumber;
    private EditText inputSecondNumber;
    private TextView output;
    private float firstNumberInt;
    private float secondNumberInt;


    private float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        inputFirstNumber = findViewById(R.id.inputFirstNumber);
        inputSecondNumber = findViewById(R.id.inputSecondNumber);
        output = findViewById(R.id.outputView);

    }




    public void sumFunction(View view){
        try {
            firstNumberInt = Float.parseFloat(inputFirstNumber.getText().toString());
            secondNumberInt = Float.parseFloat(inputSecondNumber.getText().toString());
            System.out.println("First Number: " + firstNumberInt);
            System.out.println("Second Number: " + secondNumberInt);


            result = firstNumberInt + secondNumberInt;

            System.out.println("Sum: " + result);

            output.setText(String.valueOf(result));
        } catch (Exception e){
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        }
    }

    public void subFunction(View view){
        try {

            firstNumberInt = Float.parseFloat(inputFirstNumber.getText().toString());
            secondNumberInt = Float.parseFloat(inputSecondNumber.getText().toString());
            System.out.println("First Number: " + firstNumberInt);
            System.out.println("Second Number: " + secondNumberInt);

            result = firstNumberInt - secondNumberInt;
            System.out.println("Subtracted Value: " + result);
            output.setText(String.valueOf(result));

        } catch (Exception e){
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        }
    }

    public void multFunction(View view){
        try {

            firstNumberInt = Float.parseFloat(inputFirstNumber.getText().toString());
            secondNumberInt = Float.parseFloat(inputSecondNumber.getText().toString());
            System.out.println("First Number: " + firstNumberInt);
            System.out.println("Second Number: " + secondNumberInt);

            result = firstNumberInt * secondNumberInt;
            System.out.println("Product: " + result);
            output.setText(String.valueOf(result));
        } catch (Exception e){
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        }
    }

    public void divFunction(View view){
        try {

            firstNumberInt = Float.parseFloat(inputFirstNumber.getText().toString());
            secondNumberInt = Float.parseFloat(inputSecondNumber.getText().toString());
            System.out.println("First Number: " + firstNumberInt);
            System.out.println("Second Number: " + secondNumberInt);

            if (secondNumberInt == 0) {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_LONG).show();
            } else {
                result = firstNumberInt / secondNumberInt;

                System.out.println("Division Value: " + result);
                output.setText(String.valueOf(result));
            }
        } catch (Exception e){
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        }
    }



}
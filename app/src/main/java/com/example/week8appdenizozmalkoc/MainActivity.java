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
    private int firstNumberInt;
    private int secondNumberInt;
    private float floatForDivision;

    private int result;

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
        firstNumberInt = Integer.parseInt(inputFirstNumber.getText().toString());
        secondNumberInt = Integer.parseInt(inputSecondNumber.getText().toString());
        System.out.println("First Number: " + firstNumberInt);
        System.out.println("Second Number: " + secondNumberInt);


        result = firstNumberInt + secondNumberInt;

        System.out.println("Sum: " + result);

        output.setText(String.valueOf(result));
    }

    public void subFunction(View view){
        firstNumberInt = Integer.parseInt(inputFirstNumber.getText().toString());
        secondNumberInt = Integer.parseInt(inputSecondNumber.getText().toString());
        System.out.println("First Number: " + firstNumberInt);
        System.out.println("Second Number: " + secondNumberInt);


        result = firstNumberInt - secondNumberInt;

        System.out.println("Subtracted Value: " + result);

        output.setText(String.valueOf(result));
    }


    public void multFunction(View view){
        firstNumberInt = Integer.parseInt(inputFirstNumber.getText().toString());
        secondNumberInt = Integer.parseInt(inputSecondNumber.getText().toString());
        System.out.println("First Number: " + firstNumberInt);
        System.out.println("Second Number: " + secondNumberInt);


        result = firstNumberInt * secondNumberInt;

        System.out.println("Product: " + result);

        output.setText(String.valueOf(result));
    }

    public void divFunction(View view){
        firstNumberInt = Integer.parseInt(inputFirstNumber.getText().toString());
        secondNumberInt = Integer.parseInt(inputSecondNumber.getText().toString());
        System.out.println("First Number: " + firstNumberInt);
        System.out.println("Second Number: " + secondNumberInt);

        if (secondNumberInt == 0){
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_LONG).show();
        } else {
            floatForDivision = (float) firstNumberInt / (float) secondNumberInt;

            System.out.println("Division Value: " + floatForDivision);
            output.setText(String.valueOf(floatForDivision));
        }



    }



}
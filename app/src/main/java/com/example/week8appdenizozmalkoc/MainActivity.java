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

/* **********************************************************************************************
 Deniz Özmalkoc
 OOP Week 8 Task
 09.03.2025
 https://github.com/ta3dns/Week8App_Deniz-Ozmalkoc

 Android app using java that performs basic arithmetic operations on two numbers.
 ************************************************************************************************/


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
        // Initialize the input and output fields.

    }

    public void sumFunction(View view){
        // Sum Function: Gets Called when the + button is pressed. Adds the two numbers together and displays the result.

        try { // To catch any exceptions that may occur during the calculation. (Like empty value in the field)

            firstNumberInt = Float.parseFloat(inputFirstNumber.getText().toString());
            secondNumberInt = Float.parseFloat(inputSecondNumber.getText().toString());
            // Make input fields into floats.

            System.out.println("First Number: " + firstNumberInt);
            System.out.println("Second Number: " + secondNumberInt);

            result = firstNumberInt + secondNumberInt; // Add the two numbers together.

            System.out.println("Sum: " + result);
            output.setText(String.valueOf(result)); // Display the result in the output field.

        } catch (Exception e){
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
            // If the input fields are empty, a toast message is displayed to the user.
        }
    }

    public void subFunction(View view){
        // Subtraction Function: Gets Called when the - button is pressed. Subtracts the two numbers and displays the result.

        try { // To catch any exceptions that may occur during the calculation. (Like empty value in the field)

            firstNumberInt = Float.parseFloat(inputFirstNumber.getText().toString());
            secondNumberInt = Float.parseFloat(inputSecondNumber.getText().toString());
            // Make input fields into floats.

            System.out.println("First Number: " + firstNumberInt);
            System.out.println("Second Number: " + secondNumberInt);

            result = firstNumberInt - secondNumberInt; // Subtract the two numbers.

            System.out.println("Subtracted Value: " + result);
            output.setText(String.valueOf(result)); // Display the result in the output field.

        } catch (Exception e){
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
            // If the input fields are empty, a toast message is displayed to the user.
        }
    }

    public void multFunction(View view){
        // Multiplication Function: Gets Called when the X button is pressed. Multiplies the two numbers and displays the result.

        try { // To catch any exceptions that may occur during the calculation. (Like empty value in the field)

            firstNumberInt = Float.parseFloat(inputFirstNumber.getText().toString());
            secondNumberInt = Float.parseFloat(inputSecondNumber.getText().toString());
            // Make input fields into floats.

            System.out.println("First Number: " + firstNumberInt);
            System.out.println("Second Number: " + secondNumberInt);

            result = firstNumberInt * secondNumberInt; // Multiply the two numbers.

            System.out.println("Product: " + result);
            output.setText(String.valueOf(result)); // Display the result in the output field.

        } catch (Exception e){
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
            // If the input fields are empty, a toast message is displayed to the user.
        }
    }

    public void divFunction(View view){
        // Division Function: Gets Called when the / button is pressed. Divides the two numbers and displays the result.

        try { // To catch any exceptions that may occur during the calculation. (Like empty value in the field)

            firstNumberInt = Float.parseFloat(inputFirstNumber.getText().toString());
            secondNumberInt = Float.parseFloat(inputSecondNumber.getText().toString());
            // Make input fields into floats.

            System.out.println("First Number: " + firstNumberInt);
            System.out.println("Second Number: " + secondNumberInt);

            if (secondNumberInt == 0) { // To check if the second number is zero.
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_LONG).show();
                // If the second number is zero, a toast message is displayed to the user.

            } else {
                result = firstNumberInt / secondNumberInt; // Divide the two numbers.

                System.out.println("Division Value: " + result);
                output.setText(String.valueOf(result)); // Display the result in the output field.
            }
        } catch (Exception e){
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
            // If the input fields are empty, a toast message is displayed to the user.
        }
    }
}
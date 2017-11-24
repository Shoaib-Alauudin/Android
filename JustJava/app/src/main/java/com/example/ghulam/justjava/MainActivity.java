package com.example.ghulam.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private TextView quantityTextView;
    private Button orderButton, incrementButton, decrementButton;
    private int quantity = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}

    /*
       This method is called when the order button is clicked
       */
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));

    }


    public void increment(View view) {
        quantity += 1;
        displayQuantity(quantity);
    }

    /*
This method is called when the decrement button is clicked
*/
    public void decrement(View view) {
        quantity -= 1;
        displayQuantity(quantity);
    }

    /*
       This method is called when the order button is clicked
       */
    private void displayQuantity(int numberOfCoffees) {
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

//    private void displayPrice(int number) {
//        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
//
//    }

    /*
   This method is called when the increment button is clicked
   */

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    /*
    Calculates the price of the order.
    return total price
    */
    private int calculatePrice(){
        int price = quantity * 5;
        return  price;
    }

    private String createOrderSummary(int price){

        String priceMessage = "Name : Shoaib"+"\n";
        priceMessage += "Quanatity : "+quantity+"\n";
        priceMessage += "Total : "+NumberFormat.getCurrencyInstance().format(price)+"\n";
        priceMessage += "Thank you!";
        return priceMessage;
    }
}

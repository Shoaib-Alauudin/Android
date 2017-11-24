package com.example.ghulam.justjava_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView quantityTextView;
    private Button orderButton, incrementButton, decrementButton;
    private CheckBox WhippedCreamCheckBox, ChoclateCheckBox;
    private int quantity = 0;
    private boolean hasWhippedCream = false, hasChocolate = false;
    private EditText nameField;
    String name = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*
       This method is called when the order button is clicked
       */
    public void submitOrder(View view){

        // Figure out if the user wants whipped cream topping
        WhippedCreamCheckBox = (CheckBox)findViewById(R.id.whipped_cream_checkbox);
        hasWhippedCream = WhippedCreamCheckBox.isChecked();

        //Figure out if the user want chocolate topping
        ChoclateCheckBox = (CheckBox)findViewById(R.id.chocolate_checkbox);
        hasChocolate = ChoclateCheckBox.isChecked();

        //Figure out what is the Name of user to send in order summary
        nameField = (EditText)findViewById(R.id.name_field);
        name = nameField.getText().toString();
        // if user cannot have write their name its show toast message untill user write their name
        if (name.isEmpty()){
            Toast.makeText(this,R.string.toastMessageName,Toast.LENGTH_SHORT).show();

        }
        else {
            int price = calculatePrice(hasChocolate,hasWhippedCream);
            String priceMessage = createOrderSummary(price,hasWhippedCream,hasChocolate,name);

            // we do not need this method anymore
//            displayMessage(priceMessage);

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); //only email apps should handle this
            intent.putExtra(intent.EXTRA_SUBJECT,R.string.extraSubject+name);
            intent.putExtra(intent.EXTRA_TEXT,priceMessage);
            if (intent.resolveActivity(getPackageManager()) != null){
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Sorry You do not have app",Toast.LENGTH_SHORT).show();
        }

    }


    /*
This method is called when the increment button is clicked
*/
    public void increment(View view){
        // if user wants to have more than 100 coffees its show toast message and return nothing

        if (quantity == 100){
            Toast.makeText(this,R.string.toastMessageIncrement,Toast.LENGTH_SHORT).show();
            return;
        }
        else
            quantity += 1;
        displayQuantity(quantity);
    }

    /*
This method is called when the decrement button is clicked
*/
    public void decrement(View view){
        // if user wants to try less than 1 coffee its show toast message and return nothing
        if (quantity <= 1){
            Toast.makeText(this,R.string.toastMessageDecrement,Toast.LENGTH_SHORT).show();
            return;
        }
        else
            quantity -=1;

        displayQuantity(quantity);
    }

    /*
       This method is called when the order button is clicked
       */
    public void displayQuantity(int numberofCoffees){
        quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+ numberofCoffees);
    }

    /*
  This method is called when the increment button is clicked
  */
/*    private void displayMessage(String message){
        TextView orderSummaryTextView = (TextView)findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }*/

    /*
    Calculates the price of the order.
    return total price
    */
    private int calculatePrice(boolean addchocolate, boolean addwhippedCream){
        //Price of single cup of coffee
        int basePrice = 5;

        // Add $2 if the user wants chocolate
        if (addchocolate){
            basePrice += 2;
        }
        // add $1 if the user wants whipped cream
        if (addwhippedCream){
            basePrice += 1;
        }

        // Calculate the total price of order
        return basePrice * quantity;
    }

    /*
    create summary of the order.
    price of the order
    return text summary
    */

    private String createOrderSummary(int price, boolean addWhippedCream,boolean addCHocolate,String userName){


        String priceMessage = getString(R.string.order_summary_name, name);
        priceMessage += "\nAdd whipped cream ? "+addWhippedCream;
        priceMessage += "\nAdd Chocolate ? "+addCHocolate;
        priceMessage += "\nQuanatity : "+quantity;
        priceMessage += "\nTotal : "+ NumberFormat.getCurrencyInstance().format(price)+"\n";
        priceMessage += "\n"+getString(R.string.thank_you);
        return priceMessage;
    }
}



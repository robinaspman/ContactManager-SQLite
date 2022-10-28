package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.contactmanager.data.DatabaseHandler;
import com.example.contactmanager.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(MainActivity.this);

        Contact jeremy = new Contact();
        jeremy.setName("Jeremy");
        jeremy.setPhoneNumber("9878587");

        Contact json = new Contact();
        json.setName("Jason");
        json.setPhoneNumber("0953453");

        //db.addContact(json);
//        Contact c = db.getContact(2);
//        c.setName("NewJeremy");
//        c.setPhoneNumber("2342");

//        int updatedRow = db.updateContact(c);
//
//        Log.d("Row", "onCreate: " + updatedRow);

        //db.deleteContact(c);

//        Log.d("Main", "onCreate: " + c.getName() + ", " + c.getPhoneNumber());

        List<Contact> contactList = db.getAllContacts();

        for (Contact contact : contactList) {
            Log.d("MainActivity", "onCreate: " + contact.getId());
        }
    }
}
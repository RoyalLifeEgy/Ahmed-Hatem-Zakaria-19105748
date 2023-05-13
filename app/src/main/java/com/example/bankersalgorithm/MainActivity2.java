package com.example.bankersalgorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String value1 = getIntent().getStringExtra("col");
        String value2 = getIntent().getStringExtra("row");
        int numRows = Integer.parseInt(value2);
        int numColumns = Integer.parseInt(value1);

        // create the table with two rows
        TableLayout tableLayout = findViewById(R.id.tableLayout);

        // create the first row with static values A, B, C, D, etc.
        TableRow headerRow = new TableRow(this);
        headerRow.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));
        for (int i = 0; i < numColumns; i++) {
            TextView headerText = new TextView(this);
            headerText.setText(Character.toString((char) ('A' + i)));
            headerText.setPadding(16, 16, 16, 16);
            headerRow.addView(headerText);
        }
        tableLayout.addView(headerRow);

        // create the second row with editable cells
        TableRow dataRow = new TableRow(this);
        dataRow.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));
        for (int i = 0; i < numColumns; i++) {
            EditText editText = new EditText(this);
            editText.setText("");
            editText.setPadding(16, 16, 16, 16);
            editText.setBackgroundResource(R.drawable.table_cell_border);
            dataRow.addView(editText);
        }
        tableLayout.addView(dataRow);

        // create the table with two rows
        TableLayout tableLayout2 = findViewById(R.id.tableLayout2);

        // create the first row with static values A, B, C, D, etc.
        TableRow headerRow2 = new TableRow(this);
        headerRow2.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));
        for (int i = 0; i < numColumns; i++) {
            TextView headerText = new TextView(this);
            headerText.setText(Character.toString((char) ('A' + i)));
            headerText.setPadding(16, 16, 16, 16);
            headerRow2.addView(headerText);
        }
        tableLayout2.addView(headerRow2);

        // create the second row with editable cells
        TableRow dataRow2 = new TableRow(this);
        dataRow2.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));
        for (int i = 0; i < numColumns; i++) {
            EditText editText = new EditText(this);
            editText.setText("");
            editText.setPadding(16, 16, 16, 16);
            editText.setBackgroundResource(R.drawable.table_cell_border);
            dataRow2.addView(editText);
        }
        tableLayout2.addView(dataRow2);
        // create the table with numRows + 1 rows
        TableLayout tableLayout3 = findViewById(R.id.tableLayout3);

        // create the first row with static values A, B, C, D, etc.
        TableRow headerRow3 = new TableRow(this);
        headerRow3.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));
        for (int i = 0; i <= numColumns; i++) {
            if (i > 0) {
                TextView headerText = new TextView(this);
                headerText.setText(Character.toString((char) ('A' + i - 1)));
                headerText.setPadding(16, 16, 16, 16);
                headerRow3.addView(headerText);
            } else {
                TextView headerText = new TextView(this);
                headerText.setText(Character.toString((char) ('\\')));
                headerText.setPadding(16, 16, 16, 16);
                headerRow3.addView(headerText);

            }
        }
        tableLayout3.addView(headerRow3);

        // create the rest of the rows with first column P1, P2, P3, etc.
        for (int i = 0; i < numRows; i++) {
            TableRow dataRow3 = new TableRow(this);
            dataRow3.setLayoutParams(new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));
            TextView textView = new TextView(this);
            textView.setText("P" + (i + 1));
            textView.setPadding(16, 16, 16, 16);
            dataRow3.addView(textView);
            for (int j = 0; j < numColumns; j++) {
                EditText editText = new EditText(this);
                editText.setText("");
                editText.setPadding(16, 16, 16, 16);
                editText.setBackgroundResource(R.drawable.table_cell_border);
                dataRow3.addView(editText);
            }
            tableLayout3.addView(dataRow3);
        }
        // create the table with numRows + 1 rows
        TableLayout tableLayout4 = findViewById(R.id.tableLayout4);

        // create the first row with static values A, B, C, D, etc.
        TableRow headerRow4 = new TableRow(this);
        headerRow4.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT));
        for (int i = 0; i <= numColumns; i++) {
            if (i > 0) {
                TextView headerText = new TextView(this);
                headerText.setText(Character.toString((char) ('A' + i - 1)));
                headerText.setPadding(16, 16, 16, 16);
                headerRow4.addView(headerText);
            } else {
                TextView headerText = new TextView(this);
                headerText.setText(Character.toString((char) ('\\')));
                headerText.setPadding(16, 16, 16, 16);
                headerRow4.addView(headerText);

            }
        }
        tableLayout4.addView(headerRow4);

        // create the rest of the rows with first column P1, P2, P3, etc.
        for (int i = 0; i < numRows; i++) {
            TableRow dataRow4 = new TableRow(this);
            dataRow4.setLayoutParams(new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));
            TextView textView = new TextView(this);
            textView.setText("P" + (i + 1));
            textView.setPadding(16, 16, 16, 16);
            dataRow4.addView(textView);
            for (int j = 0; j < numColumns; j++) {
                EditText editText = new EditText(this);
                editText.setText("");
                editText.setPadding(16, 16, 16, 16);
                editText.setBackgroundResource(R.drawable.table_cell_border);
                dataRow4.addView(editText);
            }
            tableLayout4.addView(dataRow4);
        }

// initialize vector in onCreate or constructor
        Vector<Integer> values = new Vector<Integer>();
        Vector<Integer> values1 = new Vector<Integer>();
        Vector<Vector<Integer>> values2 = new Vector<Vector<Integer>>();
        Vector<Vector<Integer>> values3 = new Vector<Vector<Integer>>();
        Vector<Boolean> boolVector = new Vector<Boolean>();
        Vector<Vector<Integer>> RemainNeed = new Vector<>(numRows);
        TextView textViewA = findViewById(R.id.Answer);
// inside button's onClick method
        Button button = findViewById(R.id.my_button);
        button.setOnClickListener(v -> {
            values.clear();
            values1.clear();
            values3.clear();
            values2.clear();
            // iterate through table layout rows and columns
            for (int i = 0; i < tableLayout.getChildCount(); i++) {
                TableRow row = (TableRow) tableLayout.getChildAt(i);
                for (int j = 0; j < row.getChildCount(); j++) {
                    // get text value of EditText
                    View view = row.getChildAt(j);
                    if (view instanceof EditText) {
                        EditText editText = (EditText) view;
                        String value = editText.getText().toString();
                        // add value to vector
                        values.add(Integer.parseInt(value));
                    }
                }
            }
            // iterate through table layout rows and columns
            for (int i = 0; i < tableLayout2.getChildCount(); i++) {
                TableRow row = (TableRow) tableLayout2.getChildAt(i);
                for (int j = 0; j < row.getChildCount(); j++) {
                    // get text value of EditText
                    View view = row.getChildAt(j);
                    if (view instanceof EditText) {
                        EditText editText = (EditText) view;
                        String value = editText.getText().toString();
                        // add value to vector
                        values1.add(Integer.parseInt(value));
                    }
                }
            }
            // iterate through table layout rows and columns
            for (int i = 1; i < tableLayout3.getChildCount(); i++) {
                TableRow row = (TableRow) tableLayout3.getChildAt(i);
                Vector<Integer> rowValues = new Vector<Integer>();
                for (int j = 1; j < row.getChildCount(); j++) {
                    // get text value of TextView
                    EditText ED = (EditText) row.getChildAt(j);
                    String value = ED.getText().toString();
                    // add value to row vector
                    rowValues.add(Integer.parseInt(value));
                }
                // add row vector to values vector
                values2.add(rowValues);
            }

            // iterate through table layout rows and columns
            for (int i = 1; i < tableLayout4.getChildCount(); i++) {
                TableRow row = (TableRow) tableLayout4.getChildAt(i);
                Vector<Integer> rowValues = new Vector<Integer>();
                for (int j = 1; j < row.getChildCount(); j++) {
                    // get text value of TextView
                    EditText ED = (EditText) row.getChildAt(j);
                    String value = ED.getText().toString();
                    // add value to row vector
                    rowValues.add(Integer.parseInt(value));
                }
                // add row vector to values vector
                values3.add(rowValues);
            }
// check bankers algorithm

            for (int i = 0; i < numRows; i++) {
                Vector<Integer> val = new Vector<Integer>(numColumns);
                RemainNeed.add(val);
            }
            int[][] x = new int[numRows][numColumns];
            for (int i = 0; i < numRows; i++) {
                boolean cv = false;
                boolVector.add(cv);
                for (int j = 0; j < numColumns; j++) {
                    x[i][j] = values3.get(i).get(j) - values2.get(i).get(j);
                }
            }
            Integer sol = numRows;
            boolean flag = true;
            while (flag == true) {
                flag = false;
                for (int i = 0; i < numRows; i++) {
                    if (boolVector.get(i) == false) {
                        boolean valid = true;
                        for (int j = 0; j < numColumns; j++) {
                            if (x[i][j] > values1.get(j)) {
                                valid = false;
                            }
                        }
                        if (valid == true) {
                            for (int j = 0; j < numColumns; j++) {
                                values1.set(j, values1.get(j) + values2.get(i).get(j));
                            }
                            sol = sol - 1;
                            flag = true;
                            boolVector.set(i, true);
                        }
                    }
                }
            }
            if (sol > 0) {
                textViewA.setVisibility(View.VISIBLE);
                textViewA.setText("Invalid");
                textViewA.setBackgroundColor(Color.parseColor("Red"));

            } else {
                textViewA.setVisibility(View.VISIBLE);
                textViewA.setText("Valid");

                textViewA.setBackgroundColor(Color.parseColor("Green"));


// Add any views you want to display in the toast message


            }

        });

    }
}

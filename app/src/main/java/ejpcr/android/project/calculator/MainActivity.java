package ejpcr.android.project.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button sum, res, div, mul;
    EditText num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        sum = (Button)findViewById(R.id.btnSumar);
        res = (Button)findViewById(R.id.btnRestar);
        mul = (Button)findViewById(R.id.btnMultiplicar);
        div = (Button)findViewById(R.id.btnDividir);

        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);

        result = (EditText)findViewById(R.id.txtResultado);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numerito1 = Integer.parseInt(num1.getText().toString());
                int numerito2 = Integer.parseInt(num2.getText().toString());
                int sum = numerito1 + numerito2;
                result.setText("R: "+sum);
            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numerito1 = Integer.parseInt(num1.getText().toString());
                int numerito2 = Integer.parseInt(num2.getText().toString());
                int res = numerito1 - numerito2;
                result.setText("R: " + res);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numerito1 = Integer.parseInt(num1.getText().toString());
                int numerito2 = Integer.parseInt(num2.getText().toString());
                int mul = numerito1 * numerito2;
                result.setText("R: " + mul);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numerito1 = Integer.parseInt(num1.getText().toString());
                int numerito2 = Integer.parseInt(num2.getText().toString());
                int div = numerito1 / numerito2;
                result.setText("R: " + div);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

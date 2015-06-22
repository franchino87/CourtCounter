package drunkencoder.courtcounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void click_3pointsA (View view) {
        displayA(3);
    }
    public void click_2pointsA (View view) {
        displayA(2);
    }
    public void click_1pointsA (View view) {
        displayA(1);
    }
    public void click_3pointsB (View view) {
        displayB(3);
    }
    public void click_2pointsB (View view) {
        displayB(2);
    }
    public void click_1pointsB (View view) {
        displayB(1);
    }

    public void click_reset (View view){
        TextView textViewA = (TextView) findViewById(R.id.scoreA);
        textViewA.setText("" + 0);
        TextView textViewB = (TextView) findViewById(R.id.scoreB);
        textViewB.setText("" + 0);
    }


    private void displayA(int number){
        TextView textView = (TextView) findViewById(R.id.scoreA);
        number = number + (Integer.parseInt(textView.getText().toString()));
        textView.setText("" + number);
    }

    private void displayB(int number){
        TextView textView = (TextView) findViewById(R.id.scoreB);
        number = number + (Integer.parseInt(textView.getText().toString()));
        textView.setText("" + number);
    }

}

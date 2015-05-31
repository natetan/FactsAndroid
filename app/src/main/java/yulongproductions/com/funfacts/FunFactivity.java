package yulongproductions.com.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactivity extends Activity {

    public static final String TAG = FunFactivity.class.getSimpleName();

    // Create Member Variables
    private FactBook mFactBook = new FactBook();
    private ZachFactBook mZachFactBook = new ZachFactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private TopQuestion mTopQuestion = new TopQuestion();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        // Declare our View variables
        final TextView question = (TextView)findViewById(R.id.questionTextView);
        final TextView factLabel = (TextView)findViewById(R.id.factTextView);
        final Button showFactButton = (Button)findViewById(R.id.showFactButton);
        final Button showZachButton = (Button)findViewById(R.id.showZachButton);
        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        // Making the button do something
        // Method setOnClickListener makes the button do something by code

        // This button is for regular facts
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question.setText(mTopQuestion.getFactQuestion());
                String fact = mFactBook.getFact();
                factLabel.setText(fact);
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        // This button is for Zach facts
        View.OnClickListener zach = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question.setText(mTopQuestion.getZachQuestion());
                String zachFact = mZachFactBook.getFact();
                factLabel.setText(zachFact);
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showZachButton.setTextColor(color);
            }
        };
        showZachButton.setOnClickListener(zach);

        Toast.makeText(this, "Please enjoy FunFactivity! It's fun!", Toast.LENGTH_LONG).show();
        // Log.d(TAG, "We're logging from the onCreate() method");
    }
}

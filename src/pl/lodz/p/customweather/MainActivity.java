package pl.lodz.p.customweather;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import pl.lodz.p.info.GeneralInfo;

public class MainActivity extends Activity {

    public static GeneralInfo generalInfo = new GeneralInfo();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testGeneralInfo();
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void initAstroWeatherInfo() {

    }

    public void testGeneralInfo() {
        GeneralInfo generalInfo = new GeneralInfo();
        EditText text = (EditText) this.findViewById(R.id.editText);
        text.setText(generalInfo.getMoonInfo().toString());
    }


    
}

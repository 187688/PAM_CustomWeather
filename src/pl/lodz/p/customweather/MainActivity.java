package pl.lodz.p.customweather;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import pl.lodz.p.info.GeneralInfo;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GeneralInfo.mockCoordinates();
        GeneralInfo.updateAstroCalculator();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

package Youthnomics;

import android.app.Activity;
import android.os.Bundle;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Youthnomics app = (Youthnomics) getApplication();
        app.getModel().initData(this);
    }
}

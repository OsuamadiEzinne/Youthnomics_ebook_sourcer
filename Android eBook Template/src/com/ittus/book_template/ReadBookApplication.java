package yothnomics_app;

import android.app.Application;

import com.ittus.book_template.model.BenNhauTronDoiModel;

public class ReadBookApplication extends Application {

    Youthnomics

    @Override
    public void onCreate() {
        super.onCreate();

        Youthnomics = new Youthnomics (this);
    }

    public Youthnomics () { return Youthnomics ;
    }
}

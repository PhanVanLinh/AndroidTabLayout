package toong.com.androidtablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAndAddTab(R.id.tab);
        initAndAddTab(R.id.tab2);
        initAndAddTab(R.id.tab3);
        initAndAddTab(R.id.tab4);
    }

    private void initAndAddTab(int tabRes){
        TabLayout tabLayout = (TabLayout) findViewById(tabRes);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
    }
}

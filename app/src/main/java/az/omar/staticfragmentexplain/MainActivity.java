package az.omar.staticfragmentexplain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        BodyPartFragment headFragment = new BodyPartFragment(AndroidImageAssets.getHeads());
        fragmentManager.beginTransaction().add(R.id.head_fr, headFragment).commit();

        BodyPartFragment bodyFragment = new BodyPartFragment(AndroidImageAssets.getBodies());
        fragmentManager.beginTransaction().add(R.id.body_fr, bodyFragment).commit();

        BodyPartFragment legFragment = new BodyPartFragment(AndroidImageAssets.getLegs());
        fragmentManager.beginTransaction().add(R.id.leg_fr, legFragment).commit();


    }
}
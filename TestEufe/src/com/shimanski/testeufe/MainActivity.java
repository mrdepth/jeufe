package com.shimanski.testeufe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.shimanski.eufe.*;
import com.shimanski.eufe.Character;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Resources.openRawResource  (R.raw.eufe);
        System.loadLibrary("eufe");
        Engine engine = new Engine("/sdcard/eufe.sqlite");
        Gang gang = engine.getGang();
        Character pilot = gang.addPilot();
        pilot.setAllSkillsLevel(5);
        Ship dominix = pilot.setShip(645);
        dominix.addModule(10836);
        HitPoints hp = dominix.getEffectiveHitPoints();
        float armor = hp.getArmor();
        float hull = hp.getHull();
        float shield = hp.getShield();
        Resistances res = dominix.getResistances();
        float armorEM = res.getArmor().getEm();
        String s = dominix.getScanType().toString();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

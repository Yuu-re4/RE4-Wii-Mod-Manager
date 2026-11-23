
package com.re4trainer;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Switch;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    LinearLayout layout;

    int background = Color.rgb(17, 17, 21);
    int red = Color.rgb(145, 15, 25);
    int white = Color.WHITE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scroll = new ScrollView(this);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(24, 30, 24, 30);
        layout.setBackgroundColor(background);

        scroll.addView(layout);
        setContentView(scroll);

        addTitle("RE4 WII");
        addSubtitle("ULTIMATE TRAINER v0.1");

        addSection("PLAYER");
        addCheat("Infinite Health");
        addCheat("Infinite Ammo");
        addCheat("No Reload");

        addSection("ENEMY");
        addCheat("Freeze Enemy");
        addCheat("One Hit Kill");

        addSection("WEAPON MODIFIER");
        addCheat("Special Weapons");
        addCheat("Weapon Damage Modifier");

        addSection("INVENTORY");
        addCheat("Max Money");
        addCheat("Unlock All");

        addSubtitle("RESIDENT EVIL 4 WII");
    }

    void addTitle(String text) {
        TextView title = new TextView(this);
        title.setText(text);
        title.setTextColor(white);
        title.setTextSize(32);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);
    }

    void addSubtitle(String text) {
        TextView subtitle = new TextView(this);
        subtitle.setText(text);
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(14);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 8, 0, 25);
        layout.addView(subtitle);
    }

    void addSection(String text) {
        TextView section = new TextView(this);
        section.setText(text);
        section.setTextColor(Color.WHITE);
        section.setTextSize(18);
        section.setTypeface(null, Typeface.BOLD);
        section.setBackgroundColor(red);
        section.setPadding(15, 12, 15, 12);

        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                -1, -2
            );

        params.setMargins(0, 15, 0, 8);
        layout.addView(section, params);
    }

    void addCheat(String name) {
        Switch toggle = new Switch(this);
        toggle.setText(name);
        toggle.setTextColor(white);
        toggle.setTextSize(16);
        toggle.setPadding(8, 14, 8, 14);

        layout.addView(toggle);
    }
          }

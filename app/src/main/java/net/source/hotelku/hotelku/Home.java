package net.source.hotelku.hotelku;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Home extends Fragment implements View.OnClickListener {

    ViewPager viewPager;
    LinearLayout SliderDots;
    private int dotcounts;
    private ImageView[] dots;
    private Timer timer;
    TextView textView;

    RecyclerView recyclerView;
    List<Data> data_list = new ArrayList<>();

    @Override
    public void onClick(View v) {

    }
}

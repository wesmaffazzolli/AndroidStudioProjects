package br.com.androidpro.churrascometro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar sbMen, sbWomen, sbKids;
    TextView tvMen, tvWomen, tvKids, outputSausage, outputMeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbMen = (SeekBar)findViewById(R.id.seekBarMen);
        sbWomen = (SeekBar)findViewById(R.id.seekBarWomen);
        sbKids = (SeekBar)findViewById(R.id.seekBarKids);
        tvMen = (TextView)findViewById(R.id.tvMen);
        tvWomen = (TextView)findViewById(R.id.tvWomen);
        tvKids = (TextView)findViewById(R.id.tvKids);
        outputSausage = (TextView)findViewById(R.id.linguica);
        outputMeat = (TextView)findViewById(R.id.carne);

        sbMen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvMen.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbWomen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvWomen.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbKids.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvKids.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void calculate(View view){

        double sausageCalculate = (((250.0/1000) * sbMen.getProgress()) + ((200.0/1000) * sbWomen.getProgress()) + ((100.0/1000) * sbKids.getProgress()));
        double meatCalculate = (((500.0/1000) * sbMen.getProgress()) + ((300.0/1000) * sbWomen.getProgress()) + ((200.0/1000) * sbKids.getProgress()));

        Log.d("my-log", String.valueOf(sausageCalculate));
        Log.d("my-log", String.valueOf(meatCalculate));

        outputMeat.setText("Carne: "+String.format("%.2f", meatCalculate)+"Kg");
        outputSausage.setText("Linguiça: "+String.format("%.2f", sausageCalculate)+"Kg");
    }


}

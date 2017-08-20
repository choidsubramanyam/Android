package com.example.subbu.expandablerecyclerview;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends LifecycleActivity {
    Button button;
    TextView textView;
    ScoreViewModel viewModel;
    int count=0;
    RecyclerView recyclerView;
    ScanAdapter scanAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
       /* button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);*/
        viewModel= ViewModelProviders.of(this).get(ScoreViewModel.class);
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count+1;
                viewModel.setCount(viewModel.getCount()+1);
                settext(viewModel.getCount());
            }
        });*/
       /* settext(viewModel.getCount());*/
        ScanViewModel scanViewModel=ViewModelProviders.of(this).get(ScanViewModel.class);
//        Log.e("scan",""+scanViewModel.getScanobservsble().getValue().getResult());
        observable(scanViewModel);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
    }

    private void observable(ScanViewModel scanViewModel) {
        scanViewModel.getScanobservsble().observe(this, new Observer<Example>() {
            @Override
            public void onChanged(@Nullable Example example) {
                scanAdapter=new ScanAdapter(MainActivity.this,example.getResult());
                recyclerView.setAdapter(scanAdapter);
                Log.e("scand0",""+example.getResult().size());
                for (int i=0;i<example.getResult().size();i++){
                    Log.e("scanafterchange",""+example.getResult().get(i).getScanId());

                }
            }
        });
    }

    private void settext(int i) {
        textView.setText(String.valueOf(i));
    }
}

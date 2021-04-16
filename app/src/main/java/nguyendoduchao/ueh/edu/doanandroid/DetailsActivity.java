package nguyendoduchao.ueh.edu.doanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    int Count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ImageButton add=(ImageButton)findViewById(R.id.addcart);
        ImageButton ve=(ImageButton) findViewById(R.id.back);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DetailsActivity.this, DatmonActivity.class);
                startActivity(intent);
            }
        });
        ve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DetailsActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        //soLUONG
        ImageButton cong=(ImageButton)findViewById(R.id.imageView11);
        ImageButton tru=(ImageButton)findViewById(R.id.imageView10);
        TextView soluong=(TextView)findViewById(R.id.textView13);
        TextView tien=(TextView)findViewById(R.id.textView14);

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count++;
                soluong.setText(Count+"");
                tien.setText(Count*55000+"");


            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count--;
                soluong.setText(Count+"");
                tien.setText(Count*55000+"");
            }
        });
    }
}

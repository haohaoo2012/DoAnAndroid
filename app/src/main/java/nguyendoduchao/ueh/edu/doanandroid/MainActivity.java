package nguyendoduchao.ueh.edu.doanandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import nguyendoduchao.ueh.edu.doanandroid.adapter.AsiaFoodAdapter;
import nguyendoduchao.ueh.edu.doanandroid.adapter.PopularFoodAdapter;
import nguyendoduchao.ueh.edu.doanandroid.model.AsiaFood;
import nguyendoduchao.ueh.edu.doanandroid.model.PopularFood;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //chuyengiaodien
    ImageButton chuyen = (ImageButton) findViewById(R.id.btndangnhap);
    chuyen.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent= new Intent(MainActivity.this,MainActivity1.class);
        startActivity(intent);
    }
});

        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("Canh Chúa Cá Lóc", "55k", R.drawable.canhchua));
        popularFoodList.add(new PopularFood("Cơm Chiên Hải Sản", "45k", R.drawable.com_hs_xao_rau));
        popularFoodList.add(new PopularFood("Bánh Canh Cua", "30k", R.drawable.banhcanhcua));
        popularFoodList.add(new PopularFood("Hủ Tiếu Nam Vang", "35k", R.drawable.hutieu));
        popularFoodList.add(new PopularFood("Mì Quảng Tôm Thịt ", "45k", R.drawable.miquang));
        popularFoodList.add(new PopularFood("Bò Kho Bánh Mì", "30k", R.drawable.bokho));
        popularFoodList.add(new PopularFood("Cá Bống Kho Tộ", "30k", R.drawable.cakho));
        setPopularRecycler(popularFoodList);


        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("Pizza Hải Sản", "120.000", R.drawable.asiafood1, "4.5", "Nguyen Restaurant"));
        asiaFoodList.add(new AsiaFood("Heo quay", "85.000", R.drawable.heoquay, "4.2", "Dat Restaurant"));
        asiaFoodList.add(new AsiaFood("Bún Chả Hà Nội", "30.000", R.drawable.buncha, "4.5", "Hao Restaurant"));
        asiaFoodList.add(new AsiaFood("Phở Bò", "25.000", R.drawable.pho, "4.8", "Thao Restaurant"));
        asiaFoodList.add(new AsiaFood("Bánh Xèo", "30.000", R.drawable.bx, "4.5", "Phuong Restaurant"));
        asiaFoodList.add(new AsiaFood("Cơm Tấm", "35.000", R.drawable.rice, "4.2", "Hao Restaurant"));

        setAsiaRecycler(asiaFoodList);

    }


    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }
    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {

        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);

    }
}

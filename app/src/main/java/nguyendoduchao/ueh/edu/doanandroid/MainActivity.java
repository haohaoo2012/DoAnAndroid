package nguyendoduchao.ueh.edu.doanandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import nguyendoduchao.ueh.edu.doanandroid.adapter.AsiaFoodAdapter;
import nguyendoduchao.ueh.edu.doanandroid.adapter.PopularFoodAdapter;
import nguyendoduchao.ueh.edu.doanandroid.model.AsiaFood;
import nguyendoduchao.ueh.edu.doanandroid.model.PopularFood;

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

        // now here we will add some dummy data to out model class

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Bánh Bột Lọc Huế", "15k", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Đùi Gà Chiên Giòn", "45k", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Cá Chiên Giòn", "30k", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Bánh Bột Lọc Huế", "15k", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Đùi Gà Chiên Giòn", "45k", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Cá Chiên Giòn", "30k", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);


        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("Pizza Hải Sản", "120k", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Bánh Kem Dâu", "85k", R.drawable.asiafood2, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Pizza Hải Sản", "$20", R.drawable.images, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Bánh Kem Dâu", "$25", R.drawable.img, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Pizza Hải Sản", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Bánh Kem Dâu", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"));

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
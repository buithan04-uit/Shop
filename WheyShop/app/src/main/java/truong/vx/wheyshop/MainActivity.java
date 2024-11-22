package truong.vx.wheyshop;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView recyclerView1;
    int id = 1;
    int id1;
    private String title;
    private int imageId;
    private String description;
    private double price;
    private double star;
    private int categoryId;
    private int LocationId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<Category>();
        categoryList.add(new Category("Fruit" , R.drawable.cat2, 1));
        categoryList.add(new Category("Vegetable" , R.drawable.cat1, 2));
        categoryList.add(new Category("Milk" , R.drawable.cat3, 3));
        categoryList.add(new Category("Drink" , R.drawable.cat4, 4));
        categoryList.add(new Category("Bread" , R.drawable.cat5, 5));



        recyclerView=findViewById(R.id.CategoryView);
        recyclerView1 = findViewById(R.id.BestDealView);
        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryList);
        recyclerView.setAdapter(categoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<BestDeal> bestDealList = new ArrayList<BestDeal>();
        bestDealList.add (new BestDeal("Strawberry" , R.drawable.atrawberry , "abc" ,5.96 , 4.4 , 1, 1, 1));
        bestDealList.add (new BestDeal("Apple" , R.drawable.apple , "abc" ,4.5 , 3.5 , 1, 1, 1));
        bestDealList.add (new BestDeal("Berry" , R.drawable.berry , "abc" ,3.5 , 1 , 1, 1, 1));
        BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
        recyclerView1.setAdapter(bestDealAdapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
        bestDealAdapter.setItemCickListener(new CategoryAdapter.OnMyItemCickListener() {
            @Override
            public void DoSomeThing(int position) {

                id1 = bestDealList.get(position).getId();
                title = bestDealList.get(position).getTitle();
                imageId = bestDealList.get(position).getImageId();
                description = bestDealList.get(position).getDescription();
                price = bestDealList.get(position).getPrice();
                star = bestDealList.get(position).getStar();

                Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                intent.putExtra("id" , id1);
                intent.putExtra("title" , title);
                intent.putExtra("imageId" , imageId);
                intent.putExtra("decription" , description);
                intent.putExtra("price" , price);
                intent.putExtra("star" , star);

                startActivity(intent);
            }
        });

        categoryAdapter.setItemCickListener(new CategoryAdapter.OnMyItemCickListener() {
            @Override
            public void DoSomeThing(int position) {
                id = categoryList.get(position).getId();

                if (id == 1){
                    List<BestDeal> bestDealList = new ArrayList<BestDeal>();
                    bestDealList.add (new BestDeal("Strawberry" , R.drawable.atrawberry , "abc" ,5.96 , 4.4 , 1, 1, 1));
                    bestDealList.add (new BestDeal("Apple" , R.drawable.apple , "abc" ,4.5 , 3.5 , 1, 1, 1));
                    bestDealList.add (new BestDeal("Berry" , R.drawable.berry , "abc" ,3.5 , 1 , 1, 1, 1));
                    BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
                    recyclerView1.setAdapter(bestDealAdapter);
                    recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    bestDealAdapter.setItemCickListener(new CategoryAdapter.OnMyItemCickListener() {
                        @Override
                        public void DoSomeThing(int position) {

                            id1 = bestDealList.get(position).getId();
                            title = bestDealList.get(position).getTitle();
                            imageId = bestDealList.get(position).getImageId();
                            description = bestDealList.get(position).getDescription();
                            price = bestDealList.get(position).getPrice();
                            star = bestDealList.get(position).getStar();

                            Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                            intent.putExtra("id" , id1);
                            intent.putExtra("title" , title);
                            intent.putExtra("imageId" , imageId);
                            intent.putExtra("decription" , description);
                            intent.putExtra("price" , price);
                            intent.putExtra("star" , star);

                            startActivity(intent);
                        }
                    });
                }
                else if (id == 2){
                    List<BestDeal> bestDealList = new ArrayList<BestDeal>();
                    bestDealList.add (new BestDeal("Orange" , R.drawable.orange , "abc" ,5 , 4.3 , 1, 1, 1));
                    bestDealList.add (new BestDeal("Pineaple" , R.drawable.pineaplle , "abc" ,3.79 , 2.5 , 1, 1, 1));
                    bestDealList.add (new BestDeal("Watermelon" , R.drawable.watermelon , "abc" ,6.49 , 5 , 1, 1, 1));
                    BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
                    recyclerView1.setAdapter(bestDealAdapter);
                    recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    bestDealAdapter.setItemCickListener(new CategoryAdapter.OnMyItemCickListener() {
                        @Override
                        public void DoSomeThing(int position) {

                            id1 = bestDealList.get(position).getId();
                            title = bestDealList.get(position).getTitle();
                            imageId = bestDealList.get(position).getImageId();
                            description = bestDealList.get(position).getDescription();
                            price = bestDealList.get(position).getPrice();
                            star = bestDealList.get(position).getStar();

                            Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                            intent.putExtra("id" , id1);
                            intent.putExtra("title" , title);
                            intent.putExtra("imageId" , imageId);
                            intent.putExtra("decription" , description);
                            intent.putExtra("price" , price);
                            intent.putExtra("star" , star);

                            startActivity(intent);
                        }
                    });
                }
            }
        });




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
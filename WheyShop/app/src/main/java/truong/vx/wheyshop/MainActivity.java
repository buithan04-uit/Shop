package truong.vx.wheyshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
    int id1 , idCategory;
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

        Intent intent = getIntent();
        idCategory = intent.getIntExtra("idCategory" , 1);



        recyclerView=findViewById(R.id.CategoryView);
        recyclerView1 = findViewById(R.id.BestDealView);
        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryList);
        recyclerView.setAdapter(categoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<BestDeal> bestDealList = new ArrayList<BestDeal>();
        if (idCategory == 1){
            bestDealList.add (new BestDeal("Strawberry" , R.drawable.atrawberry , "abc" ,3.96 , 4.4 , 1, 1, 1));
            bestDealList.add (new BestDeal("Apple" , R.drawable.apple , "abc" ,4.5 , 3.5 , 2, 1, 1));
            bestDealList.add (new BestDeal("Berry" , R.drawable.berry , "abc" ,3.5 , 1 , 3, 1, 1));
            bestDealList.add (new BestDeal("Orange" , R.drawable.orange , "abc" ,5 , 4.3 , 4, 1, 1));
            bestDealList.add (new BestDeal("Pineaple" , R.drawable.pineaplle , "abc" ,3.76 , 2.5 , 5, 1, 1));
            bestDealList.add (new BestDeal("Watermelon" , R.drawable.watermelon , "abc" ,6.49 , 5 , 6, 1, 1));
            bestDealList.add (new BestDeal("Banana" , R.drawable.banana , "abc" ,3.69 , 5 , 7, 1, 1));
            bestDealList.add (new BestDeal("Vargua" , R.drawable.vargua , "abc" ,2.49 , 4.2 , 8, 1, 1));
            bestDealList.add (new BestDeal("Kiwi" , R.drawable.kiwi1 , "abc" ,1.85 , 4.3 , 9, 1, 1));
        }
        if (idCategory == 2){
            bestDealList.add (new BestDeal("Carot" , R.drawable.carot , "abc" ,3.96 , 4.4 , 1, 2, 1));
            bestDealList.add (new BestDeal("Cabbage" , R.drawable.bapcai , "abc" ,4.49 , 3.5 , 2, 2, 1));
            bestDealList.add (new BestDeal("Bitter cabbage" , R.drawable.raucai , "abc" ,3.5 , 2.3 , 3, 2, 1));
            bestDealList.add (new BestDeal("Beetroot" , R.drawable.cuden , "abc" ,3.5 , 3.7 , 4, 2, 1));
            bestDealList.add (new BestDeal("Tomato" , R.drawable.tomato , "abc" ,3.75 , 4.7 , 5, 2, 1));
            bestDealList.add (new BestDeal("Potato" , R.drawable.potato , "abc" ,3.25 , 2.8, 6, 2, 1));
            bestDealList.add (new BestDeal("Spinach" , R.drawable.raumuong , "abc" ,2.5 , 3.9 , 7, 2, 1));
            bestDealList.add (new BestDeal("Broccoli" , R.drawable.suplo , "abc" ,2.79 , 5, 8, 2, 1));
            bestDealList.add (new BestDeal("Eggplant" , R.drawable.catim , "abc" ,1.29 , 1.4 , 9, 2, 1));
        }
        if (idCategory == 3){
            bestDealList.add (new BestDeal("Mix" , R.drawable.all , "abc" ,3.96 , 4.4 , 1, 3, 1));
            bestDealList.add (new BestDeal("Milo" , R.drawable.milo , "abc" ,4.49 , 3.5 , 2, 3, 1));
            bestDealList.add (new BestDeal("TH True milk" , R.drawable.thtrue , "abc" ,3.5 , 2.3 , 3, 3, 1));
            bestDealList.add (new BestDeal("Dau nanh" , R.drawable.daunanh , "abc" ,3.5 , 3.7 , 4, 3, 1));
            bestDealList.add (new BestDeal("Nutri food" , R.drawable.nutri , "abc" ,3.75 , 4.7 , 5, 3, 1));
            bestDealList.add (new BestDeal("Optimum" , R.drawable.optimum , "abc" ,3.25 , 2.8, 6, 3, 1));
            bestDealList.add (new BestDeal("Oc cho" , R.drawable.occho , "abc" ,2.5 , 3.9 , 7, 3, 1));
            bestDealList.add (new BestDeal("Yen mach" , R.drawable.yenmach , "abc" ,2.79 , 5, 8, 3, 1));
        }
        if (idCategory == 4){
            bestDealList.add (new BestDeal("Orange" , R.drawable.cam , "abc" ,3.96 , 4.4 , 1, 4, 1));
            bestDealList.add (new BestDeal("Luu" , R.drawable.luu , "abc" ,4.49 , 3.5 , 2, 4, 1));
            bestDealList.add (new BestDeal("Kiwi" , R.drawable.kiwi , "abc" ,3.5 , 2.3 , 3, 4, 1));
            bestDealList.add (new BestDeal("Coconut" , R.drawable.dua , "abc" ,3.5 , 3.7 , 4, 4, 1));
            bestDealList.add (new BestDeal("Watermelon" , R.drawable.duahau , "abc" ,3.75 , 4.7 , 5, 4, 1));
            bestDealList.add (new BestDeal("Pineaple" , R.drawable.thom , "abc" ,3.25 , 2.8, 6, 4, 1));
            bestDealList.add (new BestDeal("Apple" , R.drawable.tao , "abc" ,2.5 , 3.9 , 7, 4, 1));
            bestDealList.add (new BestDeal("Vargua" , R.drawable.oi , "abc" ,2.79 , 5, 8, 4, 1));
        }
        if (idCategory == 5){
            bestDealList.add (new BestDeal("BreadVN" , R.drawable.banh1 , "abc" ,3.96 , 4.4 , 1, 2, 1));
            bestDealList.add (new BestDeal("Bread" , R.drawable.banh2 , "abc" ,4.49 , 3.5 , 2, 2, 1));
            bestDealList.add (new BestDeal("Bread New" , R.drawable.banh3 , "abc" ,3.5 , 2.3 , 3, 2, 1));
            bestDealList.add (new BestDeal("Bread Franch" , R.drawable.banh4 , "abc" ,3.5 , 3.7 , 4, 2, 1));
            bestDealList.add (new BestDeal("Sanwich" , R.drawable.banh5 , "abc" ,3.75 , 4.7 , 5, 2, 1));
            bestDealList.add (new BestDeal("Sanwich New" , R.drawable.banh6 , "abc" ,3.25 , 2.8, 6, 2, 1));
            bestDealList.add (new BestDeal("Sanwich Berry" , R.drawable.banh7 , "abc" ,2.5 , 3.9 , 7, 2, 1));
        }

        BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
        recyclerView1.setAdapter(bestDealAdapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
        bestDealAdapter.setItemCickListener(new BestDealAdapter.OnMyItemCickListener() {
            @Override
            public void DoSomeThing(int position) {
                BestDeal bestDeal = bestDealList.get(position);
                Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                intent.putExtra("bestDeal" , bestDeal);
                startActivity(intent);
            }
        });

        categoryAdapter.setItemCickListener(new CategoryAdapter.OnMyItemCickListener() {
            @Override
            public void DoSomeThing(int position) {
                id = categoryList.get(position).getId();

                if (id == 1){
                    List<BestDeal> bestDealList = new ArrayList<BestDeal>();
                    bestDealList.add (new BestDeal("Strawberry" , R.drawable.atrawberry , "abc" ,3.96 , 4.4 , 1, 1, 1));
                    bestDealList.add (new BestDeal("Apple" , R.drawable.apple , "abc" ,4.5 , 3.5 , 2, 1, 1));
                    bestDealList.add (new BestDeal("Berry" , R.drawable.berry , "abc" ,3.5 , 1 , 3, 1, 1));
                    bestDealList.add (new BestDeal("Orange" , R.drawable.orange , "abc" ,5 , 4.3 , 4, 1, 1));
                    bestDealList.add (new BestDeal("Pineaple" , R.drawable.pineaplle , "abc" ,3.76 , 2.5 , 5, 1, 1));
                    bestDealList.add (new BestDeal("Watermelon" , R.drawable.watermelon , "abc" ,6.49 , 5 , 6, 1, 1));
                    bestDealList.add (new BestDeal("Banana" , R.drawable.banana , "abc" ,3.69 , 5 , 7, 1, 1));
                    bestDealList.add (new BestDeal("Vargua" , R.drawable.vargua , "abc" ,2.49 , 4.2 , 8, 1, 1));
                    bestDealList.add (new BestDeal("Kiwi" , R.drawable.kiwi1 , "abc" ,1.85 , 4.3 , 9, 1, 1));
                    BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
                    recyclerView1.setAdapter(bestDealAdapter);
                    recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    bestDealAdapter.setItemCickListener(new BestDealAdapter.OnMyItemCickListener() {
                        @Override
                        public void DoSomeThing(int position) {
                            BestDeal bestDeal = bestDealList.get(position);
                            Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                            intent.putExtra("bestDeal" , bestDeal);
                            startActivity(intent);
                        }
                    });
                }
                else if (id == 2){
                    List<BestDeal> bestDealList = new ArrayList<BestDeal>();
                    bestDealList.add (new BestDeal("Carot" , R.drawable.carot , "abc" ,3.96 , 4.4 , 1, 2, 1));
                    bestDealList.add (new BestDeal("Cabbage" , R.drawable.bapcai , "abc" ,4.49 , 3.5 , 2, 2, 1));
                    bestDealList.add (new BestDeal("Bitter cabbage" , R.drawable.raucai , "abc" ,3.5 , 2.3 , 3, 2, 1));
                    bestDealList.add (new BestDeal("Beetroot" , R.drawable.cuden , "abc" ,3.5 , 3.7 , 4, 2, 1));
                    bestDealList.add (new BestDeal("Tomato" , R.drawable.tomato , "abc" ,3.75 , 4.7 , 5, 2, 1));
                    bestDealList.add (new BestDeal("Potato" , R.drawable.potato , "abc" ,3.25 , 2.8, 6, 2, 1));
                    bestDealList.add (new BestDeal("Spinach" , R.drawable.raumuong , "abc" ,2.5 , 3.9 , 7, 2, 1));
                    bestDealList.add (new BestDeal("Broccoli" , R.drawable.suplo , "abc" ,2.79 , 5, 8, 2, 1));
                    bestDealList.add (new BestDeal("Eggplant" , R.drawable.catim , "abc" ,1.29 , 1.4 , 9, 2, 1));
                    BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
                    recyclerView1.setAdapter(bestDealAdapter);
                    recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    bestDealAdapter.setItemCickListener(new BestDealAdapter.OnMyItemCickListener() {
                        @Override
                        public void DoSomeThing(int position) {
                            BestDeal bestDeal = bestDealList.get(position);
                            Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                            intent.putExtra("bestDeal" , bestDeal);
                            startActivity(intent);
                        }
                    });
                }
                else if (id == 3){
                    List<BestDeal> bestDealList = new ArrayList<BestDeal>();
                    bestDealList.add (new BestDeal("Mix" , R.drawable.all , "abc" ,3.96 , 4.4 , 1, 3, 1));
                    bestDealList.add (new BestDeal("Milo" , R.drawable.milo , "abc" ,4.49 , 3.5 , 2, 3, 1));
                    bestDealList.add (new BestDeal("TH True milk" , R.drawable.thtrue , "abc" ,3.5 , 2.3 , 3, 3, 1));
                    bestDealList.add (new BestDeal("Dau nanh" , R.drawable.daunanh , "abc" ,3.5 , 3.7 , 4, 3, 1));
                    bestDealList.add (new BestDeal("Nutri food" , R.drawable.nutri , "abc" ,3.75 , 4.7 , 5, 3, 1));
                    bestDealList.add (new BestDeal("Optimum" , R.drawable.optimum , "abc" ,3.25 , 2.8, 6, 3, 1));
                    bestDealList.add (new BestDeal("Oc cho" , R.drawable.occho , "abc" ,2.5 , 3.9 , 7, 3, 1));
                    bestDealList.add (new BestDeal("Yen mach" , R.drawable.yenmach , "abc" ,2.79 , 5, 8, 3, 1));
                    BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
                    recyclerView1.setAdapter(bestDealAdapter);
                    recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    bestDealAdapter.setItemCickListener(new BestDealAdapter.OnMyItemCickListener() {
                        @Override
                        public void DoSomeThing(int position) {
                            BestDeal bestDeal = bestDealList.get(position);
                            Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                            intent.putExtra("bestDeal" , bestDeal);
                            startActivity(intent);
                        }
                    });
                }
                else if (id == 4){
                    List<BestDeal> bestDealList = new ArrayList<BestDeal>();
                    bestDealList.add (new BestDeal("Orange" , R.drawable.cam , "abc" ,3.96 , 4.4 , 1, 4, 1));
                    bestDealList.add (new BestDeal("Luu" , R.drawable.luu , "abc" ,4.49 , 3.5 , 2, 4, 1));
                    bestDealList.add (new BestDeal("Kiwi" , R.drawable.kiwi , "abc" ,3.5 , 2.3 , 3, 4, 1));
                    bestDealList.add (new BestDeal("Coconut" , R.drawable.dua , "abc" ,3.5 , 3.7 , 4, 4, 1));
                    bestDealList.add (new BestDeal("Watermelon" , R.drawable.duahau , "abc" ,3.75 , 4.7 , 5, 4, 1));
                    bestDealList.add (new BestDeal("Pineaple" , R.drawable.thom , "abc" ,3.25 , 2.8, 6, 4, 1));
                    bestDealList.add (new BestDeal("Apple" , R.drawable.tao , "abc" ,2.5 , 3.9 , 7, 4, 1));
                    bestDealList.add (new BestDeal("Vargua" , R.drawable.oi , "abc" ,2.79 , 5, 8, 4, 1));

                    BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
                    recyclerView1.setAdapter(bestDealAdapter);
                    recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    bestDealAdapter.setItemCickListener(new BestDealAdapter.OnMyItemCickListener() {
                        @Override
                        public void DoSomeThing(int position) {
                            BestDeal bestDeal = bestDealList.get(position);
                            Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                            intent.putExtra("bestDeal" , bestDeal);
                            startActivity(intent);
                        }
                    });
                }
                else if (id == 5){
                    List<BestDeal> bestDealList = new ArrayList<BestDeal>();
                    bestDealList.add (new BestDeal("BreadVN" , R.drawable.banh1 , "abc" ,3.96 , 4.4 , 1, 5, 1));
                    bestDealList.add (new BestDeal("Bread" , R.drawable.banh2 , "abc" ,4.49 , 3.5 , 2, 5, 1));
                    bestDealList.add (new BestDeal("Bread New" , R.drawable.banh3 , "abc" ,3.5 , 2.3 , 3, 5, 1));
                    bestDealList.add (new BestDeal("Bread Franch" , R.drawable.banh4 , "abc" ,3.5 , 3.7 , 4, 5, 1));
                    bestDealList.add (new BestDeal("Sanwich" , R.drawable.banh5 , "abc" ,3.75 , 4.7 , 5, 5, 1));
                    bestDealList.add (new BestDeal("Sanwich New" , R.drawable.banh6 , "abc" ,3.25 , 2.8, 6, 5, 1));
                    bestDealList.add (new BestDeal("Sanwich Berry" , R.drawable.banh7 , "abc" ,2.5 , 3.9 , 7, 5, 1));

                    BestDealAdapter bestDealAdapter = new BestDealAdapter(bestDealList);
                    recyclerView1.setAdapter(bestDealAdapter);
                    recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    bestDealAdapter.setItemCickListener(new BestDealAdapter.OnMyItemCickListener() {
                        @Override
                        public void DoSomeThing(int position) {
                            BestDeal bestDeal = bestDealList.get(position);
                            Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                            intent.putExtra("bestDeal" , bestDeal);
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

    public void Btncart (View view){
        Intent intent = new Intent(this , Cart.class);
        startActivity(intent);
    }
}
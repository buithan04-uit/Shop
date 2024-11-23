package truong.vx.wheyshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Cart extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BestDeal bestDeal;
    private int num;
    private TextView totalTxt;
    private double total = 0;
    private List<BestDeal> bestDealList;
    private List<Integer> numList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        totalTxt = findViewById(R.id.total);
        recyclerView = findViewById(R.id.Cartview);

        if (savedInstanceState != null) {
            bestDealList = savedInstanceState.getParcelableArrayList("bestDealList");
            numList = savedInstanceState.getIntegerArrayList("numList");
        } else {
            bestDealList = new ArrayList<>();
            numList = new ArrayList<>();
        }

        Intent intent = getIntent();
        num = intent.getIntExtra("num", 0);
        bestDeal = intent.getParcelableExtra("bestDeal");

        if (bestDeal != null) {
            bestDealList.add(bestDeal);
            numList.add(num);
        }

        CartAdapter cartAdapter = new CartAdapter(bestDealList, numList);
        recyclerView.setAdapter(cartAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList("bestDealList", new ArrayList<Parcelable>(bestDealList));
        outState.putIntegerArrayList("numList", new ArrayList<>(numList));
        outState.putInt("num", num);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        bestDealList = savedInstanceState.getParcelableArrayList("bestDealList");
        numList = savedInstanceState.getIntegerArrayList("numList");
        num = savedInstanceState.getInt("num");
    }

    public void BtnBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Btnexplore(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
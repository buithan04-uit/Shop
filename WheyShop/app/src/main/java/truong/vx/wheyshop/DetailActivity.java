package truong.vx.wheyshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
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

public class DetailActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView imageView;
    TextView titleTxt, decriptionTxt, priceTxt , starTxt , totalTxt , numTxt;
    RatingBar ratingBar;
    int num = 1;
    int id1;
    private String title;
    private int imageId;
    private String description;
    private double price;
    private double star;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        id1 = intent.getIntExtra("id" , 0);
        imageId = intent.getIntExtra("imageId" , 0);
        description = intent.getStringExtra("decription");
        price = intent.getDoubleExtra("price" , 0);
        star = intent.getDoubleExtra("star" , 0);


        imageView = findViewById(R.id.image);
        imageView.setImageResource(imageId);

        titleTxt = findViewById(R.id.titleText);
        decriptionTxt = findViewById(R.id.DecripText);
        priceTxt = findViewById(R.id.priceText);
        starTxt = findViewById(R.id.rateText);
        ratingBar = findViewById(R.id.ratingBar);
        totalTxt = findViewById(R.id.totalTxt);
        numTxt = findViewById(R.id.numText);

        titleTxt.setText(title);
        decriptionTxt.setText(description);
        priceTxt.setText(price + " $/Kg");
        starTxt.setText("" + star);
        ratingBar.setRating((float) star);
        totalTxt.setText(num * price + " $");
        numTxt.setText(num + " Kg");




        recyclerView = findViewById(R.id.BestDealView1);
        List<BestDeal> bestDealList = new ArrayList<BestDeal>();
        bestDealList.add (new BestDeal("Strawberry" , R.drawable.atrawberry , "abc" ,5.96 , 4 , 1, 1, 1));
        bestDealList.add (new BestDeal("Apple" , R.drawable.apple , "abc" ,5 , 4 , 1, 1, 1));
        bestDealList.add (new BestDeal("Berry" , R.drawable.berry , "abc" ,5 , 4 , 1, 1, 1));
        bestDealList.add (new BestDeal("Orange" , R.drawable.orange , "abc" ,5 , 4 , 1, 1, 1));
        bestDealList.add (new BestDeal("Pineaple" , R.drawable.pineaplle , "abc" ,5 , 4 , 1, 1, 1));
        bestDealList.add (new BestDeal("Watermelon" , R.drawable.watermelon , "abc" ,5 , 4 , 1, 1, 1));
        SimilarAdapter similarAdapter = new SimilarAdapter(bestDealList);
        recyclerView.setAdapter(similarAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(DetailActivity.this, LinearLayoutManager.HORIZONTAL, false));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void BtnBack (View view){
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }

    public void DecBtn_Onclick (View view){
        if (num > 1) num--;
        totalTxt.setText(num * price + " $");
        numTxt.setText(num + " Kg");
    }
    public void IncBtn_Onclick (View view){
        num++;
        totalTxt.setText(num * price + " $");
        numTxt.setText(num + " Kg");
    }
}
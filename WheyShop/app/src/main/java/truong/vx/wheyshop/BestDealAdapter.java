package truong.vx.wheyshop;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BestDealAdapter extends RecyclerView.Adapter<BestDealAdapter.MyViewHolder> {

    private List<BestDeal> bestDealList;
    public  interface OnMyItemCickListener{
        void DoSomeThing (int position);
    }
    private CategoryAdapter.OnMyItemCickListener itemCickListener;
    public void setItemCickListener(CategoryAdapter.OnMyItemCickListener itemCickListener) {
        this.itemCickListener = itemCickListener;
    }
    public BestDealAdapter(List<BestDeal> bestDealList) {
        this.bestDealList = bestDealList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_bestdeal,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        BestDeal bestDeal = bestDealList.get(position);
        holder.imageView.setImageResource(bestDeal.getImageId());
        holder.titleView.setText(bestDeal.getTitle());
        holder.price.setText("" + bestDeal.getPrice() + " $/Kg");
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemCickListener.DoSomeThing(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bestDealList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private ConstraintLayout cardView;
        private ImageView imageView;
        private TextView titleView;
        private TextView price;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.constraint);
            imageView = itemView.findViewById(R.id.imageBestdeal);
            titleView = itemView.findViewById(R.id.Title);
            price = itemView.findViewById(R.id.Price);
        }
    }
}

package kg.less.less_04;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import kg.less.less_04.databinding.ItemContinentBinding;

public class ContinentAdapter  extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<String> continentList;
    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<String> countryList, OnItemClick onClick) {
        this.continentList = countryList;
        this.onItemClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentAdapter.ContinentViewHolder holder, int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onItemClick.onClick(position);
        });
    }


    @Override
    public int getItemCount() {
        return continentList.size();
    }


    class ContinentViewHolder extends RecyclerView.ViewHolder {

        private ItemContinentBinding binding;

        public ContinentViewHolder(@NonNull ItemContinentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(String country) {
            binding.tvContinent.setText(country);
        }

    }
}


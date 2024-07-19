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
import kg.less.less_04.databinding.ItemCountryBinding;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHoder> {

    private ArrayList<String> countryList;


    public CountryAdapter(ArrayList<String> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHoder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHoder holder, int position) {
        holder.onBind(countryList.get(position));
    }


    @Override
    public int getItemCount() {
        return countryList.size();
    }

    class CountryViewHoder extends RecyclerView.ViewHolder {
        private ItemCountryBinding binding;
        public CountryViewHoder (@NonNull ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void onBind(String country){
            binding.tvCountry.setText(country);
        }
    }

}


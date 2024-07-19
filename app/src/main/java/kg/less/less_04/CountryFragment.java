package kg.less.less_04;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

import kg.less.less_04.databinding.FragmentCountryBinding;


public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private final ArrayList<String> countryList = new ArrayList<>();


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        assert getArguments() != null;
        String continent = getArguments().getString("key1");
        assert continent != null;
        position(continent);
        binding.rvCountry.setAdapter(countryAdapter);
    }


    private void position(String continent) {
        if (Objects.equals(continent, "Африка")) {
            countryList.add("Южно-Африканская Республика");
            countryList.add("Нигерия");
            countryList.add("Кения");
            countryList.add("Марокко");
        } else if (Objects.equals(continent, "Азия")) {
            countryList.add("Китай");
            countryList.add("Индия");
            countryList.add("Япония");
            countryList.add("Индонезия");
            countryList.add("Южная Корея");
        } else if (Objects.equals(continent, "Европа")) {
            countryList.add("Франция");
            countryList.add("Германия");
            countryList.add("Италия");
            countryList.add("Испания");
            countryList.add("Великобритания");
        } else if (Objects.equals(continent, "Северная Америка")) {
            countryList.add("США");
            countryList.add("Канада");
            countryList.add("Мексика");
            countryList.add("Куба");
            countryList.add("Ямайка");
        } else if (Objects.equals(continent, "Южная Америка")) {
            countryList.add("Бразилия");
            countryList.add("Аргентина");
            countryList.add("Чили");
            countryList.add("Колумбия");
            countryList.add("Перу");
        }
    }

}
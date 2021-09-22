package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sweet 'Ugali'🤤 with Meat stew😋","200 gm flour....Known as Unga," +
                "5 cups of clean water" +
                "Have a cooking spoon known as mwiko" +
                "2 tablespoon vegetable oil" +
                "Greens ...Buy sukuma wiki" +
                "1 ts of salt" +
                "Chopped Meat" +
                "1 onion"+
                "2 tomatoes"+
                "1 teaspoon tomato ketchup" +
                "1 tablespoon green chilli sauce","Method",
                "Ugali is an easy meal to cook, Boil the water and add the flour while stirring." +
                        "While stirring the ugali will be forming as its being heated.Moud it into a dome and tilt it after coking it" +
                        " Chop the onion and fry it" +
                        "Chop the tomatoes and add them after the onions are well heated to a brown texture"+
                        "Add the meat that you have already boiled it "+
                        "Add the greens and let it all heat for 7 minutes"+
                        " A mut serve with chai😁!\n", R.drawable.ugali));

        recipes1.add(new Recipes("Donut","1 c. whole milk" +
                "1/4 c. plus 1 tsp. granulated sugar, divided" +
                "1 packet (or 2 1/4 tsp.) active dry yeast " +
                "4 c. all-purpose flour, plus more if needed" +
                "1/2 tsp. kosher salt" +
                "6 tbsp. melted butter" +
                "2 large eggs" +
                "1/2 tsp. pure vanilla extract" +
                "Canola or vegetable oil, for frying","Method","\n" +
                "Grease a large bowl with cooking spray and set aside. In a small, microwave-safe bowl or glass measuring cup, add milk. Microwave until lukewarm, 40 seconds. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\n" +
                "Make glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth. Set aside.\n" +
                "Line a large baking sheet with paper towels. In a large dutch oven over medium heat, heat 2'' oil to 350°. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side. Holes will cook even faster!\n" +
                "Transfer doughnuts to paper towel-lined baking sheet to drain and cool slightly. Dip into glaze, then place onto a cooling rack (or eat immediately!)",R.drawable.donut1));
        recipes1.add(new Recipes("Dosa","3 cups rice" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa1));
        recipes1.add(new Recipes("Pancake","1 1/4 cups milk" +
                "1 egg" +
                "3 tablespoons butter melted" +
                "1 1/2 cups all-purpose flour" +
                "3 1/2 teaspoons baking powder" +
                "1 teaspoon salt" +
                "1 tablespoon white sugar","Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.pancakes));
        recipes1.add(new Recipes("White Tea","2 Cups of Milk" +
                "2 tsp of Tea Leaves" +
                "4 tsp of Fine Sugar try ginger" +
                "1 cup of water" +
                "","Method",
                "firstly,Add the Milk to a clean cooking pot." +
                "Add the Water as prescribed to the milk." +
                "now add the 2 tsp of tea leaves." +
                "Also add the sugar ." +
                "Mix it and heat it to up to boil where it swells up." +
                "After boiling mix it properly and wait for it to heat." +
                "finally, serve the tea in huge kenyan style mugs☕ and feel the Africanacity😂", R.drawable.tea1));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}

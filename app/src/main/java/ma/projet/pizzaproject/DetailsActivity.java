package ma.projet.pizzaproject;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = findViewById(R.id.photo);
        TextView nameTextView = findViewById(R.id.nom);
        TextView descriptionTextView = findViewById(R.id.description);
        TextView ingredientsTextView = findViewById(R.id.detailsIngred);
        TextView preparationTextView = findViewById(R.id.preparation);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int photo = extras.getInt("photo");
            String nom = extras.getString("nom");
            String description = extras.getString("description");
            String detailsIngred = extras.getString("detailsIngred");
            String preparation = extras.getString("preparation");

            //Log.d("DetailsActivity", "photo: " + photo);
            //Log.d("DetailsActivity", "nom: " + nom);
            //Log.d("DetailsActivity", "description: " + description);
            //Log.d("DetailsActivity", "detailsIngred: " + detailsIngred);
            //Log.d("DetailsActivity", "preparation: " + preparation);

            imageView.setImageResource(photo);
            nameTextView.setText(nom);
            descriptionTextView.setText(description);
            ingredientsTextView.setText(detailsIngred);
            preparationTextView.setText(preparation);
        }

    }
}

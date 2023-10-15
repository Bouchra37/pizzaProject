package ma.projet.pizzaproject.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ma.projet.pizzaproject.R;
import ma.projet.pizzaproject.classes.Produit;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;
    public PizzaAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        TextView duree = convertView.findViewById(R.id.duree);
        //TextView detailsIngred = convertView.findViewById(R.id.detailsIngred);
        //TextView description = convertView.findViewById(R.id.description);
        //TextView preparation = convertView.findViewById(R.id.preparation);
        ImageView photo = convertView.findViewById(R.id.photo);

        TextView id = convertView.findViewById(R.id.id);

        nom.setText(produits.get(position).getNom());
        nbrIngredients.setText(produits.get(position).getNbrIngredients()+"");
        photo.setImageResource(produits.get(position).getPhoto());
        duree.setText(produits.get(position).getDuree()+"");
        //detailsIngred.setText(produits.get(position).getDetailsIngred()+"");
        //description.setText(produits.get(position).getDescription()+"");
        //preparation.setText(produits.get(position).getPreparation()+"");
        id.setText(produits.get(position).getId()+"");
        return convertView;
    }


}

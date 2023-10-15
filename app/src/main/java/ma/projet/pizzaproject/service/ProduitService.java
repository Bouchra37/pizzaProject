package ma.projet.pizzaproject.service;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import ma.projet.pizzaproject.classes.Produit;
import ma.projet.pizzaproject.dao.IDao;

public class ProduitService implements IDao <Produit>{

    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }
    @Override
    public boolean create(Produit p){
        Log.d("Create : ", p.toString());
        return produits.add(p);
    }

    @Override
    public boolean update(Produit p){
        Produit pr = findById(p.getId());
        pr.setNom(p.getNom());
        pr.setNbrIngredients(p.getNbrIngredients());
        pr.setPhoto(p.getPhoto());
        pr.setDuree(p.getDuree());
        pr.setDetailsIngred(p.getDetailsIngred());
        pr.setDescription(p.getDescription());
        pr.setPreparation(p.getPreparation());
        return false;
    }
    @Override
    public boolean delete(Produit p){
        Log.d("Delete : ", p.toString());
        return produits.remove(p);
    }
    @Override
    public List<Produit> findAll(){
        Log.d("findAll : ", produits.size()+"");
        return produits;

    }

    @Override
    public Produit findById(int id){
        Log.d("FindById : ", id+"");
        for(Produit f : produits)
            if(f.getId() == id)
                return f;
        return null;

    }

}

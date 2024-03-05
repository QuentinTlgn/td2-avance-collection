package src.exo11;

public class ListeTableau<T> {
    private Object[] elements;
    private int taille; 

    
    public ListeTableau(int tailleInitiale) {
        this.elements = new Object[tailleInitiale];
        this.taille = 0;
    }

    public int getTaille() {
        return taille;
    }

    public void ajouter(T element) {
        if(taille == elements.length){
            Object[] nouveauTablau = new Object[2*taille];
            for(int i=0; i < elements.length; i++)
                nouveauTablau[i] = elements[i];
            elements = nouveauTablau;
        }
    }

    public T get(int index){
        return (T) elements[index];
    }
}

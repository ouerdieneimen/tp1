
public class Rectangle {
    float largeur,longeur;
    public Rectangle(float largeur, float longeur){
        this.largeur =largeur;
        this.longeur=longeur;
    }
    float perimetre(){
        return(largeur+longeur)+2;
    }
    float Diagonale(){
        return(largeur*largeur)+(longeur*longeur);
    }
    float Doubler (){
        return (longeur*longeur);
    }
}


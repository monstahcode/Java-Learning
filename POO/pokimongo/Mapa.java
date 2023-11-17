package POO.pokimongo;

public class Mapa {

    private int x;
    private int y;

    public Mapa() {
        this.x = 0;
        this.y = 0;
    }

    // Setters y Getters
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    // Methods
    public int moverArriba() {
        if (this.y > 10) {
            return this.y;
        } else {
            this.y += 1;
        }
        if (Math.random()*50 < 50){
            System.out.println("Ha aparecido un Pokimon salvaje");
            Pokimon pokimon1 = new Pokimon();
        } else {
            System.out.println("NO hay nada");
        }

        return this.y;
    }

    public int moverAbajo() {
        if (this.y < 0) {
            return this.y;
        } else {
            this.y -= 1;
        }
        return this.y;
    }

    public int moverDerecha() {
        if (this.x > 10) {
            return this.x;
        } else {
            this.x += 1;
        }
        return this.x;
    }

    public int moverIzquierda() {
        if (this.x < 10) {
            return this.x;
        } else {
            this.x -= 1;
        }
        return this.x;
    }
}

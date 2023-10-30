package POO.pokemon_land;

public class PokemonGo {

    public static void main(String[] args) {
        
        Pokemon pokemon1, pokemon2;

        pokemon1=new Pokemon('E',4,5,34);
        pokemon2=new Pokemon('W',5,2,28);

        System.out.println(pokemon1);
        pokemon1.Baya();
        pokemon1.Fight(pokemon2);
    }
}

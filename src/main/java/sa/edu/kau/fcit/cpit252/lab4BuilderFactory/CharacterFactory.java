
package sa.edu.kau.fcit.cpit252.lab4BuilderFactory;


public class CharacterFactory {

    // TODO: Addd a factory method that returns an object (Archer, FlagBearer, or Knight) by its type and name:
    public static Characters createCharacter(CharacterTypes type, String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A character must have a name!!");
        }
        switch (type){
            case ARCHER:
                return new Archer(name);
            case FLAG_BEARER:
                return new FlagBearer(name);
            case KNIGHT:
                return new Knight(name);
            default:
                throw new IllegalArgumentException("Unknown character type");

        }
    }
}

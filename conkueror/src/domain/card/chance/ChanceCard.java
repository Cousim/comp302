package domain.card;

import domain.util.CoreUtils;

import java.util.Arrays;

public class ChanceCard {

    public enum Type {
        Revolt,
        NuclearStrike,
        Draft,
        Bombardment,
        Reinforcements

    }

    public static Type[] withEffects = {
            Type.Reinforcements,
            Type.Revolt,
            Type.NuclearStrike,
            Type.Draft,
            Type.Bombardment
    };

    private Type type;

    public ChanceCard(Type type) {
        this.type = type;
    }

    public ChanceCard() {
        this.type = ChanceCard.getRandomType();
    }

    public Type getType() {
        return type;
    }

    public String toString() {
        return ChanceCard.typeToString(type);
    }

    public boolean hasEffect() {
        return Arrays.asList(withEffects).contains(type);
    }

    public Type getEffect() {
//        Game game = Game.getInstance();
        if (Arrays.asList(withEffects).contains(type))
            return type;
        return null;
    }

    public static Type getRandomType() {
        return CoreUtils.chooseRandom(Type.values());
    }

    public static String typeToString(Type type) {
        return type.toString().replaceAll("(.)([A-Z])", "$1 $2");
    }

}
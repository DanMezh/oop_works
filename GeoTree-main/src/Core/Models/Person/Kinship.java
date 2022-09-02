package FamilyTree.src.Core.Models.Person;

public enum Kinship {
    ANCESTOR(0),
    DESCENDANT(0),
    SIBLINGS(0),
    UNSPECIFIED(0);

    private int generation;

    Kinship(int generation) {
        this.generation = generation;
    }

    public static Kinship ancestor(int generation) {
        Kinship kinship = Kinship.ANCESTOR;
        kinship.setGeneration(generation);
        return kinship;
    }

    public static Kinship descendant(int generation) {
        Kinship kinship = Kinship.DESCENDANT;
        kinship.setGeneration(generation);
        return kinship;
    }

    public static Kinship siblings(int generation) {
        Kinship kinship = Kinship.SIBLINGS;
        kinship.setGeneration(generation);
        return kinship;
    }

    public static Kinship getKinshipByRelative(Kinship kinship) {
        if (kinship == Kinship.ANCESTOR) {
            return Kinship.descendant(kinship.getGeneration());
        }
        if (kinship == Kinship.DESCENDANT) {
            return Kinship.ancestor(kinship.getGeneration());
        }
        if (kinship == Kinship.SIBLINGS) {
            return Kinship.siblings(kinship.getGeneration() * (-1));
        }
        return Kinship.UNSPECIFIED;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
}

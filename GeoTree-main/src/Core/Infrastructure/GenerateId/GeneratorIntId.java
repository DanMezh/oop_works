package FamilyTree.src.Core.Infrastructure.GenerateId;

import java.util.Random;

public class GeneratorIntId implements GenerateIntId {


    public int genId() {
        return new Random().nextInt(Integer.MAX_VALUE);
    }

}

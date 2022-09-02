package Program.Person;

import Program.CupBoards.Cupboard;
import Program.Item.Item;
import Program.Item.ItemManager;

public interface CupBoardInteractor extends ItemManager {
    void openCupboard(Cupboard cupboard);

    void closeCupboard(Cupboard cupboard);

    void takeItem(Cupboard cupboard, Item item);

    void putItem(Cupboard cupboard, Item item);
}

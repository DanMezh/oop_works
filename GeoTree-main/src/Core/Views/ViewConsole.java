package FamilyTree.src.Core.Views;

import java.util.Scanner;

public class ViewConsole implements View {
    Scanner in = new Scanner(System.in);

    @Override
    public String get() {
        return in.next();
    }

    @Override
    public void show(String value) {
        System.out.print(value);
    }
}

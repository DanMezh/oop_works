package GuessNumberGame;

import SaveLoadSystem.SaveLoader;

public class Presenter<M extends Model, V extends View> {
    private M model;
    private V view;
    private SaveLoader<M> saveLoader;

    public Presenter(M m, V v) {
        model = m;
        view = v;
        saveLoader = new SaveLoader<>();
    }

    public void startGame() {
        while (model.isGamestate()) {
            String input = view.getInput("Введите число от 1 до 10 или букву 'S' для сохранения, 'L' для заргузки: ");
            if (input.equals("S")) {
                saveModel("save.sv", model); // используем единый сейв слот
            } else if (input.equals("L")) {
                loadModel("save.sv"); // используем единый сейв слот
            } else {
                try {
                    view.printOutput(model.numberInputResult(Integer.parseInt(input)));
                } catch (Exception e) {
                    view.printOutput("Неправильный ввод (команада не распознана)\n");
                }
            }
        }
    }

    private void saveModel(String path, M obj) {
        try {
            saveLoader.saveModel(path, obj);
            view.printOutput("Game Saved\n");
        } catch (Exception e) {
            view.printOutput(String.format("Save Failed. Error: %s\n", e.toString()));
        }

    }

    private void loadModel(String path) {
        try {
            model = saveLoader.loadModel(path);
            view.printOutput("Game Loaded\n");
        } catch (Exception e) {
            view.printOutput(String.format("Load Failed. Error: %s\n", e.toString()));
        }
    }
}

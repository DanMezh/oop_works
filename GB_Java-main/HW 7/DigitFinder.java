public abstract class DigitFinder {
    /**
     * Поиск неизвестных цифр методом перебора
     * @param exp - выражение вида a + b = e (где a,b,e >= 0 часть цифр может быть пропущена 2? + ?5 = ?3)
     * @return
     */
    public static String bruteFind(String exp) {
        //считаем кол-во неизвестных
        int countUnknown = 0;
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '?') {
                countUnknown += 1;
            }
        }
        StringBuilder expression = new StringBuilder(exp); //для удобной замены символа по индексу
        for (int i = 0; i < Math.pow(10, countUnknown); i++) { // максимальный перебор 10^(кол-во неизвестных)
            int curi = i; //текущая "маска" заменяемых цифр
            int replaceNum = 0; //норме заменяемого "?""
            for (int j = 0; j < exp.length(); j++) { //заменяем "?" на цифры
                if (exp.charAt(j) == '?') {
                    Integer guessNum = curi % 10; //срезаем последнюю цифру от общего перебора как подставляемую
                    if ((j == 0 || !Character.isDigit(exp.charAt(j - 1)) || !(exp.charAt(j - 1) == '?')) && guessNum == 0) { //проверем если цифра крайняя слева она не может быть 0
                        guessNum = 1;
                        i += (int)Math.pow(10, replaceNum); //заодно пропускаем часть перебора
                    }
                    expression.setCharAt(j, (char)(guessNum+'0'));
                    curi /= 10;
                    replaceNum++;
                }
            }
            if (checkExp(expression.toString())) {
                return expression.toString();
            }
        }
        return "Нет решения";
    }

    /**
     * Проверяем выражение на истинность
     * @param exp - выражение в виде строки (с заменёнными ? на цифры)
     * @return - выражение правдиво или ложно
     */
    private static Boolean checkExp(String exp) {
        String[] splitter = exp.split("="); // разделяем правую и левую часть выражения
        int leftSum = 0;
        int rightSum = 0;
        String[] leftPartData = splitter[0].split(" ");
        for (String element : leftPartData) { //перебираем элементы левой части если это числа то складываем
            if (Character.isDigit(element.charAt(0))) {
                leftSum += Integer.parseInt(element);
            }
        }
        rightSum = Integer.parseInt(splitter[1].trim());
        return leftSum == rightSum;
    }
}

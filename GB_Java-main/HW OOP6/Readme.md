## Описание проекта
Проект является учебным (в процессе изучения ООП на платформе [GeekBrains](https://Geekbarins.ru)

Проект создан по шаблону Model-View-Presenter
В качестве модели (Model) используется игра "Угадай число" с ограниченным количеством попыток (GuessNumGame).
В качестве вида используется консоль (ConsoleView).

Представитель так же добавляет функционал загрузки и сохранения (SaveLoadSystem) c единственным сейв слотом, что позволяет обойти лимит попыток в рамках одной игры, или загрузить ранее сохранённую игру в новой.

В данном коде сохранение и загрузка работает со всей игрой моделью (для такой малой игры, это возможно). 

Если использовать более крупную модель, нужно пересмотреть сохранение и загрузку лишь необходимой части модели позволяющей воссоздать её состояние.
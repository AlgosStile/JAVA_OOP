## Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования

Используйте предыдущие задачи из прошлого домашнего задания. Необходимо гарантированно продумать иерархию компонент
и взаимодействия их между собой.
Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”

Под исследованием передачу конкретного экземпляра класса узла и отношения
Передать узел (сына) и найти его отца
Передать узел (дедушка) и найти его внуков

Продумать возможность ухода он конкретных "котиков", к интерфейсу “котик”, лучше уйти от взаимодействия
с конкретными питомцами и повысить уровень абстракции до взаимодействия с котиком, собачкой или хомяком т е
с интерфейсом “животное”
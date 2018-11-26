package khai.w1

import khai.general.League
import khai.general.TypeSports

fun main(args: Array<String>) {

    val club1 = Football_club("Барселона","Barcelona",
            league= League.La_Liga, captain = "Лионель Месси",price = 3.16,yearofFoundation = "1899",
            coach = "Эрнесто Вальверде", holder = "Жозеп Бартомеу", typeSports = TypeSports.football, rating = 4)

    println(club1.getShortInfo())

    val list = initDataClasses()

    val manager:SportManager = SportManager
    manager.add(club1)
    list.forEach { println("Поиск клуба: " + manager.contains(club1)) }
    list.forEach { println("Добавление: "
            +manager.add(it)) }
    println(manager.getAll())

    //объект не меняется, та же ссылка

    println(manager.add(club1))
    println(manager.getAll())

    // удачное добавление дубля
    list.forEach { println("Добавление дубля: " + manager.add(it)) }
    //println(manager.getAll())

    list.forEach { println("Удаление клуба: " + manager.remove(club1)) }
  //  println(manager.getAll())

}
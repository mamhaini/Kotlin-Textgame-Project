import kotlin.time.measureTimedValue

fun main(args: Array<String>) {
    val tim = Player("Tim", 4, 1, 0)

    val nichirinblade = Weapon("Nichirin Blade",15)

//    println(tim.weapon.name)
//    println(tim.weapon.damageInflicted)

    tim.weapon = nichirinblade

//    println(tim.weapon.name)
//    println(tim.weapon.damageInflicted)

    val lowerdemon = Enemy("Lowerdemon", 2, 1 )

    val claws = Weapon("Claws",18)

    lowerdemon.weapon = claws

    lowerdemon.show()
    println(lowerdemon)


//    println(tim.weapon.name)

    tim.show()

    val healthPotion = Loot("Health Potion", LootType.POTION, 7.50)
    tim.inventory.add(healthPotion)
    tim.showInventory()

    val toxicPotion = Loot("Toxic Potion", LootType.POTION, 7.50)
    tim.inventory.add(toxicPotion)
    tim.showInventory()

    println(tim)
}

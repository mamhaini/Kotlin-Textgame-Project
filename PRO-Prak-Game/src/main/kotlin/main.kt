import kotlin.time.measureTimedValue

fun main(args: Array<String>) {
    val tim = Player("Tim", 4, 1, 0)

    val nichirinblade = Weapon("Nichirin Blade",15)

//    println(tim.weapon.name)
//    println(tim.weapon.damageInflicted)
3
   tim.weapon = nichirinblade

//    println(tim.weapon.name)
//    println(tim.weapon.damageInflicted)

//    val lowerdemon = Enemy("Lowerdemon", 2, 1 )

//    val claws = Weapon("Claws",18)

//    lowerdemon.weapon = claws

//    lowerdemon.show()
//    println(lowerdemon)


//    println(tim.weapon.name)

//    tim.show()

    val healthPotion = Loot("Health Potion", LootType.POTION, 7.50)
    tim.inventory.add(healthPotion)
//    tim.showInventory()

    val toxicPotion = Loot("Toxic Potion", LootType.POTION, 7.50)
    tim.inventory.add(toxicPotion)
//    tim.showInventory()

   // println(tim)

    println("Welkom bij onze Demon Slayer game!")
    println("Typ 1 om te beginnen...")
    println("")
    val start = readLine()?.toInt()

    if(start == 1){
        println("Prologue: Hotel")
        println()
        println("Je word wakker in een hotel, je denkt waarom ben ik hier? Maar je herinnert je waarom je daar bent. Je was naar  de markt gegaan om brood te halen voor je " +
                "famillie, nadat je terug kwam bij je huis, was je famillie vermoord door een demon! Je vond je zusje die de enige was die nog leefde van je famillie, helaas " +
                "was ze niet zoals eerst, want ze was veranderd in een demon, gelukkig was ze speciaal en niet zoals de andere demons want ze kon haar zelf beheersen, maar " +
                "hoelang dit zou volhouden wist je niet... enige manier om haar terug te veranderen is om de demon te vermoorden die je zusje heeft veranderd in een demon. Je " +
                "herinnert het je allemaal vaag en het voelt niet echt maar toch is het echt gebeurd...")
        println()
        println("Typ 1 om doortegaan...")
    }
    else {
        println("Verkeerde invoer, begin opnieuw.")

    }

    val level1 = readLine()?.toInt()
    if(level1 == 1){
        println("Level 1: Training")
        println()
        println("Je wilt de demons verslaan maar daarvoor moet je natuurlijk eerst voor trainen, je word niet zomaar sterk. Je hebt steroide pillen nodig om te beginnen ze zijn ergens in de kamer, zoek het.")
        println()
        println("1. Boekenkast")
        println("2. Kledingkast")
        println("3. Koelkast")
        println("4. Bureaulade")

    }
    else {
        println("Verkeerde invoer, begin opnieuw.")
   }

    val doorgaan = readLine()?.toInt()
    if(doorgaan == 1){
        println("Er is niks in de boekenkast, begin opnieuw.")
        println()
    }
    if(doorgaan == 2){
        println("Er is niks in de kledingkast, begin opnieuw")
        println()
    }
    if(doorgaan == 3){
        println("Goedzo, neem ze in door op 1 te klikken")
        println()
    }
    if(doorgaan == 4){
        println("Er is niks in de kledingkast, begin opnieuw")
        println()
    }
    val pillen = readLine()?.toInt()
    if(pillen == 1){
        println("Nadat je je steroide pillen ingenomen hebt ga je naar de mountains om te trainen, 1 jaar lang ga je trainen in de mountains met de zwaard die je gekregen hebt van je vader voordat die dood ging aan een ziekte...")
        println()
        println("Typ 1 om 1 jaar vooruit te gaan")
    }
    val timeskip = readLine()?.toInt()
    if(timeskip == 1){
        println("Na 1 jaar ben je eindelijk sterk genoeg en ben je officieel een Demon Slayer.")
        println()
    }





}

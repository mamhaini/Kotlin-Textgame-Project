import kotlin.time.measureTimedValue

fun main(args: Array<String>) {

//    val healthPotion = Loot("Health Potion", LootType.POTION, 7.50)
//    tim.inventory.add(healthPotion)

//    val toxicPotion = Loot("Toxic Potion", LootType.POTION, 7.50)
//    tim.inventory.add(toxicPotion)

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
        println("Goedzo, neem ze in door op 5 te klikken")
        println()
    }
    if(doorgaan == 4){
        println("Er is niks in de kledingkast, begin opnieuw")
        println()
    }
    val pillen = readLine()?.toInt()
    if(pillen == 5){
        println("Nadat je je steroide pillen ingenomen hebt ga je naar de mountains om te trainen, 1 jaar lang ga je trainen in de mountains met de zwaard die je gekregen hebt van je vader voordat die dood ging aan een ziekte...")
        println()
        println("Typ 1 om 1 jaar vooruit te gaan")
    }
    val timeskip = readLine()?.toInt()
    if(timeskip == 1){
        println("Na 1 jaar ben je eindelijk sterk genoeg en ben je officieel een Demon Slayer.")
        println()
        println("Typ 1 om doortegaan naar het volgende level...")
    }
    val level2 = readLine()?.toInt()
    if(level2 == 1){
        println("Level 2: Lower Demon")
        println()
        println("Na een vermoeide dag ga je terug naar huis en vind je een brief op de voordeur geplakt die er niet eerder was met de woorden: Gefeliciteerd met het " +
                "behalen van je nieuwe rang, ontmoet je teamgenoten aan de top van de oetoeloe berg. ")
        println()
        println("Typ 1 om doortegaan...")
        val verdergaan = readLine()?.toInt()
        if(verdergaan == 1){
            println("Je staat er even bij stil of dit een valstrik is of niet maar je kiest ervoor om toch te gaan omdat je even iets anders wilt doen dan trainen.")
            println()
            println("Onderweg naar de berg kom je een hindernis tegen, voor je neus zie je een demon die zichzelf de Blacka Dede noemt en jou niet door laat doorgaan.")
            println("Je bent aan het nadenken over wat zijn zwakste punt is en besluit een gok te wagen:")
            println()
            println("1. Buik")
            println("2. Nek")
            println("3. Hart")
            println("4. Rug")
        }
    }
    else {
        println("Verkeerde invoer, begin opnieuw.")
    }
    val gok = readLine()?.toInt()
    if(gok == 1){
        println("Je probeert een opening te vinden om voor zijn buik tegaan maar hij is je tijdens het denken voor, met een snelle beweging snijd hij je hoofd eraf.")
        println()
        println("Je bent dood, begin opnieuw")
    }
    if(gok == 2){
        println("Door je training weet je meteen dat de nek van een demon het meest effectief is dus ga je zonder te denken met een snelle beweging voor zijn nek.")
        println()
        println("Je hebt de demon verslagen, typ 5 om doortegaan naar het volgende level...")
    }
    if(gok == 3) {
        println("Je probeert voor zijn hart te gaan, daarna kom je er snel achter dat hij geen hart heeft... ")
        println()
        println("Je bent dood, begin opnieuw")
    }
    if(gok == 4){
        println("Je verstopt je en probeert stiekem van achter te komen, maar helaas heeft hij je al door.")
        println()
        println("Je bent dood, begin opnieuw")
    }
    val level3 = readLine()?.toInt()
    if(level3 == 5) {
        println("Level 3: Berg Oetoeloe")
        println("")
        println("Uiteindelijk kom je aan de top van de berg en ontmoet je andere demonslayers.")
        println("")
        println("Typ 1 om doortegaan...")
    }
    val berg = readLine()?.toInt()
    if(berg == 1) {
        println("Level 3: Berg Oetoeloe")
        println("")
        println("Je ziet een lange jonge met krullen die heel boos kijkt in de verte, je wilt hem aanspreken om te vragen wat er mis is. Opeens schreeuwt hij ''IK BEN JOGGO WATER, WAAR ZIJN MIJN BLACK AIRFORCES?!'' je vraagt aan hem wat er mis is en hij antwoord erop dat die zijn Black Airforces kwijt is... ")
        println("")
        println("Help Joggo Water met het zoeken naar zijn Black Airforces!")
        println("")
        println("1. Achter de boom")
        println("2. Achter een rots")
        println("3. In de struiken")
        println("4. In de rivier")
    }
    val kies = readLine()?.toInt()
    if(kies == 1){
        println("Achter de boom zat een beer, hij kleemt je vast en heeft je te pakken... begin opnieuw.")
        println("")
    }
    if(kies == 2){
        println("Achter de rots zat een grote leeuw, hij heeft je te pakken... begin opnieuw.")
        println("")
    }
    if(kies == 3) {
        println("Je hebt ze gevonden! Breng ze terug naar Joggo Water door 5 te typen!")
        println("")
    }
    if(kies == 4) {
        println("Je kan niet zwemmen! Je verdrinkt, begin opnieuw")
        println("")
    }
    val joggo = readLine()?.toInt()
    if(joggo == 5){
        println("Joggo Water schreeuwt DANKJEWEL! en hij zegt dat dit eigenlijk een test was, hij zocht een goede vriend die hem zou helpen, als beloning mag je de Black Airforces houden zegt die!")
        println("")
        println("Je doet de Black Airforces aan en je voelt je gelijk veel sterker en sneller! Nu kan je de Upper Demon aan!")
        println("")
        println("Typ 1 om doortegaan naar de volgende level...")
    }
    val zoektocht = readLine()?.toInt()
    if(zoektocht == 1) {
        println("Level 4: Zoektocht Upper Demon")
        println("")
    }

}

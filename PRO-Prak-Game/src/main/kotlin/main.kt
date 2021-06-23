import kotlin.time.measureTimedValue

fun main(args: Array<String>) {

    println("Welkom bij onze Demon Slayer game!")
    println("Typ 1 om te beginnen... \n")
    val start = readLine()?.toInt()

    if(start == 1){
        println("Prologue: Hotel \n")
        println("Je word wakker in een hotel, je denkt waarom ben ik hier? Maar je herinnert je waarom je daar bent. Je was naar  de markt gegaan om brood te halen voor je " +
                "famillie, nadat je terug kwam bij je huis, was je famillie vermoord door een demon! Je vond je zusje die de enige was die nog leefde van je famillie, helaas " +
                "was ze niet zoals eerst, want ze was veranderd in een demon, gelukkig was ze speciaal en niet zoals de andere demons want ze kon haar zelf beheersen, maar " +
                "hoelang dit zou volhouden wist je niet... enige manier om haar terug te veranderen is om de demon te vermoorden die je zusje heeft veranderd in een demon. Je " +
                "herinnert het je allemaal vaag en het voelt niet echt maar toch is het echt gebeurd...\n")
        println("Typ 1 om doortegaan...")
    }
    else {
        println("Verkeerde invoer, begin opnieuw.")

    }

    val level1 = readLine()?.toInt()
    if(level1 == 1){
        println("Level 1: Training\n")
        println("Je wilt de demons verslaan maar daarvoor moet je natuurlijk eerst voor trainen, je word niet zomaar sterk. Je hebt steroide pillen nodig om te beginnen ze zijn ergens in de kamer, zoek het.\n")
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
        println("Er is niks in de boekenkast, begin opnieuw.\n")
    }
    if(doorgaan == 2){
        println("Er is niks in de kledingkast, begin opnieuw\n")
    }
    if(doorgaan == 3){
        println("Goedzo, neem ze in door op 5 te klikken \n")
    }
    if(doorgaan == 4){
        println("Er is niks in de kledingkast, begin opnieuw\n")
    }
    val pillen = readLine()?.toInt()
    if(pillen == 5){
        println("Nadat je je steroide pillen ingenomen hebt ga je naar de mountains om te trainen, 1 jaar lang ga je trainen in de mountains met de zwaard die je gekregen hebt van je vader voordat die dood ging aan een ziekte...\n")
        println("Typ 1 om 1 jaar vooruit te gaan")
    }
    val timeskip = readLine()?.toInt()
    if(timeskip == 1){
        println("Na 1 jaar ben je eindelijk sterk genoeg en ben je officieel een Demon Slayer.\n")
        println("Typ 1 om doortegaan naar het volgende level...")
    }
    val level2 = readLine()?.toInt()
    if(level2 == 1) {
        println("Level 2: Lower Demon\n")
        println(
            "Na een vermoeide dag ga je terug naar huis en vind je een brief op de voordeur geplakt die er niet eerder was met de woorden: Gefeliciteerd met het " +
                    "behalen van je nieuwe rang, ontmoet je teamgenoten aan de top van de oetoeloe berg. \n "
        )
        println("Typ 1 om doortegaan...")

        val verdergaan = readLine()?.toInt()
        if(verdergaan == 1){
            println("Je staat er even bij stil of dit een valstrik is of niet maar je kiest ervoor om toch te gaan omdat je even iets anders wilt doen dan trainen.\n")
            println("Onderweg naar de berg kom je een hindernis tegen, voor je neus zie je een demon die zichzelf de Blacka Dede noemt en jou niet door laat doorgaan.")
            println("Je bent aan het nadenken over wat zijn zwakste punt is en besluit een gok te wagen:\n")
            println("1. Buik")
            println("2. Nek")
            println("3. Hart")
            println("4. Rug")
        }  else {
            println("Verkeerde invoer, begin opnieuw.")
        }
    }
    val gok = readLine()?.toInt()
    if(gok == 1){
        println("Je probeert een opening te vinden om voor zijn buik tegaan maar hij is je tijdens het denken voor, met een snelle beweging snijd hij je hoofd eraf.\n")
        println("Je bent dood, begin opnieuw")
    }
    if(gok == 2){
        println("Door je training weet je meteen dat de nek van een demon het meest effectief is dus ga je zonder te denken met een snelle beweging voor zijn nek.\n")
        println("Je hebt de demon verslagen, typ 5 om doortegaan naar het volgende level...")
    }
    if(gok == 3) {
        println("Je probeert voor zijn hart te gaan, daarna kom je er snel achter dat hij geen hart heeft... \n")
        println("Je bent dood, begin opnieuw")
    }
    if(gok == 4){
        println("Je verstopt je en probeert stiekem van achter te komen, maar helaas heeft hij je al door.\n")
        println("Je bent dood, begin opnieuw")
    }
    val level3 = readLine()?.toInt()
    if(level3 == 5) {
        println("Uiteindelijk kom je aan de top van de berg en ontmoet je andere demonslayers.\n")
        println("Typ 1 om doortegaan...")
    }  else {
        println("Verkeerde invoer, begin opnieuw.")
    }
    val berg = readLine()?.toInt()
    if(berg == 1) {
        println("Level 3: Berg Oetoeloe\n")
        println("Je ziet een lange jonge met krullen die heel boos kijkt in de verte, je wilt hem aanspreken om te vragen wat er mis is. Opeens schreeuwt hij ''IK BEN JOGGO WATER, WAAR ZIJN MIJN BLACK AIRFORCES?!'' je vraagt aan hem wat er mis is en hij antwoord erop dat die zijn Black Airforces kwijt is... \n")
        println("Help Joggo Water met het zoeken naar zijn Black Airforces!\n")
        println("1. Achter de boom")
        println("2. Achter een rots")
        println("3. In de struiken")
        println("4. In de rivier")
    }
    val kies = readLine()?.toInt()
    if(kies == 1){
        println("Achter de boom zat een beer, hij kleemt je vast en heeft je te pakken... begin opnieuw.\n")
    }
    if(kies == 2){
        println("Achter de rots zat een grote leeuw, hij heeft je te pakken... begin opnieuw.\n")
    }
    if(kies == 3) {
        println("Je hebt ze gevonden! Breng ze terug naar Joggo Water\n")
        println("Typ 5 om de schoenen aan Joggo Water te geven...")
    }
    if(kies == 4) {
        println("Je kan niet zwemmen! Je verdrinkt, begin opnieuw\n")
    }
    val joggo = readLine()?.toInt()
    if(joggo == 5){
        println("Joggo Water schreeuwt DANKJEWEL! en hij zegt dat dit eigenlijk een test was, hij zocht een goede vriend die hem zou helpen, als beloning mag je de Black Airforces houden!")
        println("Je doet de Black Airforces aan en je voelt je gelijk veel sterker en sneller! Nu kan je de Upper Demon aan!\n")
        println("Typ 1 om doortegaan naar de volgende level...")
    }  else {
        println("Verkeerde invoer, begin opnieuw.")
    }
    val level4 = readLine()?.toInt()
    if(level4 == 1) {
        println("Level 4: Zoektocht Upper Demon\n")
        println("Met deze nieuwe kracht besluit je op zoek tegaan naar meerdere sterke demons om wraak te nemen op wat ze jou familie hebben aangedaan.")
        println("Je hebt van Joggo Water tehoren gekregen dat er verderop naar het noorden een dorp is waar je meer informatie over de upper demons kan vinden . \n")
        println("Typ 1 om doortegaan...")
    }  else {
        println("Verkeerde invoer, begin opnieuw.")
    }
    val vervolg = readLine()?.toInt()
    if(vervolg == 1){
        println("Na een lange tocht zie je een dorp met een paar huizen maar geen spraak van leven.")
        println("Je besluit op alle deuren te kloppen en te roepen op hoop van een menselijke reactie.\n")
        println("Na ongeveer een minuut stilte hoor je meerdere geluiden, alleen klinken deze geluiden niet menselijk.")
        println("Al snel word je omsingeld door drie demons...\n")
        println("Na een snelle observering merk je dat deze demons zwakker zijn dan de vorige.\n")
        println("Typ 1 om doortegaan naar de confrontatie...")
    }  else {
        println("Verkeerde invoer, begin opnieuw.")
    }
    val omsingeld = readLine()?.toInt()
    if(omsingeld == 1){
        println("De demon die in het midden staat lijkt de leider van de 3 te zijn.")
        println("Je denkt even na en kiest dan welke van de drie demons je als eerst gaat aanvallen.\n")
        println("1. De linker")
        println("2. De Middelste")
        println("3. De rechter")
    }  else {
        println("Verkeerde invoer, begin opnieuw.")
    }
    val keuze = readLine()?.toInt()
    if(keuze == 1){
        println("Je denk dat het verstandiger is om als eerst voor de zwakste te gaan, tijdens je aanval word je van twéé kanten gepakt door de andere demons.\n")
        println("Je bent dood, begin opnieuw.")
    }
    if(keuze == 2){
        println("Door jou nieuwe schoenen van Joggo Water weet je dat je nu sterker bent en de beste optie is om gelijk voor de sterkste te gaan zodat het vervolg makkelijk zal zijn.")
        println("De leider van de demons besluit door zijn trots om alleen tegen je te vechten zonder hulp van de andere demons, dit blijkt geen goed idee te zijn omdat je hem uiteindelijk verslaat.\n")
        println("De andere twéé demons versla je hierna met een snelle beweging alsof ze niks zijn.\n")
        println("Je hebt de demons verslagen. Typ 5 om doortegaan naar het volgende level...")

    }
    if(keuze == 3) {
        println("Je besluit voor de rechter demon te gaan omdat je altijd rechts kiest.")
        println("Je leert al snel dat voor je intuïtie gaan niet altijd het handigst is omdat de andere twéé demons snel inspringen en je verslaan...\n")
        println("Je bent dood, begin opnieuw.")
    }
    val ontmoeting = readLine()?.toInt()
    if(ontmoeting == 5){
        println("Na het verslaan van de demons bedenk je dat iedereen in dit dorp is vermoord en het daarom leeg is.")
        println("Je besluit even tot rust te komen. alleen kort hierna hoor je een harde knal en besluit je te kijken wat er gebeurd is.\n")
        println("Bij de plek waar je de knal hoorden zie je een grote demon die zich één van de upper demons noemt.")
        println("Hij zegt dat hij van je tehoren gekregen heeft en dat hij zijn wraak nu zal nemen op wat je gedaan hebt met zijn mede demons.\n")
        println("Typ 1 om doortegaan naar het volgende level...")
    }else {
        println("Verkeerde invoer, begin opnieuw.")
    }

    val level5 = readLine()?.toInt()
    if(level5 == 1) {
        println("Level 5: Upper Demon\n")
        println("De Upper Moon noemt zichzelf Akaza, hij is een intelligente demon die in de top 5 ranking zit van alle demons. Zijn specialiteit is Martial Arts!")
        println("Je zoekt naar zijn zwakte maar het is duidelijk dat hij geen zwakte heeft, je ziet een toxic potion wat ervoor zorgt dat iemand verlamd raakt, pak je het op of ga je gelijk voor zijn nek?\n")
        println("1. Nek")
        println("2. Toxic Potion")
    }
    val akaza = readLine()?.toInt()
    if(akaza == 1) {
        println("Je gaat voor zijn nek, maar hij is te snel voor je en slaat je kop eraf met zijn vuisten!\n")
        println("Je bent dood, begin opnieuw.")
    }
    if(akaza == 2) {
        println("Slimme zet! Akaza is nog te snel voor je dus je moet hem wel verlammen!\n")
        println("Je moet op een van der manier het in zijn mond krijgen... je kunt het in zijn mond proberen te gooien of je kunt de potion in een needle stoppen en het in zijn mond schieten, wat kies je?\n")
        println("1. Potion gooien in Akaza's mond")
        println("2. Toxic potion en Needle combineren")
    }
    val akazav2 = readLine()?.toInt()
    if(akazav2 == 1) {
        println("Je gooit mis! Het vliegt in de lucht en daar ging je kans... Hij valt je aan en je bent dood...\n")
        println("Je bent dood, begin opnieuw!")
    }
    if(akazav2 == 2) {
        println("Slim van je! Je hebt 2 items gecombineerd namelijk de Toxic Potion en de Needle, nu heb je een Toxic Needle!\n")
        println("Typ 1 om het af te vuren in Akaza's mond!")
    }
    val akazav3 = readLine()?.toInt()
    if(akazav3 == 1) {
        println("Bullseye! Je hebt m! Hij is verlamd nu, snel! snel! snel!\n")
        println("Typ 1 om voor zijn nek te gaan!")
    }
    val akazav4 = readLine()?.toInt()
    if(akazav4 == 1) {
        println("Je trekt je zwaard en rent zo snel naar hem toe dat de luchtbarriere breekt! Je hebt m! Maar je hoorde iets raars voordat de Upper Demon dood ging, hij fluisterde iets met ''ga terug naar de top van het hotel waarin je begon... Muzan wacht op je daarop...''\n")
        println("Je dacht in jezelf Muzan? Wie is dat?... i-is hij de gene die mijn famillie had vermoord?! Je bloed begon te koken. Maar als de upper demon al zo sterk was wist je dat Muzan nog veel sterker zou zijn, je moest nog een laatste keer trainen voordat je hem aan kunt...")
        println("Typ 1 om naar het volgende level te gaan!")
    }
    val level6 = readLine()?.toInt()
    if(level6 == 1) {
        println("Level 6: Final Training\n")
        println("Je wist niet hoe je nog sterker moest worden dus ging je als eerst mediteren en dacht je aan je vader voordat hij dood ging aan een ziekte... ''JA DAT IS HET!'' zei je in je hoofd. Je vader had het altijd over een type van adem halen, het heette ''Sun Breathing'' door op deze manier adem te halen zou je lichaam vele malen sterker worden en sneller, je gaat dit leren door elke dag in het bos te mediteren")
        println("Typ 1 om naar het bos te gaan")
    }
    val level6v2 = readLine()?.toInt()
    if(level6v2 == 1) {
        println("Je ziet een vogel in het bos, je merkt een verschil in hoe hij ademt, ze ademen anders dan mensen, je probeert dit te imiteren of het enige effect heeft op je lichaam, maar het werkt niet... Je herinnert dat je vader altijd zei dat je natuur moet combineren met de mensheid, bedoeld die hiermee dat ik het moet combineren met mijn adem stijl en die van dieren? Zoals die vogel?\n")
        println("Je probeert het te combineren... na een aantal uur lukt het je om deze nieuwe tactiek volledig te gebruiken. Je bent klaar om je verleden onder ogen te zien.\n")
        println("Typ 1 om naar het laatste level te gaan!")
    }
    val level7 = readLine()?.toInt()
    if(level7 == 1) {
        println("Level 7: Muzan\n")
        println("Na een lange reis terug naar het hotel zie je een rood soort aura om het hele hotel heen.")
        println("Je denkt aan de laatste woorden dat de upper demon zei: 'Muzan wacht op je aan de top van het hotel'\n")
        println("Zonder hier langer bij stil te staan ren je binnen in het hotel en meteen de trap op naar de bovenste verdieping")
        println("Tijdens het omhoog gaan blijkt er geen spraak van demons te zijn.")
        println("Uiteindelijk kom je aan bij de laatste trap, je besluit voorzichtig naar boven te gaan en de deur te openen naar het dak.\n")
        println("Typ 1 om de deur te openen...")

    }
    val level7v2 = readLine()?.toInt()
    if (level7v2 == 1) {
        println("Je doet de deur voorzichtig open en ziet een man met zijn rug omgedraaid staan.")
        println("Zonder je aantekijken zegt hij: 'Ik heb op je gewacht.'")
        println("Hij begint te praten over je familie en dat het allemaal zijn plan was.\n")
        println("Wanneer je dit hoort word je kokend en overweeg je om hem meteen aan te vallen.")
        println("1. Aanvallen")
        println("2. Kalmeren")

    }  else {
        println("Verkeerde invoer, begin opnieuw.")
    }
    val aanval = readLine()?.toInt()
    if(aanval == 1){
        println("Je besluit Muzan meteen aantevallen zonder na te denken door de woeden in je en vormt hierdoor een zwarte aura om jezelf heen.")
        println("Muzan ontwijkt al je aanvallen omdat je slaat zonder te denken.")
        println("Hij zegt hierna: 'We blijken toch het zelfde te zijn en vermoord je met een snelle slag.'\n")
        println("Je bent dood, begin opnieuw.")
    }
    if(aanval == 2){
        println("Je besluit kalm te blijven en te denken aan je training.")
        println("Terwijl je begint met je ademhaling te matchen met de natuur merkt Muzan dit en gaat hij gelijk voor de aanval.")
        println("Met een snelle beweging springt hij naar je toe maar omdat je gefocused bent weet je net een stap opzij te zetten.")
        println("Je word geraakt door je schouder...\n")
        println("Je weet dat je moeilijk kan winnen met deze verwonding en denkt aan een paar opties om hier levend uit te komen.")
        println("1. Health Potion")
        println("2. Rugtas")

    }
    val optie = readLine()?.toInt()
    if(optie == 1){
        println("Je neemt je Health Potion in en voelt je gelijk beter dan hiervoor.")
        println("Je blijft kalm en denkt aan je ademhaling tijdens het vechten.\n")
        println("Typ 5 om door te gaan naar het laatste gevecht.")
    }
    if(optie == 2){
        println("Je besluit een wanhopige aanval te doen, je gooit je rugtas naar muzan toe.\n")
        println("Je bent dood, begin opnieuw.")
    }
    val level7v3 = readLine()?.toInt()
    if (level7v3 == 5) {
        println("Tijdens het vechten denk je aan een aantal mogelijkheden die je kunnen laten winnen.")
        println("1. Nek")
        println("2. Er over praten")
        println("3. Vader zijn aanval")

    }
    val optieV2 = readLine()?.toInt()
    if(optieV2 == 1){
        println("Je kiest ervoor om voor zijn nek te gaan omdat dat het meest effectieve plek is van demons.")
        println("Alleen kom je er snel achter dat muzan geen normale demon is en nadat je zwaard niet door zijn nek kan.\n")
        println("Je bent dood, begin opnieuw.")
    }
    if(optieV2 == 2){
        println("Je denkt dat alles opgelost kan worden door erover te praten.")
        println("Dit gaat helaas al snel fout. \n")
        println("Je bent dood, begin opnieuw.")
    }
    if(optieV2 == 3){
        println("Je herinnerd je een droom die je laatst had, een droom over je vader en zijn aanval.")
        println("Na het visualiseren van zijn aanval gloeien je ogen rood en komt er vuur over je zwaard heen.")
        println("Met een snelle mooie slag lukt het je om muzan zijn nek te snijden.\n")
        println("Je hebt Muzan verslagen en je familie gewroken!")
        println("Typ 5 voor de end screen...")
    }
    val end = readLine()?.toInt()
    if (end == 5) {
        println("Gefeliciteerd met het verslaan van Muzan en bedankt voor het spelen van ons spel! \n")
        println("Einde.")
    }


}

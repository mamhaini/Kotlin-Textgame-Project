enum class LootType {
    ARMOR, POTION, STEROIDE, GOUCH, BARRIERE, BACKPACK, NEZUKO, TOXICNEEDLE, BLACKAIRFORCES, REVIVE
}

class Loot(val name: String, val lootType: LootType, val value: Double) {

}
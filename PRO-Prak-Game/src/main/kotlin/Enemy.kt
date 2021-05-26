class Enemy(val name: String, var lives: Int = 3, var level: Int = 1) {
    var weapon = Weapon("Fist", 10 )
    val inventory = ArrayList<Loot>()

    fun show() {
        if (lives < 0){
            println("$name is dead!")
        }else {
            println("$name")
        }
    }

    override fun toString(): String {
        return """
            name:  $name
            life:  $lives
            level: $level
            weapon: ${weapon.name}
            damage: ${weapon.damageInflicted}
            """
    }

    fun showInventory(){
        println("$name's Inventory:")
        println(inventory.get(0))
        println("==============================")
    }
}
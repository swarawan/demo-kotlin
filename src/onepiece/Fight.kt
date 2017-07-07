package onepiece

/**
 * Created by rioswarawan on 7/7/17.
 */

class Fight {

    private var player1: Character? = null
    private var player2: Character? = null

    fun fightNow() {
//        if (randomNumber() % 2 == 0)

    }

    fun attack(character: Character) {
        println("Giliran selanjutnya...")
        println(character.name.toUpperCase())
        println("HP: " + character.hp)
        println("Mana: " + character.mana)
        for ((name, atk, mana) in character.skills)
            println("- $name (atk: $atk , mana: $mana  )")
        print("Pilih serangan: ")
        val selectedSkill = readLine().toString().toInt()
    }

    fun selectCharacter(player: Int, character: Character) {
        if (player == OnePiece._1)
            player1 = character
        else if (player == OnePiece._2)
            player2 = character
    }

    fun getPlayer1(): Character? {
        return player1
    }

    fun getPlayer2(): Character? {
        return player2
    }

    fun randomNumber(): Int {
        return (Math.random() * 100).toInt()
    }
}